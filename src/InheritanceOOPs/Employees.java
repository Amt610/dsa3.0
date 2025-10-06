package InheritanceOOPs;
//create parent class
class EmployeeData{
    void work(){
        System.out.println("Employees is Working..");
    }
}

//create class or child class extend properties from parent class
class Developer extends EmployeeData{
    void code(){
        System.out.println("Developer is Doing code....");
    }
}
public class Employees {
    public static void main(String[] args) {
        //create object of child class
        Developer dev=new Developer();

        //print details
        dev.work();
        dev.code();


    }
}
