package lessons8;
/*
Non-access Modifiers - final может относиться к переменной, делая из нее константу, методу, классу.
                                           1) final variable должны быть инициализированны до их использования, при определении
                                           переменной.
                                           2) В каждом конструкторе (если переменная не static).
                                           3) В final - конструкторах можно менять значения переменных, но нельзя создавать новые адреса.
                                          static может относиться к переменной, методу, они пренадлежат всему классу:
                                          1) статик переменные принадлежат всему классу, а не отдельным его объектам.
                                          2) существуют и могут быть использовованы без создания объекта класса.
                                          3)  переменные и методы не могут вызывать, обращаться к instance переменным и методам.
                                          4) Принято обращаться используя имя класса, а не ссылку на созданный обеъкт.

                                          abstract
 */
public class Constanta {
    public final int a;

    Constanta() {
        a = 10;
    }

    Constanta(boolean B) {
        a = 16;
    }

    public void abc(final short s) {
        final byte b = 10;
        System.out.println(a + b);
    }
    public static void main(String[] args) {
        Constanta t = new Constanta();

        System.out.println(t.a);
    }
}
class Car {
    String color = "blue";
    String engine = "V6";
}

class  Human {
    String name = "Ivan";
    final Car s = new Car();

    public static void main(String[] args) {
        Human h1 = new Human();
        h1.s.engine = "V8";
    }
}

class Student {
    String name;
    int course;
    static int count;
    public Student(String name2, int course2) {
        count++;
        name = name2;
        course = course2;
        System.out.println("Student #" + count + " sozdan");
    }
    public static void showCount () {
        System.out.println("Vsego sozdano studentov" + count);
    }

    public void showInfo(){
        System.out.println("Welcome to the Student class");
    }


}

class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student("igor", 3);
        Student st2 = new Student("sveta", 2);
        Student st3 = new Student("macha", 1);
        Student.showCount();
    }
}

