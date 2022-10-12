import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        double z = in.nextDouble();
        Vector v1 = new Vector(x,y,z);
        x = in.nextDouble();
        y = in.nextDouble();
        z = in.nextDouble();
        Vector v2 = new Vector(x,y,z);
        System.out.println(v1.length() + " " + v2.length());
        System.out.println(v1.scalarProduct(v2));
        Vector v3 = v1.crossProduct(v2);
        v3.print();
        System.out.println(v1.cos(v2));
        v1.add(v2).print();
        v1.subtract(v2).print();
        System.out.println(v1.equals(v2));
        //12
    }
}
