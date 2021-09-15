package lessons12;
/*
    String equals - равными считаются те объекты у которых все одинаково
 */
public class IfSwitchSatatament {
    void  maximum (int i1, int i2, int i3){
        if (i1 > i2 && i1 > i3) {
            System.out.println("Maximum: " + i1);
        } else if (i2 > i1 && i2 > i3){
            System.out.println("Maximum: " + i2);
        } else {
            System.out.println("Maximum: " + i3);
        }
    }
    public static void main(String[] args) {
        int salary = 400;
        if (salary >= 500) {
            System.out.println(":)");
        } else {
            System.out.println(":(");
        }
        IfSwitchSatatament ts = new IfSwitchSatatament();
        ts.maximum(4, 6, 8);
    }
}

