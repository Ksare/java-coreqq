package lr9;

class ListElement {
    public int elementValue;
    public ListElement nextElement;

    ListElement(int value, ListElement next) {
        this.elementValue = value;
        this.nextElement = next;
    }



    public static void main(String args[]) {
        ListElement element3 = new ListElement(3, null);
        ListElement element2 = new ListElement(2, element3);
        ListElement element1 = new ListElement(1, element2);
        ListElement head = new ListElement(0, element1);

        ListElement current = head;

        System.out.print("Элементы списка: ");
        while (current != null) {
            System.out.print(current.elementValue + " ");
            current = current.nextElement;
        }
    }
}



