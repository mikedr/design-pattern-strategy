package payers;

public class QR implements PayBehavior{

    @Override
    public void doPayment() {
        System.out.println("Use QR to create a payment.");
    }

}
