public class Foregin {

    private String nationality;
    private String PassPortNo;
    private String accType;

    public Foregin(String nationality, String passPortNo, String accType) {
        this.nationality = nationality;
        PassPortNo = passPortNo;
        this.accType = accType;
    }

    public void BankStatment(){
        System.out.println("My bank name is : HBL");
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getPassPortNo() {
        return PassPortNo;
    }

    public void setPassPortNo(String passPortNo) {
        PassPortNo = passPortNo;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }
}
