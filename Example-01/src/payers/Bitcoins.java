package payers;

public class Bitcoins implements PayBehavior{

    @Override
    public void doPayment() {
        System.out.println("Use bitcoins to create a payment.");
    }

}
