package lr4;

public class ex2 {
    public static void main(String[] args) {
        int height = 11;
     //цикл просто увеличивает кол-во звёздочек пока i меньше высоты
      for (int i = 0; i < height; i++) {
          for (int j = 0; j <= i; j++) {
              System.out.print(" *");
          }
          System.out.println();
      }
    }
}
