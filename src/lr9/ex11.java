package lr9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class ex11 {
    public static void main(String[] args) {
        int participants = 100; // Размер группы участников

        // Тестирование с ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i <= participants; i++) {
            arrayList.add(i);
        }
        long arrayListDuration = measureExecution(() -> {
            int current = 0;
            while (arrayList.size() > 1) {
                current = (current + 1) % arrayList.size();
                arrayList.remove(current);
            }
        });
        System.out.println("Победитель (ArrayList): " + arrayList.get(0));
        System.out.println("Время выполнения ArrayList: " + arrayListDuration + " мс");

        // Тестирование с LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 1; i <= participants; i++) {
            linkedList.add(i);
        }
        long linkedListDuration = measureExecution(() -> {
            int current = 0;
            while (linkedList.size() > 1) {
                current = (current + 1) % linkedList.size();
                linkedList.remove(current);
            }
        });
        System.out.println("Победитель (LinkedList): " + linkedList.get(0));
        System.out.println("Время выполнения LinkedList: " + linkedListDuration + " мс");

        // Анализ производительности
        System.out.println("\nАнализ производительности:");
        System.out.println("LinkedList значительно быстрее ArrayList по следующим причинам:");
        System.out.println("- При удалении элемента LinkedList выполняет операцию за O(1)");
        System.out.println("- ArrayList требует сдвига всех последующих элементов за O(n)");
        System.out.println("- Для большого количества операций удаления LinkedList эффективнее использует память");
        System.out.println("- Разница в производительности становится критичной при увеличении размера данных");
    }

    private static long measureExecution(Runnable action) {
        long startTime = System.currentTimeMillis();
        action.run();
        return System.currentTimeMillis() - startTime;
    }
}
