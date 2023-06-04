package POO;

import entidades.poofuncionario;
import java.util.Scanner;

public class pooatividadefuncionarios {
    public static void main(String[] Args) {

    Scanner sc = new Scanner(System.in);

    poofuncionario funcionario;
    funcionario = new poofuncionario(); 

    String nome;

    System.out.print("Nome: ");
    funcionario.nome = sc.nextLine(); 
    System.out.println();
    System.out.print("Salário: ");
    funcionario.salario = sc.nextDouble();
    System.out.println();
    System.out.print("Qual valor da Taxa: ");
    funcionario.taxa = sc.nextDouble(); 
    System.out.println();
    System.out.print("Qual a porcentagem de aumento do salário? ");
    double porcentagem = sc.nextDouble();
    funcionario.aumento(porcentagem);

    System.out.println();
    System.out.print("Salário atualizado: " + funcionario);

    sc.close();
    }
}
