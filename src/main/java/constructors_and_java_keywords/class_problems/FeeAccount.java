package constructors_and_java_keywords.class_problems;

public class FeeAccount {

    String accountType;

    public FeeAccount() {
        accountType = "FeeAccount";
    }

    public void pay(double amount) {
        System.out.println("Paid Rs " + amount + " using " + accountType);
    }

    public void processPayment(FeeAccount account, double amount) {

        if (account instanceof HostelFeeAccount) {
            System.out.println("Paid in two installments (hostel account)");
        } else {
            System.out.println("Paid in one installment (fee account)");
        }
    }

    public static void main(String[] args) {

        FeeAccount[] accounts = {
                new HostelFeeAccount(),
                new HostelFeeAccount(),
                new FeeAccount(),
                new FeeAccount()
        };

        double amount = 60000;

        int hostelCount = 0;
        int feeAccountCount = 0;

        FeeAccount processor = new FeeAccount();

        for (FeeAccount account : accounts) {

            processor.processPayment(account, amount);

            if (account instanceof HostelFeeAccount) {
                hostelCount++;
            } else {
                feeAccountCount++;
            }
        }

        System.out.println("Hostel accounts processed: " + hostelCount);
        System.out.println("Fee accounts processed: " + feeAccountCount);
    }
}

class HostelFeeAccount extends FeeAccount {

    public HostelFeeAccount() {
        accountType = "HostelFeeAccount";
    }
}