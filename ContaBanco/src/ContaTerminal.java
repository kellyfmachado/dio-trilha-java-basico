import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        //Conhecer e importar a classe Scanner
        Scanner userDate = new Scanner(System.in).useLocale(Locale.US);

        //Exibir as mensagens para o nosso usuário e obter pela scanner os valores digitados no terminal
        System.out.println("Por favor, digite o número da conta!");
        int account = userDate.nextInt();

        System.out.println("Por favor, digite o nome da Agência!");
        String agency = userDate.next(); 

        System.out.println("Por favor, digite seu nome!");
        String name = userDate.next();

        System.out.println("Por favor, digite o saldo da sua conta!");
        double balance = userDate.nextDouble();

        //Exibir a mensagem conta criada
        System.out.println("Olá "+name+", obrigado por criar uma conta em nosso banco, sua agência é "+agency+", conta "+account+" e seu saldo "+balance+" já está disponível para saque!");

    }
}
