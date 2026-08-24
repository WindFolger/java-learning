//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。

/**
 * Main - IntelliJ IDEA 自动生成的入口类
 * 
 * 这是 IDEA 创建新项目时自动生成的模板类，
 * 展示了 for 循环和格式化输出的基本用法。
 */
void main() {
    //TIP 当文本光标位于高亮显示的文本处时按 <shortcut actionId="ShowIntentionActions"/>
    // 查看 IntelliJ IDEA 建议如何修正。
    
    // String.format() 用于格式化字符串，与 C 语言的 printf 类似
    IO.println(String.format("Hello and welcome!"));

    // for 循环：初始化 i=1，条件 i<=5，每次循环后 i 自增 1
    // 这是一种"确定次数"的循环，适合已知循环次数的场景
    for (int i = 1; i <= 5; i++) {
        //TIP 按 <shortcut actionId="Debug"/> 开始调试代码。我们已经设置了一个 <icon src="AllIcons.Debugger.Db_set_breakpoint"/> 断点
        // 但您始终可以通过按 <shortcut actionId="ToggleLineBreakpoint"/> 添加更多断点。
        
        // 字符串拼接：使用 + 号将字符串和变量连接在一起
        IO.println("i = " + i);
    }
}
