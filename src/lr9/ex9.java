package lr9;

public class ex9 {
    public int value;
    public ex9 next;

    ex9(int value, ex9 next) {
        this.value = value;
        this.next = next;
    }

    public static void main(String[] args) {
                // Создание списка с головы
                ex9 head = null;
                for (int i = 9; i >= 0; i--) {
                    head = new ex9(i, head);
                }

                System.out.println("Список с головы: ");
                ex9 ref = head;
                while (ref != null) {
                    System.out.print(" " + ref.value);
                    ref = ref.next;
                }

                System.out.println("\nСписок с хвоста: ");

                // Создание списка с хвоста
                ex9 tailHead = null;
                ex9 tail = null;
                for (int i = 0; i <= 9; i++) {
                    ex9 newNode = new ex9(i, null);
                    if (tailHead == null) {
                        tailHead = newNode;
                        tail = newNode;
                    } else {
                        tail.next = newNode;
                        tail = newNode;
                    }
                }

                // Переворачиваем список с хвоста
                ex9 prev = null;
                ex9 current = tailHead;
                ex9 next;

                while (current != null) {
                    next = current.next;
                    current.next = prev;
                    prev = current;
                    current = next;
                }

                // Теперь prev указывает на новый head перевернутого списка
                tailHead = prev;

                ref = tailHead;
                while (ref != null) {
                    System.out.print(" " + ref.value);
                    ref = ref.next;
                }
            }
        }