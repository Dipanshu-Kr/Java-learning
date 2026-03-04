public class ClearIthBit {

    public static int clearIthBit(int n, int pos) {
        int bitmask = ~(1 << pos);
        return n & bitmask;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(clearIthBit(n, 1));
    }
}
