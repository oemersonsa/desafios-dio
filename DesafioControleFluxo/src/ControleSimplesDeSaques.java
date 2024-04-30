import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que informe o limite diário de saque
        System.out.println("Informe o limite diário de saque: ");
        double limiteDiario = scanner.nextDouble();

        // Loop 'for' para iterar sobre os saques
        for (int i = 1; ; i++) {
            // Solicita ao usuário o valor do saque
            System.out.println("Informe o valor do saque " + i + ": ");
            double valorSaque = scanner.nextDouble();

            // Verifica se o valor do saque é zero, encerrando as transações
            if (valorSaque == 0) {
                System.out.println("Transações encerradas.");
                break;
            }

            // Verifica se o valor do saque ultrapassa o limite diário
            

                // Informa que o saque foi realizado e mostra o limite restante
               
            }
        }

        // Fechamos o Scanner para evitar vazamento de recursos
        scanner.close();
    }
}
