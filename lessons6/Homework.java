package lessons6;

public class Homework {

    int sum() {
        System.out.println("1");
        return 0;
    }

    int sum(int a2) {
        int result = a2;
        System.out.println("2" + result);
        return result;
    }

    int sum(int c, int b) {
        int result = c + b;
        System.out.println("3" + result);
        return result;
    }

    int sum(int c2, int b2, int i) {
        System.out.println("4" + sum(c2, b2, i));
        return sum(1, 30, 40);
    }


    int sum(int c3, int b3, int i3, int n) {
        System.out.println("5" + sum(c3, b3, i3, n));
        return sum(1, 30, 40, 60);
    }
}