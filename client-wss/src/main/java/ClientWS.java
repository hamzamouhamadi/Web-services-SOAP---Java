import proxy.BankAccountService;
import proxy.BankWS;

public class ClientWS {
    static void main(String[] args) {
        BankAccountService proxyWS = new BankWS().getBankAccountServicePort();
        System.out.println(proxyWS.conversionEuroToDh(800));
    }
}
