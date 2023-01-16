public interface phone {
    void poweron();
    void callnumber(String phonenumber);
    void receivecall(String phonenumber);
    boolean answercall();
    boolean isringing();
}
