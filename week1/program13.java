package week1;
//function overloading- defining multiple functions with same name with different parameters.
public class program13 {
    void add(int num1, int num2) {
        System.out.println(num1+num2);
    }
    void add(int num1, int num2, int num3) {
        System.out.println(num1+num2+num3);
    }
    void add(float num1, float num2) {
        System.out.println(num1+num2);
    }
    void add(int num1, float num2) {
        System.out.println(num1+num2);
    }
    public static void main(String[] args) {
        //Rules- number of parameters must be different.
        program13 p=new program13();
        p.add(12.2f, 30.4f);
        System.out.println(p);
    }
}