import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Exibir as mensagens para o nosso usuário
        //Obter pela scanner os valores digitados no terminal 
        System.out.println("Por favor, digite o número da Agência: ");
        int agencia = scanner.nextInt();

        System.out.println("Por favor, digite o número da Conta: ");
        String conta = scanner.next();

        System.out.println("Por favor, digite o seu Nome: ");
        String cliente = scanner.next();

        double saldo = 1024.35;
        
        System.err.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo R$" + saldo + " já está disponível para saque");
        //Exibir a mensagem conta criada 

    }
}
