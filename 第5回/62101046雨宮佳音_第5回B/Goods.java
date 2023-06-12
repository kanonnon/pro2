import java.util.Locale.Category;

public abstract class Goods {
    private String type;
    private int num;
    private int price;
    private String destination;

    public Goods(String initType, int initNum, int initPrice, String initDestination) {
        type = initType;
        num = initNum;
        price = initPrice;
        destination = initDestination;
    }

    public String getType() {
        return type;
    }

    public int getNum() {
        return num;
    }

    public int getPrice() {
        return price;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String newDestination) {
        destination = newDestination;
    }

    public void setNum(int newNum) {
        num = newNum;
    }

    public int getTotalPrice() {
        return num * price;
    }

    public void print() {
        System.out.println("荷物の種類：" + type + ", 個数：" + num + "");
    }

    abstract int getCharge();
}
