public class SavingsAccount extends Account {

    public SavingsAccount(Client client) {
        super(client);
    }

    @Override
    public void statement() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.printCommuns();
    }
}
