package lessons2;

public class Homework {
    public static void main(String[] args) {
        byte b1 = 12;
        byte b2 = 0B1100; // 2я система счисления
        byte b3 = 014; // 8я система счисления
        byte b4 = 0XC; // 16я система счисления

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        System.out.println();

        short s1 = 1300;
        short s2 = 0B10100010100;
        short s3 = 02424;
        short s4 = 0X514;

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        System.out.println();

        int i1 = 0;
        int i2 = 0B0;
        int i3 = 00;
        int i4 = 0X0;

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);

        System.out.println();

        long l1 = 123456789L;
        long l2 = 0B111_010_110_111_100_110_100_010_101;
        long l3 = 0_726_746_425L;
        long l4 = 0X75BCD15L;

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);

        System.out.println();

        float f1 = 22.4F;
        float f2 = 22.3F;

        System.out.println(f1);
        System.out.println(f2);

        System.out.println();

        double d1 = 222.4;
        double d2 = 222.3;

        System.out.println(d1);
        System.out.println(d2);

        System.out.println();

        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println(bool1);
        System.out.println(bool2);

        System.out.println();

        char c1 = '2';
        char c2 = '\n';
        char c3 = 777;

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
