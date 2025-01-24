package ewallets;

import investments.InvestBehavior;
import payers.PayBehavior;

public abstract class Ewallet {
    PayBehavior payBehavior;
    InvestBehavior investBehavior;

    public void installOnAndroid() {
        System.out.println("Install on Android");
    }

    public void installOnIos() {
        System.out.println("Install on iOS");
    }

    public void invest() {
        investBehavior.doAnInvestment();
    };

    public void pay() {
        payBehavior.doPayment();
    };

    public abstract void display();

    public void setInvestBehavior(InvestBehavior investBehavior) {
        this.investBehavior = investBehavior;
    }

    public void setPayBehavior(PayBehavior payBehavior) {
        this.payBehavior = payBehavior;
    }
}
