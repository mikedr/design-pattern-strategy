package investments;

public class ForeignCurrencyBuy implements InvestBehavior {

    @Override
    public void doAnInvestment() {
        System.out.println("Buy dollars");
    }

}