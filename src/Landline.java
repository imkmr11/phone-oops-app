public class Landline implements phone {
    private String myphoneno;
    private boolean isringing;
    private boolean ispoweron;

    public Landline(String myphoneno) {
        this.myphoneno = myphoneno;
        this.isringing=false;
        this.ispoweron=true;
    }


    public void setMyphoneno(String myphoneno) {
        this.myphoneno = myphoneno;
    }

    public boolean isIsringing() {
        return isringing;
    }

    public void setIsringing(boolean isringing) {
        this.isringing = isringing;
    }

    public boolean isIspoweron() {
        return ispoweron;
    }

    public void setIspoweron(boolean ispoweron) {
        this.ispoweron = ispoweron;
    }

    public Landline(boolean isringing) {
        this.isringing = isringing;
    }


    @Override
    public void poweron() {
        this.ispoweron=true;
    }

    @Override
    public void callnumber(String phonenumber) {
        if(ispoweron==true){
            System.out.println("you are dialing no" + phonenumber);
        }
        else {
            System.out.println("your landline is off");
        }

    }

    @Override
    public void receivecall(String phonenumber) {
        if(ispoweron && myphoneno.equals(phonenumber)){
            this.isringing=true;
            System.out.println("hey"+myphoneno+"you are receiving a call");
        }
        else {
            System.out.println("call not received");
        }
    }

    @Override
    public boolean answercall() {
        if(isringing==true){
            System.out.println("call answered");
            this.isringing=false;
            return true;
        }
        return false;
    }

    @Override
    public boolean isringing() {
        return isringing;
    }
}
