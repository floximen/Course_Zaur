package lessons5;

public class Homework {
    int id;
    String surname;
    int age;
    double salary;
    String departament;

    Homework (int id2, String surname2, int age2, double salary2, String departament2) {
        id = id2;
        surname = surname2;
        age = age2;
        salary = salary2;
        departament = departament2;
    }
    double udvoenieZarplat () {
        salary *= 2;
        return salary;
    }
}

class EmpoyeeTest {
    public static void main(String[] args) {
        Homework rab1 = new Homework(1, "triticov", 18, 1200.50, "h11");
        System.out.println(rab1.salary);
        rab1.udvoenieZarplat();
        System.out.println(rab1.salary);

        Homework rab2 = new Homework(2, "triticaf", 13, 1400.50, "h12");
        System.out.println(rab2.salary);
        rab2.udvoenieZarplat();
        System.out.println(rab2.salary);
    }
}