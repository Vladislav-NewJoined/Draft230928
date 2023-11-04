package Task2_1_20_1;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task2_1_20_1_copy9_Video_Alex_Korolev {
}

class Main2 {
    public static void main(String[] args) {
        List<Animal2> animals = getAnimals();

//        // Старый подход (Императивный)
//        List<Animal2> predators = new ArrayList<>();
//        for (Animal2 animal : animals) {
//            if (animal.getClassification().equals(Classification.PREDATOR)) {
//                predators.add(animal);
//            }
//        }
//        predators.forEach(System.out::println);

        // Новый подход (Декларативный)
        // Filter
        List<Animal2> predators = animals.stream()
                .filter(animal2 -> animal2.getClassification().equals(Classification.PREDATOR))
                .collect(Collectors.toList());
//        predators.forEach(System.out::println);

        // Sort
        List<Animal2> sorted = animals.stream()
                .sorted(Comparator.comparing(Animal2::getAge))
                .collect(Collectors.toList());
        sorted.forEach(System.out::println);
    }

    private static List<Animal2> getAnimals() {
        return List.of(
                new Animal2("Слон", 20, Classification.HERBIVORE),
                new Animal2("Лев", 10, Classification.PREDATOR),
                new Animal2("Гиена", 11, Classification.PREDATOR),
                new Animal2("Жираф", 7, Classification.HERBIVORE),
                new Animal2("Гиббон", 35, Classification.OMNIVOROUS)

        );
    }
}

class Animal2 {
    private final String name;
    private final int age;
    private final Classification classification;

    public Animal2(String name, int age, Classification classification) {
        this.name = name;
        this.age = age;
        this.classification = classification;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Classification getClassification() {
        return classification;
    }

    @Override
    public String toString() {
        return "Animal2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", classification=" + classification +
                '}';
    }
}

enum Classification {
    HERBIVORE, PREDATOR, OMNIVOROUS
}