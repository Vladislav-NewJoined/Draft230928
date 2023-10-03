public class Draft_Task2_1_1_0_Whole_Video {

    static int catSayCounter = 0;

    public static void main(String[] args) {

        System.out.println("""
                Задание:\s
                5. Задание в рамках интерфейса java нужно создать калькулятор выполняющий 4
                   основных арифметических функций, сложение, вычитание, деление,
                   умножение, а также осуществить вывод на результатов на экран

                Решение:\s""");

//        Cat cat = new Cat();
//        Dog dog = new Dog();
//        Duck duck = new Duck();
//        cat.say();
//        dog.say();
//        duck.say();

        Animal cat = new Animal() {
            @Override
            public void say() {
//                super.say();
                System.out.println("mew");
                catSayCounter++;
                System.out.println(catSayCounter);
            }
        };

        Animal dog = new Animal() {
            @Override
            public void say() {
//                super.say();
                System.out.println("gav");
            }
        };

        Animal duck = new Animal() {
            @Override
            public void say() {
//                super.say();
                System.out.println("krya");
            }
        };

        cat.say();
        dog.say();
        duck.say();
    }
}



//class Animal {
//    public void say() {
//        System.out.println("something say");
//    }
//}

interface Animal {
    void say();
}

//class Cat extends Animal {
//    public void say() {
//        System.out.println("mew");
//    }
//}
//
//class Dog extends Animal {
//    public void say() {
//        System.out.println("gav");
//    }
//}
//
//class Duck extends Animal {
//    public void say()     {
//        System.out.println("krya");
//    }
//}

interface Operation {
    void calculate(int a, int b);

}