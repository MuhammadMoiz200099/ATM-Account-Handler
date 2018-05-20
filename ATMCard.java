public class ATMCard {

    private String barCode;
    private Account account;
    private int pin;
    private boolean active;

    public ATMCard(String barCode, Account account, int pin, boolean active) {
        this.barCode = barCode;
        this.account = account;
        this.pin = pin;
        this.active = active;
    }

    public void dotranscation(){
        System.out.println("Your Transaction has been Done.");
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
