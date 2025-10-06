package InheritanceOOPs;

class Shape{
    void drawing(){
        System.out.println("Circle Shape is Drawing...");
    }
}

class Area extends Shape{
    double r=2.5;
    double pi=3.14;
    void AreaOfCircle(){
        System.out.println("Area of Circle is: "+2*r*pi);
    }
}

public class CircleApp {
    public static void main(String[] args) {
        //Circle App

        Area ar=new Area();
        ar.drawing();
        ar.AreaOfCircle();
    }
}
