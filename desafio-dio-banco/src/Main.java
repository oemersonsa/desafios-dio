public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        ClientRegistry clientRegistry = new ClientRegistry(bank);
        clientRegistry.runMenu();
    }
}