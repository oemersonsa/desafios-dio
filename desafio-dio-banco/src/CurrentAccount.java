public class CurrentAccount extends Account {

    public CurrentAccount(Client client) {
        super(client);
    }

    @Override
    public void statement() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.printCommuns();
    }
}
