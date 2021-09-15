package lessons8;

public class Homework {
    static int sub(int a, int b, int c) {
        return a * b * c;
    }
    static int del(int a2, int b2) {
        return a2 / b2;
    }

    final  static double Pi = 3.14;

    double rad(int radius) {
        return Pi * radius;
    }
//
//    static double res() {
////        return 2 * Pi *rad();
//    }
}
class HomeworkTest {
    public static void main(String[] args) {
        System.out.println(Homework.sub(5, 6, 8));
        System.out.println(Homework.del(10,5));
//        System.out.println(Homework.res());
    }
}