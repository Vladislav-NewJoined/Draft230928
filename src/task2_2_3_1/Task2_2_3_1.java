package task2_2_3_1;

public class Task2_2_3_1 {
    public static void main(String[] args) {
        System.out.println("""
                Задание:\s
                Модуль 2. Тема 2. Урок 3. Многопоточность. Synchronised.
                    Задание 1. Опишите своими словами, как вы поняли что такое синхронизация
                    потоков в JAVA, а также, что узнали об операторе Synchronised?

                Решение:\s""");

        System.out.println("Синхронизация (или блокировка/блокировки). делает возможным взаимодействие разных " +
                "потоков путем совместного доступа к полям объектов и полям ссылок " +
                "на объекты в потоках. Оператор synchronized используется для обеспечения " +
                "контроля доступа к общим ресурсам в многопоточной среде. Он гарантирует, " +
                "что в данный момент времени только один поток имеет доступ к блоку кода " +
                "или методу, помеченному как synchronized. При создании потоков в круглых " +
                "скобках можно указать некий объект, а в фигурных скобках некое действие, " +
                "которое производится над этим объектом, и, для предотвращения конфликтов " +
                "этих действий из разных потоков, применяется оператор synchronized.");
    }
}
