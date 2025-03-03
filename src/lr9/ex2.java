package lr9;

public class ex2 {
    public static void m(int x) {
        int next_int = 2 * x + 1;
        if (next_int < 20) {
            m(next_int);
        }

        System.out.println("x=" + x);
    }

    public static void main(String[] args) {
        m(0);
    }

}
