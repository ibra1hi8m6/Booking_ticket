package first.java;

/**
 *
 * @author ahmed
 */
public class Payment {
    private int PaymentID,paymentAmount; // parameters for ID,Amount of payment
    private String MemberName,PaymentDate; // parameters for Name of member,Date of payment 

    // full argument constructor
    public Payment(int PaymentID, int paymentAmount, String MemberName, String PaymentDate) {
        this.PaymentID = PaymentID;
        this.paymentAmount = paymentAmount;
        this.MemberName = MemberName;
        this.PaymentDate = PaymentDate;
    }

    public void setPaymentID(int PaymentID) {
        this.PaymentID = PaymentID; //setting Payment ID
    }

    public void setPaymentAmount(int paymentAmount) {
        this.paymentAmount = paymentAmount; // setting Payment Amount
    }

    public void setMemberName(String MemberName) {
        this.MemberName = MemberName; // setting Name of Member
    }

    public void setPaymentDate(String PaymentDate) {
        this.PaymentDate = PaymentDate; // setting Payment Date
    }

    public int getPaymentID() {
        return PaymentID; // getting Payment ID
    }

    public int getPaymentAmount() {
        return paymentAmount; // getting Payment Amount
    }

    public String getMemberName() {
        return MemberName; // getting Member Name
    }

    public String getPaymentDate() {
        return PaymentDate; // getting Payment Date
    }

    //Printing all info about Payment
    public void printinfo() {
        System.out.println("PaymentID:" + PaymentID + "\npaymentAmount: " + paymentAmount +
                "\nMemberName: " + MemberName + "\nPaymentDate: " + PaymentDate);
    }
    
    
}
