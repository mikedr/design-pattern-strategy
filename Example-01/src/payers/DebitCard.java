package payers;

public class DebitCard implements PayBehavior{

    @Override
    public void doPayment() {
        System.out.println("Use your stored debit card to create a payment.");
    }

}
