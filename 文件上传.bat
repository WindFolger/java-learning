chcp 65001
@echo off
cd /d D:\JV
git add .
git commit -m "%date%: daily java learning"
git push origin main
echo 上传完成！
pause