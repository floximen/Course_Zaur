package lessons4;
/*
Класс - перечень действий которые должны выполняться.
Обьект - экземпляр класса..
 */

public class BankAccount {
    //  ссылочные переменные
    int id;
    String name;
    double balance;

    double popolnenieScheta(double schet) {
        balance += schet;
        return balance;
    }

    double snyatieSoScheta(double schet) {
        balance -= schet;
        return balance;
    }
}

class BankAccoutnTest {
    public static void main(String[] args) {
        /*
        создание объекта BankAccount.
        перменная bA хранит в себе адрес этого объекта, а не сам объект.
         */
        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        MyAccount.id = 1;
        MyAccount.name = "Maxim";
        MyAccount.balance = 225.45;

        System.out.println(MyAccount.name);
        System.out.println(MyAccount.popolnenieScheta(60));
        System.out.println(MyAccount.snyatieSoScheta(30));

        YourAccount.id = 2;
        YourAccount.name = "Alexey";
        YourAccount.balance = 300.50;

        System.out.println(YourAccount.name);

        HisAccount.id = 3;
        HisAccount.name = "Sergey";
        HisAccount.balance = 100.30;

        System.out.println(HisAccount.name);
    }
}

class  Car {
    // При присваивании параметров должны соотвестовать типами данных для параметров
    Car (String cvet, String motor) {
        color = cvet;
        engine = motor;
        System.out.println("Цвет машины: "+ color +" мотор машины: " + engine);
    }
    String color;
    String engine;
}

class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("black", "V8");
        Car car2 = new Car("white", "V6");


    }
}