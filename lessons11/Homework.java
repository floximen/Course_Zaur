package lessons11;

public class Homework {
    String color;
    String engine;
    int dveri;

    Homework(String color, String engine, int dveri) {
        this.color = color;
        this.engine = engine;
        this.dveri = dveri;
    }
}

class HomeworkTest {

    public  static void ChangeDveri(Homework d1) {
        d1.dveri = 10;
        System.out.println(d1.dveri);
    }

    public static void Swap(Homework c1, Homework c2) {
        Homework c3 = c2;
        c2 = c1;

    }

    public static void main(String[] args) {
        Homework car1 = new Homework("yellow", "V6", 4);
        Homework car2 = new Homework("blue", "V8", 6);

        ChangeDveri(car1);
        Swap(car1, car2);
    }
}
