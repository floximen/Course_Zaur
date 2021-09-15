package lessons11;

public class Student {
    String name;
    int course;
    double grade;

    Student(String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }
    public static void Swap(Student s1, Student s2) {
        Student s3 = s1;
        s1 = s2;
        s2 = s3;
    }

    public static void changeName(Student s1) {
        s1.name = "Vasiliy";
    }
    public static void main(String[] args) {
        Student st1 = new Student("Ilya", 3, 2.5);
        Student st2 = new Student("Denis", 5, 4.5);

        Swap(st1, st2);
        System.out.println(st1.name);
        System.out.println(st2.name);

        changeName(st2);
        System.out.println(st2.name);
    }
}
