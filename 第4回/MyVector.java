public class MyVector {
    private double[] elements;
    static int count = 0; // インスタンス生成されたベクトルの総数
    
    public MyVector() {
        // ゼロ・ベクトル(0, 0)に初期化する．
        // elements, count ともに初期化すること．
        elements = new double[2];
        elements[0] = 0.0;
        elements[1] = 0.0;
        count++;
    }
       
    public MyVector(double x, double y) {
        // ベクトル (x, y) に初期化する．elements, count ともに初期化すること．
        elements = new double[2];
        elements[0] = x;
        elements[1] = y;
        count++;
    }
    
    MyVector constMult(double k) {
        // ベクトル（の各成分）を定数 (k) 倍にして返す
        MyVector v = new MyVector(elements[0], elements[1]);
        v.elements[0] *= k;
        v.elements[1] *= k;
        return v;
    }
    
    double getLength() {
        // ベクトルの大きさを返す
        return Math.sqrt(elements[0] * elements[0] + elements[1] * elements[1]);
    }
       
    boolean isEqual(MyVector v) {
        // ベクトル v と各成分が等しければ true, そうでなければ false を返す
        if (this.elements[0] == v.elements[0] && this.elements[1] == v.elements[1]) {
            return true;
        } else {
            return false;
        }
    }
       
    static int getNumVec( ) {
        // インスタンス生成されたベクトルの総数を返す
        return count;
    }
       
    void print() {
        // ベクトルの座標を (x, y) という形で表示する
        System.out.println("(" + elements[0] + ", " + elements[1] + ")");
    }
}
