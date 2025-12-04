package p1;

public class P1_main {
    public static void multFrac(int z1, int n1, int z2, int n2) {
        int zRes = z1*z2;
        int nRes = n1*n2;
        System.out.println(zRes+":"+nRes);
    }

    public static void main(String[] args) {
        multFrac(5, 2, 3, 4);
    }
}