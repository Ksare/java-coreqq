package lr9;

public class ex5 {
    public static void main(String[] args) {
        fib(5, 0);
    }



    public static int fib(int n, int tabs) {
        space(tabs);
        System.out.println("fib(" + n + ")");

        if (n == 0 || n == 1) {
            return n;
        } else {
            return fib(n - 1, tabs + 1) + fib(n - 2, tabs + 1);
        }
    }


    public static void space(int step) {
        for (int i = 0; i < step; i++) {
            System.out.print("\t");
        }
    }

}

