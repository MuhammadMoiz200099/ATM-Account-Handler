public class Citizen {

    private String NICnumber;
    private String Address;
    private double loan;

    public Citizen(String NICnumber, String address, double loan) {
        this.NICnumber = NICnumber;
        Address = address;
        this.loan = loan;
    }


    public boolean requestLoan(){
        return true;
    }

    public boolean returnLoan(){
        return true;
    }

    public String getNICnumber() {
        return NICnumber;
    }

    public void setNICnumber(String NICnumber) {
        this.NICnumber = NICnumber;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public double getLoan() {
        return loan;
    }

    public void setLoan(double loan) {
        this.loan = loan;
    }
}
