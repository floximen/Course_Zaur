package lessons14;

public class Homework {
    static void time () {
        for (int chas = 0; chas <= 23; chas++) {
            for (int minuta = 0; minuta <=59; minuta++) {
                for (int second = 0; second <=59; second++) {
                    System.out.println(chas + ":" + minuta + ":" + second);
                }
                if (minuta == 10) {
                    break;
                }
            }
            if (chas == 6) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        time();
    }
}
