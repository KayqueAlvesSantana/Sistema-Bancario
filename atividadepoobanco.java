package POO;
import entidades.poobanco;
import java.util.Scanner;

public class atividadepoobanco {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    poobanco banco;

    System.out.print("Digite o número da sua conta: ");
    double numerodaconta = sc.nextDouble();
    System.out.print("Qual nome do titular? ");
    sc.nextLine();
    String nomedotitular = sc.nextLine();
    System.out.println();

    System.out.println("Você gostaria de depositar algum valor? Digite S para SIM e N para Não: ");
    char resposta = sc.next().charAt(0);
    
    if (resposta == 'S'){
        System.out.print("Deposite um valor inicial: ");
        double depositoinicial = sc.nextDouble();
        System.out.println("Valor depositado: ");
        System.out.print(depositoinicial);

        banco = new poobanco(numerodaconta, nomedotitular, depositoinicial);

    }

    else {
        banco = new poobanco(numerodaconta, nomedotitular);
    }

    System.out.println();
    System.out.print("Informações atualizadas: " + banco);
    System.out.println();
    System.out.print("Deposite outro valor: ");
    double deposito = sc.nextDouble();
    banco.depositar(deposito);

    System.out.println();
    System.out.print("Saque um valor: ");
    double saque = sc.nextDouble();
    banco.sacar(saque);
    
    System.out.println();
    System.out.println("Informações atualizadas: " + banco);

    sc.close();
    }
}
