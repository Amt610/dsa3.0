package InheritanceOOPs;

//Laptop Programme
class Device{
    void Connection(){
        System.out.println("Laptop is Connected..");
    }
}

class HPLaptop extends Device{
    void DeviceOn(){
//        super();
        System.out.println("HP Laptop Device is On....");
    }
}

public class Laptop {
    public static void main(String[] args) {
        HPLaptop hp=new HPLaptop();
        hp.DeviceOn();
    }
}
