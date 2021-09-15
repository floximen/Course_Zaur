package lessons13;

public class Switch {
}

class Student {
    int  grade;
    Student(int grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student st1 = new Student(5);
//        if (st1.grade == 2) {
//            System.out.println("студент двоишник");
//        }else if (st1.grade == 3) {
//            System.out.println("студент троичник");
//        } else if(st1.grade == 4) {
//            System.out.println("студент хорошист");
//        } else if(st1.grade == 5) {
//            System.out.println("студент отличник");
//        } else {
//            System.out.println("Оценка не верна");
//        }

        switch (st1.grade) {
            case 2 :
                System.out.println("студент двоишник");
                break;
            case 3 :
                System.out.println("студент троишник");
                break;
            case 4 :
                System.out.println("студент хорошист");
                break;
            case 5 :
                System.out.println("студент отличник");
                break;
            default: System.out.println("оценка не верна");
        }
    }
}

