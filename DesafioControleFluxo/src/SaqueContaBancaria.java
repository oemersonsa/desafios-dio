import java.util.Scanner;

public class SaqueContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que informe o limite diário de saque
        System.out.print("Informe o limite diário de saque: ");
        double limiteDiario = scanner.nextDouble();

        // Variável para armazenar o valor total de saques realizados
        double totalSaque = 0;

        // Loop para realizar os saques
        for (int i = 1; ; i++) {
            // Solicita ao usuário que informe o valor do saque
            System.out.print("Informe o valor do saque " + i + ": ");
            double valorSaque = scanner.nextDouble();

            // Verifica se o valor do saque ultrapassa o limite diário
            if (totalSaque + valorSaque > limiteDiario) {
                System.out.println("Limite diário de saque atingido.");
                break; // Encerra o loop
            }

            // Atualiza o total de saques realizados
            totalSaque += valorSaque;

            // Informa que o saque foi realizado com sucesso
            System.out.println("Saque de R$" + valorSaque + " realizado com sucesso.");
        }

        // Fecha o scanner
        scanner.close();
    }
}
