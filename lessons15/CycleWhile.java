package lessons15;

public class CycleWhile {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }
}

class  Test2 {
    public static void main(String[] args) {
        int maney = 100;

        while (maney > 0) {
            System.out.println("Делайте ставку");
            System.out.println("Вы проиграли");
            maney = maney - 10;
            System.out.println(maney);
        }
    }
}

class  Test3 {
    public static void main(String[] args) {
        boolean b = true;
        int a = 1;

        while (b) {
            System.out.println(a);
            if (a % 3 == 0 && a % 7 == 0) {
                b = false;
            }
            a++;
        }
    }
}

class Test4 {
    public static void main(String[] args) {
        int a = 5;

        while (a++ < 10) {
            a++;
        }
        System.out.println(a);
    }
}

class Test5 {
    public static void main(String[] args) {
        int a = 5;

        while (a == 10) {
            a++;
            System.out.println("Privet");

        }
    }
}

class Test6 {
    public static void main(String[] args) {
        int i = 1;

        do {
            System.out.println(i);
            i++;
        }while(i <=10);
    }
}

class Test7 {
    public static void main(String[] args) {
        int money = 100;

        do {
            System.out.println("Делайте ставки");
            System.out.println("Вы проиграли");
            money = money - 10;
            System.out.println(money);
        } while ( money > 50);
    }
}

class  Test8 {
    public static void main(String[] args) {
        int chas = 0;
        OUTHER:
        do {
            int minuta = 0;

            INNER:
            while ( minuta < 60) {
                System.out.println(chas + ":" + minuta);
                minuta++;
            }

            chas++;
        } while (chas < 24);
    }
}

class Test9 {
    public static void main(String[] args) {

        OUTHER: for (int chas = 0; chas < 24; chas++) {
            int minuta = 0;

            INNER: while (minuta < 60) {
                if (minuta == 20) {
                    continue  OUTHER;
                }
                System.out.println(chas + ":" + minuta);
                minuta++;
            }
        }
    }
}