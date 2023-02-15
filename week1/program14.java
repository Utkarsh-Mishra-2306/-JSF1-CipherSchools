package week1;
//Function overriding
abstract class Doctor{
    abstract void treatPatients();
}
class Physician extends Doctor{

    @Override
    void treatPatients() {
        // TODO Auto-generated method stub
        System.out.println("Physician");
    }
}
class Surgeon extends Doctor {

    @Override
    void treatPatients() {
        // TODO Auto-generated method stub
        System.out.println("Surgeon");
    }

}
class Dentist extends Doctor{

    @Override
    void treatPatients() {
        // TODO Auto-generated method stub
        System.out.println("Dentist");
    }

}
public class program14 {
    public static void main(String[] args) {
        System.out.println("I am Lucy! Receptionist ");
        System.out.println("Who are you looking for?");
        System.out.println("Press 1- Physician, Press 2- Surgeon, Press 3- Dentist");
        int choice=new java.util.Scanner(System.in).nextInt();
        Doctor doc;
        switch(choice) {
            case 1:
                doc=new Physician();
                break;

            case 2:
                doc=new Surgeon();
                break;

            case 3:
                doc=new Dentist();
                break;

            default:
                System.out.println("OOPS wrong choice.");
        }


    }
}