import java.util.Scanner;

public class Circle {

    double radius = 1;

    Circle()
    {
         Circle defaultobj;
    }
    Circle(double rad)
    {
        radius=rad;
    }

    double getArea()
    {
        double a=3.14*radius*radius;
        return a;
    }

    double getperimeter()
    {
        double p=2*3.14*radius;
        return p;
    }

}

class main{
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter radius off Circle : ");
        double r = sc.nextDouble();
        Circle obj = new Circle(r);
        double Area= obj.getArea();
        double Perimeter= obj.getperimeter();
        System.out.println("Area of Circle : "+Area);
        System.out.println("Perimeter of Circle : "+Perimeter);
    }

}
