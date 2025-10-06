package InheritanceOOPs;

class Animals{
    void Eat(){
        System.out.println("Animals is Eating...");
    }
}

class Dog extends Animals{
    void Bark(){
        System.out.println("Dog is Barking....");
    }
}

class Cow extends Dog{
    void Milk(){
        System.out.println("Cow Milk is very helpful for anyone....");
    }
}

public class Zoo {
    public static void main(String[] args) {
        //java Zoo Programme
        //Create Object
        Cow cw=new Cow();

        //print all details
        cw.Eat();
        cw.Bark();
        cw.Milk();
    }
}
