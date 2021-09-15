package lessons7;
/*
package - место где хранятся наши классы.
Вызов объекта из другой папки - package2.(имя класса) nameObject = new package2.(имя класса), у конструтора, из другой
папки должен быть модификатор  public
--------------------------------------------------------------------------------------------------------------------------------------------------------
Контроллер доступа (Access modifier) - public, private, (default -  когда перед элементом ничего не стоит, его видно только
в нутри своего пакета), protected по видимости такой же как и default не может быть у внешних классов.
--------------------------------------------------------------------------------------------------------------------------------------------------------
У внешних классов, может быть 2 контроллера доступа - public, private
 */
public class Package {

//        lessons6.Emploee emp = new lessons6.Emploee("Artur", 26);
    double salary;

    void dvoynayaZP() {
        double result = salary * 2; // локальная переменная
        System.out.println("Новая ЗП =  " + result);
    }
    Package (double salary2) {
        salary = salary2;
    }

    public static void main(String[] args) {
        Package pac = new Package(500);
        System.out.println(pac.salary);
        pac.dvoynayaZP();
    }
}

class PackageTest {
    public static void main(String[] args) {
        Package pac = new Package(500);
        System.out.println(pac.salary);
        pac.dvoynayaZP();
    }
}