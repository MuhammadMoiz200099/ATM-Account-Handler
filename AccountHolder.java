public class AccountHolder {

    private String accountNumber;
    private String Holdername;

    public AccountHolder(String accountNumber, String holdername) {
        this.accountNumber = accountNumber;
        Holdername = holdername;
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHoldername() {
        return Holdername;
    }

    public void setHoldername(String holdername) {
        Holdername = holdername;
    }

}
