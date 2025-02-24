package lr7;

public class ex1 {
    public static void main(String[] args){

        SuperClass superClass =
                new SuperClass(" Создаем супер класс ");
        System.out.println(superClass);

        SubClass subClass1 =
                new SubClass(" Наследование супер класса ");
        System.out.println(subClass1);

        SubClass subClass2 =
                new SubClass(" Наследование подкласса ");
        System.out.println(subClass2);
    }

    public static class SuperClass{

        private String str1;

        public SuperClass(String str1){
            this.str1 = str1;
        }

        public String getstr1(){
            return str1;
        }

        @Override
        public String toString(){
            return "SuperClass{" + "str1 =" + str1 + '\''+'}';
        }
    }

    public static class SubClass extends SuperClass{
        private String str2;
        public SubClass(String str1){
            super(str1);
        }

        public SubClass(String str1, String str2){
            super(str1);
            this.str2 = str2;
        }

        public String getstr2(){
            return str2;
        }

        @Override
        public String toString(){
            return "SubClass{" + "str1 =" + getstr1()+'\'' + ", str2 =" + str2 + '\'' + '}';
        }
    }
}