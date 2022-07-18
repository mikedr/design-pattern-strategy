package ewallets;

import investments.ForeignCurrencyBuy;
import payers.CreditCard;

public class Sintindir extends Ewallet {

    public Sintindir() {
        investBehavior = new ForeignCurrencyBuy();
        payBehavior = new CreditCard();
    }

    @Override
    public void display() {
        System.out.println("---S---Sintindir aesthetic---S---");
    }

}
