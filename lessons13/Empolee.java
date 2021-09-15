package lessons13;

public class Empolee {
    public static void main(String[] args) {
        switch ("sreda") {
            case "ponedelnik" :
            case "vtornik" :
            case "sreda" :
            case "chetverg" :
            case "pyatnitsa" :
                System.out.println("Работа до 18-00");
                break;
            case "subbota" :
                System.out.println("Работа до 12-00");
                break;
            case "voskresenie" :
                System.out.println("Выходной");
                break;
            default: System.out.println("Такого дня не существует");
        }
    }
}
