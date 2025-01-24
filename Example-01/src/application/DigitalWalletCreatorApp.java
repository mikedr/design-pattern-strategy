package application;

import ewallets.MarketPay;
import ewallets.OrangeCard;
import ewallets.Sintindir;
import investments.CryptocurrencyBuy;
import investments.ForeignCurrencyBuy;
import investments.InvestmentFund;
import payers.Bitcoins;
import payers.CreditCard;
import payers.DebitCard;
import payers.QR;

public class DigitalWalletCreatorApp {
    public static void main(String... args) {
        //Instatiation of the ewallets:
        MarketPay marketPay = new MarketPay();
        OrangeCard orangeCard = new OrangeCard();
        Sintindir sintindir = new Sintindir();

        //Using each ewallet:
        marketPay.display();
        marketPay.pay();
        marketPay.invest();

        orangeCard.display();
        orangeCard.pay();
        orangeCard.invest();

        sintindir.display();
        sintindir.pay();
        sintindir.invest();

        //changing
        System.out.println("\n***Changing behaviors on runtime***\n");
        marketPay.setPayBehavior(new CreditCard());
        marketPay.display();
        marketPay.pay();
        orangeCard.setPayBehavior(new DebitCard());
        orangeCard.display();
        orangeCard.pay();
        sintindir.setPayBehavior(new DebitCard());
        sintindir.display();
        sintindir.pay();
    }
}
