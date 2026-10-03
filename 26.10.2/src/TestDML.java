public class TestDML {
    public static void main(String[] args) {
       /*int insertRows = DBUtil.update(
                "INSERT INTO product(name, price, origin, stock) VALUES(?, ?, ?, ?)",
                "香蕉", 3.5, "广西", 50
        );
        System.out.println("插入行数：" + insertRows);

        int updateRows = DBUtil.update(
                "UPDATE product SET price = ? WHERE id = ?",
                9.9, 1
        );
        System.out.println("修改行数：" + updateRows);

        int deleteRows = DBUtil.update(
                "DELETE FROM product WHERE id = ?",
                3
        );
        System.out.println("删除行数：" + deleteRows);*/
        int farmerRows = DBUtil.update(
                "INSERT INTO farmer(name,phone,存款) VALUES(?,?,?)",
                "胡德","19192111245",522220.1
        );
        System.out.println(farmerRows);
    }
}