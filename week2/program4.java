package week2;
class A{
    public void methodA(){
        System.out.println("A");
    }
}
class B extends A{
    public void methodB() {
        System.out.println("B");
    }
}    
class C extends B{
    public void methodC() {
        System.out.println("C");
    }
}
public class program4 {
    public static void main(String[] args) {
    C obj=new C();
    obj.methodA();
    obj.methodB();
    obj.methodC();
}
}

