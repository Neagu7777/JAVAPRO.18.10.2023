import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
/*
У МЕНЯ НЕ ВЫВОДИТ НА ЭКРАН НИЧЕГО, ЧТО НЕ ТАК?
 */
        // Создание списка людей
        List<Human> people = new ArrayList<>();
        Human mother1 = new Human("Anna",28);
        Human mother2 = new Human("Aleksandra", 40);
        Human mother3 = new Human("Natalia", 20);
        Human mother4 = new Human("Maria", 23);

        Human father1 = new Human("Viktor", 30);
        Human father2 = new Human("Nikolai", 45);
        Human father3 = new Human("Sergei", 22);
        Human father4 = new Human("Mihail", 25);



        people.add(mother1);
        people.add(mother2);
        people.add(mother3);
        people.add(mother4);

        people.add(father1);
        people.add(father2);
        people.add(father3);
        people.add(father4);


        List<Human> allParents = people.stream()
                .flatMap(person -> Stream.of(person.getMother(), person.getFather()))
                .filter(Objects::nonNull)
                .toList();

        // Стрим для нахождения имен матерей тех людей, которые старше 25 лет
        List<String> mothersOfElders = people.stream()
                .filter(Objects::nonNull)
                .filter(person -> person.getMother() != null)
                .filter(person -> person.getAge() > 25)
                .map(person -> person.getMother().getName())
                .toList();

        // Вывод результатов
        System.out.println("ВСЕ родители ВСЕХ людей: " + allParents);
        System.out.println("Имена матерей людей старше 25 лет: " + mothersOfElders);
    }
}
