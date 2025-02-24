package lr7;

public class ex5 {
    public static void main(String[] args) {
        BaseClass baseClass = new BaseClass("Базовый класс");
        DerivedClass1 derivedClass1 = new DerivedClass1("Первый производный класс", 42);
        DerivedClass2 derivedClass2 = new DerivedClass2("Второй производный класс", 'З');

        System.out.println(" Вывод информации:");
        baseClass.showInfo();
        derivedClass1.showInfo();
        derivedClass2.showInfo();

        System.out.println("\n Вызов showInfo() через переменную BaseClass");
        BaseClass ref1 = derivedClass1;
        ref1.showInfo(); // Вызовется переопределенный метод из DerivedClass1

        BaseClass ref2 = derivedClass2;
        ref2.showInfo(); // Вызовется переопределенный метод из DerivedClass2
    }

    public static class BaseClass {
        private String textField;

        public BaseClass(String textField) {
            this.textField = textField;
        }

        public void showInfo() {
            System.out.println("Class: BaseClass, textField: " + textField);
        }

        public String getTextField() {
            return textField;
        }
    }

    public static class DerivedClass1 extends BaseClass {
        protected int intField;

        public DerivedClass1(String textField, int intField) {
            super(textField);
            this.intField = intField;
        }

        @Override
        public void showInfo() {
            System.out.println("Class: DerivedClass1, textField: " + getTextField() + ", intField: " + intField);
        }
    }

    public static class DerivedClass2 extends BaseClass {
        protected char charField;

        public DerivedClass2(String textField, char charField) {
            super(textField);
            this.charField = charField;
        }

        @Override
        public void showInfo() {
            System.out.println("Class: DerivedClass2, textField: " + getTextField() + ", charField: " + charField);
        }
    }
}

