package ewallets;

import investments.CryptocurrencyBuy;
import payers.Bitcoins;

public class OrangeCard extends Ewallet {

    public OrangeCard() {
        investBehavior = new CryptocurrencyBuy();
        payBehavior = new Bitcoins();
    }

    @Override
    public void display() {
        System.out.println("---OC---Orange Card aesthetic---OC---");
    }

}
