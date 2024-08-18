import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       //TODO:conhecer e importar a classe scanner

       //Exibir as mensagens para nosso usuario

       //obter pela classe scanner os valores digitados no terminal

       //Exibir a mensagem final

       Scanner scanner = new Scanner(System.in);

       
       System.out.println("Digite o número da conta");
       int numConta = scanner.nextInt();

       System.out.println("Digite a agência da conta");
       String agencia = scanner.next();

       System.out.println("Digite o nome do cliente");
       String nome_Cliente = scanner.next();

       System.out.println("Digite o saldo da conta");
       double saldo = scanner.nextDouble();

       System.out.println("Seja bem vindo " + nome_Cliente + " Obrigado por abrir uma conta em nosso banco! Sua agência é a:" + agencia + ", conta de número: " + numConta + " E fique tranquilo que seu saldo ja está disponível para o saque. Saldo: " + saldo + " 1Obrigado e seja bem vindo!");


       






       





       scanner.close();
    }
}
