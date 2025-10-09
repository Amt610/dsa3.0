package Polymorphism;

class Animal{
  void sound(){
      System.out.println("Animals Makes Sound");
  }
};

class Dog extends Animal{
    void sound(){
        System.out.println("Dogs makes his unique sound..");
    }
}

class Cat extends Animal{
    void sound(){
        System.out.println("Cat Makes his unique sound..");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        //Import Animals Class
        Animal a=new Dog();
        a.sound();

        Animal b=new Cat();
        b.sound();
    }
}
