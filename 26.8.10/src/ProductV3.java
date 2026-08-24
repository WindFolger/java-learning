/**
 * ProductV3 - 商品类 V3（继承 Goods）
 * 
 * 本类演示：
 * 1. 继承：extends Goods 获得父类的 name 和 price
 * 2. super 关键字：调用父类构造器 super(name, price)
 * 3. 方法重写（Override）：扩展父类的 getInfo 方法
 * 
 * 继承扩展：在父类基础上增加 origin（产地）和 stock（库存）属性
 */
public class ProductV3 extends Goods {
    /** 商品产地（子类新增属性） */
    String origin;
    
    /** 商品库存（子类新增属性） */
    int stock;

    /**
     * 构造器：调用父类构造器初始化 name 和 price，再初始化自己的属性
     * 
     * @param name 商品名称
     * @param price 商品价格
     * @param origin 商品产地
     * @param stock 商品库存
     */
    public ProductV3(String name, double price, String origin, int stock) {
        // super 必须位于构造器第一行，调用父类构造器
        super(name, price);
        
        // 初始化子类自己的属性
        this.origin = origin;
        this.stock = stock;
    }

    /**
     * 重写父类的 getInfo 方法
     * 在父类信息基础上追加产地和库存信息
     * 
     * @Override 是注解，表示此方法重写了父类方法
     * @return 完整的商品信息字符串
     */
    @Override
    public String getInfo() {
        // super.getInfo() 调用父类的 getInfo 方法获取基础信息
        return super.getInfo() + "，产地：" + origin + "，库存：" + stock + "件";
    }
}
