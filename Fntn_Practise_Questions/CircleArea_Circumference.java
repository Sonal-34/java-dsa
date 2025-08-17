import java.util.Scanner;

public class CircleArea_Circumference {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Radius: ");
        double radius=s.nextDouble();
        System.out.println("Area of Circumference is: " + circumference(radius));
        System.out.println("Area of Circle: " + areaCircle(radius));
        s.close();
    }

    static double circumference(double radius)
    {
        double area = 2 * Math.PI * radius;
        return area;
    }

    static double areaCircle(double radius)
    {
        double areaC = Math.PI * radius * radius;
        return areaC;
    }
}
