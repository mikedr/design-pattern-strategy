package payers;

public class CreditCard  implements PayBehavior{

    @Override
    public void doPayment() {
        System.out.println("Use your stored credit card to create a payment.");
    }

}

