package lr7;

public class ex2 {
    public static void main(String[] args) {
        SuperClass superClass =
                new SuperClass("супер класс");

        System.out.println("Параметр: " + superClass.getTextField());
        System.out.println("Длина текстовой строки : " + superClass.getTextLength());

        SubClass subClass =
                new SubClass(15, "подкласс");

        System.out.println("Текстовый параметр подкласса: " + subClass.getTextField());
        System.out.println("Целочисленный параметр покласса: " + subClass.getIntField());
        System.out.println("Символьный параметр подкласса : " + subClass.getTextLength());

        subClass.setTextField();
        System.out.println("Подкласс с изменением : " + subClass.getTextField());

        subClass.setTextField("Подкласс 2");
        System.out.println("Подкласс  + setTextField(\"новый подкласс\"): " + subClass.getTextField());

        subClass.setTextField("Текст подкласса", 40);


        System.out.println("Число подкласса: " + subClass.getIntField());

        System.out.println("Текст подкласса после setTextField(\"Текст подкласса\", 40): " + subClass.getTextField());
        System.out.println("Число подкласса после setTextField(\"Число подкласса\", 30): " + subClass.getIntField());
    }

    public static class SuperClass {

        private String textField;

        public SuperClass(String textField) {
            this.textField = textField;
        }

        public void setTextField(String textField) {
            this.textField = textField;
        }

        public int getTextLength() {//получение количества символов строки
            return textField != null ? textField.length() : 0;
        }

        public String getTextField() {//возвращает текстовое поле
            return textField;
        }
    }

    public static class SubClass extends SuperClass {//подкласс

        public int intField;

        public SubClass(int intField, String textField) {
            super(textField);
            this.intField = intField;
        }


        public void setTextField() {
            super.setTextField("Измененный подкласс");
        }

        public void setTextField(String textField) {
            super.setTextField(textField);
        }

        public void setTextField(int intField) {
            this.intField = intField;
        }

        public void setTextField(String textField, int intField) {
            super.setTextField(textField);
            this.intField = intField;
        }

        public int getIntField() {
            return intField;
        }
    }
}

