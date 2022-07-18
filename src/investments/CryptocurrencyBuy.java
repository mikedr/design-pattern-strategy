package investments;

public class CryptocurrencyBuy implements InvestBehavior {

    @Override
    public void doAnInvestment() {
        System.out.println("Buy bitcoins");
    }

}