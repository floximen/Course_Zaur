package lessons6;
/*
overloading - Перегруженные методы имеют одинаковые имена и разный список параметров.
                        Разный по типам данных.
                        Разные по кол-ву параметров.
                        Разный по порядку.
-------------------------------------------------------------------------------------------------------------------------------------------------------
Методы являются overloaded, только тогда, когда у них одинаковое имя и разный список параметров. Больше ничего на них
не влияет.
-------------------------------------------------------------------------------------------------------------------------------------------------------
Правила overloadinga - Return type  может быть одинаковый или различный.
                                          Access modefier (видимость метода, в каких методах они видны, а в каких нет, и т.д.)
                                          может быть одинаковый и различный.
                                           У конструктора нету Return type.
--------------------------------------------------------------------------------------------------------------------------------------------------------
this - Вызов конструктор внутри конструктора, использовать только на 1м месте!
 */
public class OverloadObjectConstructor {
    void show(int i1) {
        System.out.println(i1);
        System.out.println("Data type is int");
    }
    void show(boolean b1) {
        System.out.println(b1);
        System.out.println("Data type is boolean");
    }
    void show(String s1) {
        System.out.println(s1);
        System.out.println("Data type is String");
    }
    void show(String s, int a) {
        System.out.println("String:  " + s + " int:  " + a);
    }
}

class OverloadObjectConstructorTest {
    public static void main(String[] args) {
        OverloadObjectConstructor mO = new OverloadObjectConstructor();
        int a = 500;
        mO.show(a);
        boolean a1 = false;
        mO.show(a1);
        String a2 = "Marina";
        mO.show(a2);
        mO.show("GHJ", 10);
    }
}

class overloading2 {
    int sum(int i1, int i2) { //overloaded
        return i1 + i2;
    }

    String sum(String s1, String s2) { //overloaded
        return s1 + s2;
    }
}

class Overloading2Test{
    public static void main(String[] args) {
        overloading2 mO2 = new overloading2();
        int i = mO2.sum(5, 25);
        System.out.println(i);
        String s = mO2.sum("Hello", " Drug");
        System.out.println(s);
    }
}

