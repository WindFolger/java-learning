@echo off
setlocal enabledelayedexpansion
chcp 65001 >nul

echo ==========================================
echo  第一步：软回退到图二状态
echo ==========================================
git reset --soft 7d555dd
if errorlevel 1 (
    echo 回退失败，请确认在仓库根目录下
    pause
    exit /b 1
)
echo 回退成功
echo.

:: 提取所有被修改的顶级文件夹（去重）
git diff --cached --name-only > __files.txt

set "total=0"
for /f "usebackq delims=" %%a in (`type __files.txt`) do (
    for /f "delims=/\" %%b in ("%%a") do (
        set "folder=%%b"
        if not exist "__done_%%b.tmp" (
            echo. > "__done_%%b.tmp"
            set /a total+=1
        )
    )
)

echo 共发现 %total% 个文件夹需要分批提交
echo.

set "done=0"
for /f "usebackq delims=" %%a in (`type __files.txt`) do (
    for /f "delims=/\" %%b in ("%%a") do (
        set "folder=%%b"
        if exist "__done_%%b.tmp" (
            del "__done_%%b.tmp" >nul 2>&1
            
            set /a done+=1
            echo ==========================================
            echo [%done%/%total%] 正在处理: !folder!
            
            :: 关键修复：清空暂存区，确保只提交当前文件夹
            git reset >nul 2>&1
            
            :: 查询该文件夹原来的提交信息（写入文件再读取，避免Windows命令解析问题）
            git log -1 --format=%%s -- "!folder!" > __msg.txt 2>nul
            
            set "msg="
            for /f "usebackq delims=" %%m in (`type __msg.txt`) do (
                set "msg=%%m"
                goto :gotmsg
            )
            :gotmsg
            del __msg.txt >nul 2>&1
            
            if "!msg!"=="" set "msg=更新 !folder!"
            
            echo 使用提交信息: !msg!
            
            :: 只添加当前文件夹，然后提交
            git add "!folder!" >nul 2>&1
            git commit -m "!msg!" >nul 2>&1
            
            if errorlevel 1 (
                echo [失败] 提交出错
            ) else (
                echo [成功]
            )
            echo.
        )
    )
)

:: 清理临时文件
del __files.txt >nul 2>&1
if exist __done_*.tmp del __done_*.tmp >nul 2>&1
if exist __msg.txt del __msg.txt >nul 2>&1

echo ==========================================
echo  完成！共提交 %done% 个文件夹
echo ==========================================
echo.
echo 最后执行推送命令：
echo   git push --force origin main
echo.
pause