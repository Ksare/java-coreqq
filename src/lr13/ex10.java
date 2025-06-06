package lr13;

public class ex10 {
    public static int m() {
        int result;
        try {
            System.out.println("0");
            result = 15;
        } finally {
            System.out.println("1");
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(m());
    }
}

