package lessons4;

public class Homework {
    int id;
    String name;
    String family;
    int god;
    int matematic;
    int ekonomy;
    int inyaz;

    Homework(int id2, String name2, String family2, int god2, int matematic2, int ekonomy2, int inyaz2) {
        id = id2;
        name = name2;
        family = family2;
        god = god2;
        matematic = matematic2;
        ekonomy = ekonomy2;
        inyaz = inyaz2;
    }

    Homework (int id3, String name3, String surname3, int god3) {
        this(id3, name3, surname3, god3, 0, 0, 0);
    }

    Homework () {

    }

    void sredArifme() {
        System.out.println(matematic + ekonomy + inyaz / 3);
    }
}
class StudetTest {
    public static void main(String[] args) {
        Homework alexey = new Homework(1, "Alexey", "Petrov", 4, 5, 5, 5);
        Homework maxim = new Homework(2, "Maxim", "Pantelidi", 5);
        Homework denis = new Homework(3, "Denis", "Pantelidi", 2, 4,4,4);

        System.out.print("Алексей: ");
        alexey.sredArifme();

        System.out.print("Максим: ");
        maxim.sredArifme();

        System.out.print("Денис: ");
        denis.sredArifme();
    }
}

