import java.util.Objects;

/*
 1 уровень сложности: В отдельном проекте создайте класс Human

У этого класса должны быть поля:
String name; - имя
Human mother; - мать
Human father; - отец
int age; - возраст

Создайте список людей.

Теперь создайте два стрима
1) Находит ВСЕХ родителей ВСЕХ людей в списке
2) Находит имена матерей тех людей, которые старше, чем 25 лет

Напишите ответы на экран
 */
public class Human {
    private String name;
    private int age;
    private static Human mother;
    private Human father;
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
        public String getName() {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }

        public int getAge () {
            return age;
        }

        public void setAge ( int age){
            this.age = age;
        }

        public static Human getMother() {
            return mother;
        }

        public void setMother (Human mother){
            this.mother = mother;
        }

        public Human getFather () {
            return father;
        }

        public void setFather (Human father){
            this.father = father;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && Objects.equals(name, human.name) && Objects.equals(mother, human.mother) && Objects.equals(father, human.father);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, mother, father);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mother=" + mother +
                ", father=" + father +
                '}';
    }
}


/*
В этом коде создается класс Human, список людей, и выполняются два стрима:
один для поиска всех родителей всех людей в списке и другой для нахождения имен матерей тех людей, которые старше 25 лет.
Результаты выводятся на экран.

 */
