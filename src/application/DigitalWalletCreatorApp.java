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

        //Setting of the correspondent payment behavior:
        marketPay.setPayBehavior(new QR());
        orangeCard.setPayBehavior(new Bitcoins());
        sintindir.setPayBehavior(new CreditCard());

        //Setting of the correspondent investment behavior:
        marketPay.setInvestBehavior(new InvestmentFund());
        orangeCard.setInvestBehavior(new CryptocurrencyBuy());
        sintindir.setInvestBehavior(new ForeignCurrencyBuy());

        //Using each ewallet:
        marketPay.display();
        marketPay.pay();
        marketPay.invest();
    }
}
