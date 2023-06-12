public class SmallGoods extends Goods {
    public SmallGoods(String initType, int initNum, int initPrice, String initDestination) {
        super(initType, initNum, initPrice, initDestination);
    }

    public int getCharge() {
        return 1000;
    }
}
