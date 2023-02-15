package week2;
public class program5 {
    int getNextNo(int n) {
        try {
        if(n==5) {
            return n+1;
        }
    }
    finally{
        System.out.println("This is an important code");
    }    
        return n-1;
    }
    public static void main(String[] args) {
        program5 obj=new program5();
        System.out.println(obj.getNextNo(5));
    }
}
