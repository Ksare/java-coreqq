package lr6;

import lr5.ex6;

public class ex1 {
    public static class ClassEx1{
        private char symbolField;
        private String textField;

        // Перегруженный метод для присваивания значения символу
        public void setField(char symbol) {
            this.symbolField = symbol;
            System.out.println("Символьное поле обновлено: " + symbolField);
        }

        // Перегруженный метод для присваивания значения текстовому полю
        public void setField(String text) {
            this.textField = text;
            System.out.println("Текстовое поле обновлено: " + textField);
        }

        // Перегруженный метод для работы с массивом символов
        public void setField(char[] charArray) {
            if (charArray.length == 1) {
                // Если массив содержит один элемент, присваиваем символ символному полю
                this.symbolField = charArray[0];
                System.out.println("Символьное поле обновлено (из массива): " + symbolField);
            } else {
                // Если массив содержит больше одного элемента, формируем строку и присваиваем текстовому полю
                this.textField = new String(charArray);
                System.out.println("Текстовое поле обновлено (из массива): " + textField);
            }
        }

        // Метод для отображения текущих значений полей
        public void displayFields() {
            System.out.println("Символьное поле: " + symbolField + ", Текстовое поле: " + textField);
        }

        // Основной метод для тестирования
        public static void main(String[] args) {
            ClassEx1 handler = new ClassEx1();

            // Присваиваем символное значение
            handler.setField('A');
            handler.displayFields();

            // Присваиваем текстовое значение
            handler.setField("Hello, World!");
            handler.displayFields();

            // Присваиваем массив из одного символа
            handler.setField(new char[]{'B'});
            handler.displayFields();

            // Присваиваем массив из нескольких символов
            handler.setField(new char[]{'H', 'e', 'l', 'l', 'o'});
            handler.displayFields();
        }
    }

}

