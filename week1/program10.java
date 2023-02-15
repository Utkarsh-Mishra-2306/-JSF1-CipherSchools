package week1;
interface olaCustomer{
    void bookcab();
    void findaRide();
    void rentcab();
    void rateDriver();
    void schedulecab();
    void cancelcab();
    void addmoneytoWallet();
    void raiseticket();
    void signUp();
    void signIn();
}
interface olaDriver{
    void acceptBooking();
    void getCustomerLoc();
    void setAvailableStatus();
    void getmyCommission();
    void raiseMoneyTransferRequest();
    void callCustomer();
    void setupvhicle();
    void customerFeedback();
}
interface olaOwner{
    void getDriverrecords();
    void getReportByDriver();
    void getReportByregion();
    void gettotalRevenue();
    void getCustomerfeedback();
    void adddriver();
    void removedriver();
    void changedriverStatus();
}
class program10 implements olaCustomer, olaDriver, olaOwner{
    public static void main(String[] args) {
        olaCustomer cust=new program10();
        olaDriver Manoj=new program10();
    }

    @Override
    public void getDriverrecords() {
        // TODO Auto-generated method stub

    }

    @Override
    public void getReportByDriver() {
        // TODO Auto-generated method stub

    }

    @Override
    public void getReportByregion() {
        // TODO Auto-generated method stub

    }

    @Override
    public void gettotalRevenue() {
        // TODO Auto-generated method stub

    }

    @Override
    public void getCustomerfeedback() {
        // TODO Auto-generated method stub

    }

    @Override
    public void adddriver() {
        // TODO Auto-generated method stub

    }

    @Override
    public void removedriver() {
        // TODO Auto-generated method stub

    }

    @Override
    public void changedriverStatus() {
        // TODO Auto-generated method stub

    }

    @Override
    public void acceptBooking() {
        // TODO Auto-generated method stub

    }

    @Override
    public void getCustomerLoc() {
        // TODO Auto-generated method stub

    }

    @Override
    public void setAvailableStatus() {
        // TODO Auto-generated method stub

    }

    @Override
    public void getmyCommission() {
        // TODO Auto-generated method stub

    }

    @Override
    public void raiseMoneyTransferRequest() {
        // TODO Auto-generated method stub

    }

    @Override
    public void callCustomer() {
        // TODO Auto-generated method stub

    }

    @Override
    public void setupvhicle() {
        // TODO Auto-generated method stub

    }

    @Override
    public void customerFeedback() {
        // TODO Auto-generated method stub

    }

    @Override
    public void bookcab() {
        // TODO Auto-generated method stub

    }

    @Override
    public void findaRide() {
        // TODO Auto-generated method stub

    }

    @Override
    public void rentcab() {
        // TODO Auto-generated method stub

    }

    @Override
    public void rateDriver() {
        // TODO Auto-generated method stub

    }

    @Override
    public void schedulecab() {
        // TODO Auto-generated method stub

    }

    @Override
    public void cancelcab() {
        // TODO Auto-generated method stub

    }

    @Override
    public void addmoneytoWallet() {
        // TODO Auto-generated method stub

    }

    @Override
    public void raiseticket() {
        // TODO Auto-generated method stub

    }

    @Override
    public void signUp() {
        // TODO Auto-generated method stub

    }

    @Override
    public void signIn() {
        // TODO Auto-generated method stub

    }
}
