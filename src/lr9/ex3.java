package lr9;

public class ex3 {
    private static int step = 0;

    public static void main(String[] args) {
        m(0);
    }

    public static void space() {
        for (int i = 0; i < step; i++) {
            System.out.print(" ");
        }
    }

    public static void m(int x) {
        space();
        System.out.println(" " + x + "->");
        step++;
        int next_int = 2 * x + 1;
        if (next_int < 20) {
            m(next_int);
        }
        step--;
        space();
        System.out.println(" " + x + "<-");
    }


}