package week1;

public class program8 {
    public static void main(String[] args) {
        Amazon customer=new Amazon();
        float payAmt=customer.Transaction(1000);
        System.out.println(payAmt);
    }
}
class Amazon {
    float Transaction(float amt) {
        Gpay gpayObj=new Gpay();
        float totalAmt=amt+(amt*gpayObj.txncharge);
        return totalAmt;
    }
}
class Gpay{
    float txncharge=0.05f;
}