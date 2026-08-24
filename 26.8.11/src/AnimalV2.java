/**
 * AnimalV2 - 动物基类 V2（多态版本）
 * 
 * 本类演示：
 * 1. 完整的封装：private 属性 + getter/setter
 * 2. 构造器重载：无参和有参构造器
 * 3. 为子类重写方法提供基础实现
 * 
 * 与 Animal 类的区别：
 * - 使用了更规范的英文方法命名
 * - 为后续多态和 instanceof 演示做准备
 */
public class AnimalV2 {
    /** 动物名称（私有，通过 getter/setter 访问） */
    private String name;
    
    /** 动物年龄 */
    private int age;
    
    /**
     * 有参构造器
     * @param name 动物名称
     * @param age 动物年龄
     */
    public AnimalV2(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    /**
     * 无参构造器
     * 为某些不需要初始化的场景提供默认构造器
     */
    public AnimalV2() {

    }
    
    // ========== Getter 和 Setter 方法 ==========
    
    public String getName() {
        return name;
    }
    
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
     * eat 方法：基础实现，子类通常会重写此方法
     */
    public void eat() {
        System.out.println(getName() + " is eating");
    }
    
    /**
     * sleep 方法：动物睡觉
     */
    public void sleep() {
        System.out.println(getName() + " is sleeping");
    }
}
