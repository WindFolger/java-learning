/**
 * Box - 泛型类演示
 * 
 * 本类演示 Java 泛型（Generics）的核心概念：
 * 
 * 1. 泛型类：class Box<T>
 *    - T 是类型参数，代表任意类型
 *    - 使用时指定具体类型，如 Box<String>、Box<Integer>
 * 
 * 2. 泛型的好处：
 *    - 类型安全：编译时检查类型，避免运行时类型错误
 *    - 无需强制类型转换
 *    - 代码复用：一个类处理多种类型
 * 
 * 3. 常见类型参数命名：
 *    - T：Type（类型）
 *    - E：Element（元素）
 *    - K：Key（键）
 *    - V：Value（值）
 * 
 * @param <T> 泛型参数，表示 Box 中存储的数据类型
 */
public class Box<T> {
    
    /** 存储的数据，类型为 T */
    private T data;
    
    /** 无参构造器 */
    public Box() {}
    
    /**
     * 有参构造器
     * @param data 初始数据
     */
    public Box(T data) {
        this.data = data;
    }
    
    /**
     * 获取数据
     * @return 当前存储的数据
     */
    public T getData() {
        return data;
    }
    
    /**
     * 设置数据
     * @param data 要存储的数据
     */
    public void setData(T data) {
        this.data = data;
    }
    
    /**
     * 重写 toString 方法
     */
    public String toString() {
        return "Box [data=" + data + "]";
    }
}
