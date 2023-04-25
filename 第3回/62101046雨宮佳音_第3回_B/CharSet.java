public class CharSet {
    private char[] array;

    public void init() {
        array = new char[]{'0', '0', '0', '0'};
    }

    public int count() {
        int count = 0;
        for (char c: array) {
            if (c != '0') {
                count++;
            }
        }
        return count;
    }

    public boolean search(char x) {
        for (char c: array) {
            if (c == x) {
                return true;
            }
        }
        return false;
    }

    public void add(char x) {
        if (search(x)) {
            return;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == '0') {
                array[i] = x;
                return;
            }
        }
        array[0] = x;
    }

    public void remove(char x) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                array[i] = '0';
            }
        }
    }
}
