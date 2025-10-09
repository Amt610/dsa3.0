package InheritanceOOPs;

class School{
    String SchoolName="VBS PURVANCHAL UNIVERISITY JAUNPUR";
    void SchoolDetails(){
        System.out.println("SCHOOL NAME: "+SchoolName);
    }
}

class Student extends School{
    String StudentName="Amit Yadav";
    void StudentDetails(){
        SchoolDetails();
        System.out.println("Student Name: "+StudentName);
    }
}

public class SchoolDetails {
    public static void main(String[] args) {
        //Create Object
        Student std=new Student();
        std.StudentDetails();
    }
}
