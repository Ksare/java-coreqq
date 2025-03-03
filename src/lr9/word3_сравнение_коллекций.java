package lr9;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.TreeMap;

public class word3_сравнение_коллекций {
    private static final int SIZE = 1700000;
    private static final int LARGE_SIZE = 1700000000;
    private static final int MIDDLE_INDEX = SIZE / 2;

    public static void main(String[] args) {
        testAddFirst();
        testAddLast();
        testAddMiddle();
        testRemoveFirst();
        testRemoveLast();
        testRemoveMiddle();
        testGet();
    }

    private static void testRemoveMiddle() {
    }

    private static void testRemoveLast() {

    }

    private static void testRemoveFirst() {

    }

    private static void testAddMiddle() {

    }

    private static void testAddFirst() {

        System.out.println("\nТестирование добавления в начало:");

        testArrayDequeAddFirst();
        testArrayListAddFirst();
        testTreeMapAddFirst();
    }

    private static void testArrayDequeAddFirst() {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        long start = System.nanoTime();
        for (int i = 0; i < SIZE; i++) {
            deque.addFirst(i);
        }
        long end = System.nanoTime();
        System.out.printf("ArrayDeque: %.2f секунд%n", (end - start) / 1e9);
    }

    private static void testArrayListAddFirst() {
        ArrayList<Integer> list = new ArrayList<>();
        long start = System.nanoTime();
        for (int i = 0; i < SIZE; i++) {
            list.add(0, i);
        }
        long end = System.nanoTime();
        System.out.printf("ArrayList: %.2f секунд%n", (end - start) / 1e9);
    }

    private static void testTreeMapAddFirst() {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        long start = System.nanoTime();
        for (int i = 0; i < SIZE; i++) {
            map.put(i, i);
        }
        long end = System.nanoTime();
        System.out.printf("TreeMap: %.2f секунд%n", (end - start) / 1e9);
    }

    // Аналогичные методы для других операций...

    private static void testAddLast() {
        System.out.println("\nТестирование добавления в конец:");

        testArrayDequeAddLast();
        testArrayListAddLast();
        testTreeMapAddLast();
    }

    private static void testTreeMapAddLast() {

    }

    private static void testArrayListAddLast() {

    }

    private static void testArrayDequeAddLast() {

    }



    private static void testGet() {
        System.out.println("\nТестирование получения по индексу:");

        testArrayDequeGet();
        testArrayListGet();
        testTreeMapGet();
    }

    private static void testTreeMapGet() {

    }

    private static void testArrayListGet() {

    }

    private static void testArrayDequeGet() {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < LARGE_SIZE; i++) {
            deque.addLast(i);
        }
        long start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            deque.getLast();
        }
        long end = System.nanoTime();
        System.out.printf("ArrayDeque: %.2f секунд%n", (end - start) / 1e9);
    }
}
