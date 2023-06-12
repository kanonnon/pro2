public class MediumGoods extends Goods {
    public MediumGoods(String initType, int initNum, int initPrice, String initDestination) {
        super(initType, initNum, initPrice, initDestination);
    }

    public int getCharge() {
        return 3000;
    }
}
