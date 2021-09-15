package lessons5;
/*
psvm - метод
void - то, что возвращает нам метод
main - имя метода
 */
public class ObjectConstructor {
    int summa (int a, int b, int c) { //Метод, типы данных всегда должны совпадать для возвращения.
        int result = a + b + c;
        return  result; // возвращение результата
    }
    //Вызов метода внутри метода
    int sredneeArife (int a1, int b1, int c1) {
        int result2 = summa(a1, b1, c1)/3;
        return result2;
    }
}

class  Test21 {
    // Вызов метода
    public static void main(String[] args) {
        ObjectConstructor t = new ObjectConstructor();
        int summaTrehChisel = t.summa(1,2,3);
        System.out.println(summaTrehChisel);
        System.out.println(t.sredneeArife(20,40,60));
    }
}

class  Car2 {
    String color;
    String engine;
    int speed;

    int gas(int scorost) {
        speed += scorost;
        return speed;
    }

    int tormoz (int scorost) {
        speed -= scorost;
        return speed;
    }

    void showInfo () {
        System.out.println("cvet: " + color + " motor: " + engine + " scorost: " + speed);
    }
}

class Car2Test {
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        c1.color = "white";
        c1.engine = "v6";
        c1.speed = 60;

        c1.showInfo();
        c1.gas(20);
        c1.showInfo();
        c1.tormoz(30);
        c1.showInfo();
    }
}

class Car3 {
    Car3 (String c, String e) {
        color = c;
        engine = e;
    }
    String color;
    String engine;
}

class Human {
    String name;
    Car3 car;
    BankAccount bA;

    void info () {
        System.out.println("Imya: " + name + " cvet machine: " + car.color + " balance: "+ bA.balance);
    }
}

class HumanTest {
    public static void main(String[] args) {
        Human h = new Human();
        h.name = "david";
        h.car = new Car3("red", "V8");
        h.bA = new BankAccount(28, 200.5);
        h.info();
    }
}

class BankAccount {
    BankAccount(int id2, double balance2) {
        id = id2;
        balance = balance2;
    }
    int id;
    double balance;

}