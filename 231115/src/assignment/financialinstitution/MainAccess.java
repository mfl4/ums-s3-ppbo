package assignment.financialinstitution;

public class MainAccess {
    public static void main(String[] args) {
        Bank bank = new Bank();
        GeneralBank gb = new GeneralBank();
        MarketBank mb = new MarketBank();
        SyariahBank sha = new SyariahBank();

        System.out.println(bank.interestRatio());
    }
}