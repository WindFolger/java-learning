public class farmer {
    private  Integer id;
    private  String name;
    private  String phone;
    private  Double balance;
    public farmer(){

    }
    public farmer(Integer id, String name, String phone, Double banlance) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.balance = banlance;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public Double getBalance() {
        return balance;
    }
    public void setBalance(Double balance) {
        this.balance = balance;
    }
    @Override
    public String toString() {
        return "Farmer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone:" + phone +
                ", balance:'" + balance + '\'' +
                '}';
    }

}
