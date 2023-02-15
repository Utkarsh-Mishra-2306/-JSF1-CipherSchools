package week1;
//Inheritance
//Memory Usage Optimization
//faster development
//central code
//productivity/ effieciency
public class program12 {
    int width;
    int height;

    void display(String item) {
        System.out.println(item + "Width" + width + "Height" + height);
    }
    public static void main(String[] args) {
        Chair neelKamal=new Chair();
        neelKamal.foo();
    }

}
class Chair extends program12{
    void foo() {
        width=10;
        height=20;
        display("Chair");
    }
}

class Table extends program12{
    void foo() {
        width=30;
        height=50;
        display("Table");
    }
}

class Almirah extends program12{
    void foo() {
        width=100;
        height=200;
        display("Almirah");
    }
}