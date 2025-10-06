package InheritanceOOPs;

import javax.swing.plaf.basic.BasicBorders;

class Banking{
     double RateOfInterest(){
         return 0;
     }
}

class SBI extends Banking{
    @Override
    double RateOfInterest() {
        return 6.5;
    }
}


class PNB extends Banking{
    @Override
    double RateOfInterest() {
        return 5.8;
    }
}

class UBI extends Banking{
    @Override
    double RateOfInterest() {
        return 9.9;
    }
}
public class Bank {
    public static void main(String[] args) {
        //Create all Banking Object
        Banking sbi=new SBI();
        Banking pnb=new PNB();
        Banking ubi=new UBI();

        //Print all details
        System.out.println("ROI of SBI: "+sbi.RateOfInterest());
        System.out.println("ROI of UBI: "+ubi.RateOfInterest());
        System.out.println("ROI of PNB: "+pnb.RateOfInterest());
    }
}
