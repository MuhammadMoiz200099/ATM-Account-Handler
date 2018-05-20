import java.util.Date;

public class UtilityPlan {

    private double fund;
    private Date validity;
    private String month;

    public UtilityPlan(double fund, Date validity, String month) {
        this.fund = fund;
        this.validity = validity;
        this.month = month;
    }

    public boolean addFund(){
        return true;
    }

    public void transferFund(){
        System.out.println("Fund has been transfered.");
    }

    public double getFund() {
        return fund;
    }

    public void setFund(double fund) {
        this.fund = fund;
    }

    public Date getValidity() {
        return validity;
    }

    public void setValidity(Date validity) {
        this.validity = validity;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }
}
