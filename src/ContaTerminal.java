import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor,digite o número da conta.");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência.");
        String agencia = scanner.next();

        System.out.println("Muito bem, agora digite seu Nome:");
        String nomeCliente = scanner.next();

        double saldoAoCriar = 237.48;

//        imprimir os dados obtidos
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco," +
                " sua agência é " + agencia + ", conta " +
                conta + " e seu saldo " + saldoAoCriar + " já está disponível para saque");

    }
}
