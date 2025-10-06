package InheritanceOOPs;

//Create java Class MultilevelInheritance
class Cpu{
    void CpuDetails(){
        System.out.println("CPU is Computer Mind..");
    }
}

//create another class to name monitor
class Monitor extends Cpu{
    void MonitorDetails(){
        System.out.println("Monitor is Most Important Part of Computer...");
    }
}


//Create another class
class KeyBoard extends Monitor{
    void KeyBoardDetails(){
        System.out.println("This is Computer Controller Parts...");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        //Create Object of Last Child
        KeyBoard kb=new KeyBoard();
        kb.CpuDetails();
        kb.KeyBoardDetails();
        kb.MonitorDetails();
    }
}
