package lr9;

import java.util.*;
import java.util.Collections;


public class word {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("one", 1);

        map.put("two", 2);


        Collections.sort(new ArrayList<>(map.values()));
    }
}
