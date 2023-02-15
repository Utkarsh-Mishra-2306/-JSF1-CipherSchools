package week1;

public class program11 {
    int empID;
    int salary;
    String department;
    //constructor - same name as class name
    //No return type.

    //PURPOSE
    //it creates/initializes objects in memory
    //we can use constructor block to initialise default values.
    program11(int employeeID, int sal, String dep) {
        empID=employeeID;
        salary=sal;
        department=dep;
    }
    public static void main(String[] args) {
        program11 rahul=new program11(101,30000, "testing");
        program11 varsha=new program11(101, 50000, "Engineering");
        System.out.println(rahul.empID +" " +  rahul.salary +" " +  rahul.department);
        System.out.println(varsha.empID +" " +  varsha.salary +" " +  varsha.department);
    }
}