public class Truck extends Car {
    private Goods[] cargo;
    private int cargoCount = 0;

    public Truck(int x) {
        cargo = new Goods[x];
    }

    public void addGoods(Goods new_goods) {
        for (int i = 0; i < cargoCount; i++) {
            if (new_goods.getType() == cargo[i].getType() && new_goods.getPrice() == cargo[i].getPrice() && new_goods.getDestination() == cargo[i].getDestination()) {
                cargo[i].setNum(cargo[i].getNum() + new_goods.getNum());
                return;
            }
        }
        cargo[cargoCount] = new_goods;
        cargoCount++;
    }

    public int totalCargoValue() {
        int totalValue = 0;
        for (int i = 0; i < cargoCount; i++) {
            totalValue += cargo[i].getTotalPrice();
        }
        return totalValue;
    }

    public int getTotalCharge() {
        int totalCharge = 0;
        for (int i = 0; i < cargoCount; i++) {
            totalCharge += cargo[i].getCharge();
        }
        return totalCharge;
    }

    public void showStatus() {
        for (int i = 0; i < cargoCount; i++) {
            System.out.println("荷物の種類: " + cargo[i].getType() + "  数: " + cargo[i].getNum() + "  単価: " + cargo[i].getPrice() + "  送り先: " + cargo[i].getDestination());
        }
        System.out.println("全荷物の総金額: " + this.totalCargoValue());
        System.out.println("総運送量: " + this.getTotalCharge());
    }
}
