package constructors_and_java_keywords.assignment_problems;

public class CanteenPayment {

    double amount;

    public CanteenPayment(double amount) {
        this.amount = amount;
    }

    public void processPayment() {
        System.out.println("Payment of Rs " + amount + " processed");
    }

    public static void main(String[] args) {

        CanteenPayment[] payments = {
                new CardPayment(1000),
                new CanteenPayment(500),
                new CardPayment(1500),
                new CanteenPayment(800),
                new CardPayment(1200)
        };

        double runningTotal = 0;

        for (CanteenPayment payment : payments) {

            if (payment instanceof CardPayment) {
                payment.processPayment();

                runningTotal = runningTotal + payment.amount
                        + (payment.amount * 0.02);
            } else {
                payment.processPayment();

                runningTotal = runningTotal + payment.amount;
            }
        }

        System.out.println("Running total: Rs " + runningTotal);
    }
}

class CardPayment extends CanteenPayment {

    public CardPayment(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() {

        double processingFee = amount * 0.02;
        double total = amount + processingFee;

        System.out.println(
                "Card payment: Rs " + amount
                        + " | Processing fee: Rs " + processingFee
                        + " | Total: Rs " + total
        );
    }
}