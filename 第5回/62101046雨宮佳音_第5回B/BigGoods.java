public class BigGoods extends Goods {
    public BigGoods(String initType, int initNum, int initPrice, String initDestination) {
        super(initType, initNum, initPrice, initDestination);
    }
    
    public int getCharge() {
        return 5000;
    }
}
