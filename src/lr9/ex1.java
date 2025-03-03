package lr9;

public class ex1 {

    public static void m(int x) {

        System.out.println("x=" + x);
        int next_int = 2 * x + 1;
        if (next_int < 20) {

                m(next_int);
            }
        }

    public static void main(String[] args) {
        m(0);
    }
    }



