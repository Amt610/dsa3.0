package Polymorphism;

class Calculator{

    //int a and b variable
    int add(int a,int b){
        return a+b;
    }

    //double a and b variable

    double add(double a,double b){
        return a+b;
    }

    int add(int a,int b,int c){
        return a+b+c;
    }
}

public class AddNumber {
    public static void main(String[] args) {
        //Access Class
        Calculator cal=new Calculator();
        System.out.println(cal.add(12,35));
        System.out.println(cal.add(1.2,1.5));
        System.out.println(cal.add(1,2,3));
    }
}
