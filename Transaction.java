import java.util.Date;

public class Transaction {

    private int transactionId;
    private double amount;
    private Date transData;
    private boolean approval;

    public Transaction(int transactionId, double amount, Date transData, boolean approval) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.transData = transData;
        this.approval = approval;
    }

    public String TranssectionalHistory(Date start , Date end){
        return "Starting date: " + start + "Ending date: " + end;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getTransData() {
        return transData;
    }

    public void setTransData(Date transData) {
        this.transData = transData;
    }

    public boolean isApproval() {
        return approval;
    }

    public void setApproval(boolean approval) {
        this.approval = approval;
    }
}
