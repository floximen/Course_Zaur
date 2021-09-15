package lessons14;

public class CycleFor {
    public static void main(String[] args) {
        for (int i = 2;  i < 11; i++) {
            System.out.println(i);
        }
    }
}

class Test2 {
    public static void main(String[] args) {
        for (int i = 2; i <= 30; i= i + 2 ) {
            System.out.println(i);
        }

        int a = 15;
        if (a > 10) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }
        }
    }
}

class Test5 {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){
            if (i == 10) {continue;}
            if ( i %55 == 0) {break;}
            System.out.println(i);
        }
    }
}

class Test6{
    public void  time() {
        OUTER:
        for (int chas = 0; chas <= 23; chas++) {
            System.out.println("Начало цикла");
            INNER:
            for (int minuta = 0; minuta <= 59; minuta++) {
                System.out.println(chas + ":" + minuta);
                if (minuta == 30) {
                    break OUTER;
                }
            }
            if (chas == 30) {
                break;
            }
            System.out.println("Конец цикла");
        }
    }

    public static void main(String[] args) {
        Test6 t = new Test6();
        t.time();
    }
}