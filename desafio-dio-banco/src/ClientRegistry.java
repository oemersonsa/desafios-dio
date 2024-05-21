/*
Menu para entrar na conta ou criar uma conta;
Metodo paar entrar na conta existente;
Metodo para criar conta;
Menu para realizar operações na conta;
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClientRegistry {

    private List<Client> clients;
    private List<Account> accounts;
    private Bank bank;
    private Scanner scanner;

    public ClientRegistry(Bank bank) {
        this.bank = bank;
        this.clients = new ArrayList<>();
        this.accounts = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public ClientRegistry() {

    }

    public void runMenu() {
        int option;
        do {
            System.out.println("=== Menu ===");
            System.out.println("1. Entrar na conta existente");
            System.out.println("2. Criar conta");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    enterExistingAccount();
                    break;
                case 2:
                    createAccount();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (option != 3);
    }

    private void enterExistingAccount() {
        System.out.print("Digite o nome do cliente: ");
        String clientName = scanner.nextLine();

        Account account = findAccountByClientName(clientName);
        if (account != null) {
            performAccountOperations(account);
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    private Account findAccountByClientName(String clientName) {
        for (Account account : accounts) {
            if (account.getClient().getName().equals(clientName)) {
                return account;
            }
        }
        return null;
    }

    private void createAccount() {
        System.out.print("Digite o nome do cliente: ");
        String clientName = scanner.nextLine();
        Client client = new Client(clientName);

        System.out.println("Escolha o tipo de conta:");
        System.out.println("1. Conta Poupança");
        System.out.println("2. Conta Corrente");
        System.out.print("Escolha uma opção: ");
        int accountType = scanner.nextInt();
        scanner.nextLine();

        Account account;
        switch (accountType) {
            case 1:
                account = new SavingsAccount(client);
                break;
            case 2:
                account = new CurrentAccount(client);
                break;
            default:
                System.out.println("Opção inválida. Criando conta poupança por padrão.");
                account = new SavingsAccount(client);
        }

        accounts.add(account);
        System.out.println("Conta criada com sucesso.");
    }

    private void performAccountOperations(Account account) {
        int option;
        do {
            System.out.println("=== Operações na Conta ===");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Transferir");
            System.out.println("4. Extrato");
            System.out.println("5. Voltar ao menu anterior");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Digite o valor para depositar: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    System.out.println("Depósito realizado com sucesso.");
                    break;
                case 2:
                    System.out.print("Digite o valor para sacar: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    System.out.println("Saque realizado com sucesso.");
                    break;
                case 3:
                    System.out.print("Digite o valor para transferir: ");
                    double transferAmount = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Digite o nome do destinatário: ");
                    String recipientName = scanner.nextLine();
                    Account recipientAccount = findAccountByClientName(recipientName);
                    if (recipientAccount != null) {
                        account.tranfer(transferAmount, recipientAccount);
                        System.out.println("Transferência realizada com sucesso.");
                    } else {
                        System.out.println("Destinatário não encontrado.");
                    }
                    break;
                case 4:
                    account.statement();
                    break;
                case 5:
                    System.out.println("Voltando ao menu anterior...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (option != 5);
    }
}
