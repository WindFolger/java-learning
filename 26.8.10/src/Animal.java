/**
 * Animal - 动物基类（封装版本）
 * 
 * 本类演示：
 * 1. 封装（Encapsulation）：使用 private 修饰属性，隐藏内部细节
 * 2. 构造器（Constructor）：初始化对象的特殊方法
 * 3. getter/setter 方法：受控访问私有属性
 * 4. this 关键字：指代当前对象
 * 
 * 封装的好处：
 * - 保护数据不被随意修改
 * - 可以在 setter 中添加校验逻辑
 * - 便于后期维护和修改内部实现
 */
public class Animal {
    // private：私有访问权限，只能在类内部访问
    
    /** 动物名称 */
    private String name;
    
    /** 动物年龄 */
    private int age;
    
    /**
     * 无参构造器
     * 当没有定义任何构造器时，Java 会提供默认的无参构造器
     * 一旦定义了有参构造器，默认无参构造器就不存在了，需要手动定义
     */
    public Animal() {

    }
    
    /**
     * 有参构造器：创建对象时直接初始化属性
     * 
     * @param name 动物名称
     * @param age 动物年龄
     */
    public Animal(String name, int age) {
        // this.name 指代成员变量，name 指代参数
        // 当成员变量和参数同名时，用 this 区分
        this.name = name;
        this.age = age;
    }
    
    // ========== getter 方法：获取属性值 ==========
    
    public String getName() {
        return name;
    }
    
    // ========== setter 方法：设置属性值 ==========
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    /**
     * eat 方法：动物吃东西
     * 使用 getName() 获取名称，而不是直接访问 name（保持封装）
     */
    public void eat() {
        System.out.println(this.name + "吃东西");
    }
    
    /**
     * sleep 方法：动物睡觉
     */
    public void sleep() {
        System.out.println(this.name + "在睡觉");
    }
}
