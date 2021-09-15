package lessons6;

public class  Emploee {
    int id;
    String surname;
    int age;
    double salary;
    String departament;

    Emploee(int id2, String surname2, int age2) {
        this(id2, surname2, age2, 0.0, null); //дефолтные значения добавляем, чтобы компилятор не ругался
    }

    public Emploee(String surname3, int age3) {
        this(0, surname3, age3,  0.0, null );
    }

    Emploee(int id4, String surname4, int age4, double salary4, String departament4) {
        id = id4;
        surname = surname4;
        age = age4;
        salary = salary4;
        departament = departament4;
    }
}

class EmploeeTest {
    public static void main(String[] args) {
        Emploee emp = new Emploee(1, "Ivanov", 25);
        Emploee emp2 = new Emploee("Petrow", 30);
        Emploee emp3 = new Emploee(2, "Sidoroqw", 22, 223.56, "oodd");
        System.out.println(emp3.departament);
    }
}
