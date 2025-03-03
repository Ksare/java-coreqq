package lr9;

import java.util.ArrayList;

public class word2 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Первый элемент");
        list.add(1, "Второй элемент");
        String element = list.get(0);
        list.remove(1);

        for (String s : list) {
            System.out.println(s);
        }
    }
}