public class Main {
    public static void main(String[] args) {
        Landline l1=new Landline("123");
        Landline l2=new Landline("456");

        l1.callnumber("456");
        l2.receivecall("456");

        System.out.print(l2.answercall());
    }
}