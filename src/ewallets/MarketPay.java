package ewallets;

import investments.InvestmentFund;
import payers.QR;

public class MarketPay extends Ewallet {

    public MarketPay() {
        investBehavior = new InvestmentFund();
        payBehavior = new QR();
    }

    @Override
    public void display() {
        System.out.println("---MP---Market Pay aesthetic---MP---");
    }

}
