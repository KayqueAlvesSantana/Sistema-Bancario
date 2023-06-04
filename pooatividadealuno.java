package POO;

import java.util.Scanner;
import entidades.pooaluno;

public class pooatividadealuno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        pooaluno aluno;
        aluno = new pooaluno();
        
        System.out.print("Digite o nome do aluno: ");
        aluno.nome = sc.nextLine();
        System.out.println("Digite as notas do aluno");
        System.out.print("Nota 1: ");
        aluno.nota1 = sc.nextDouble();
        System.out.println();
        System.out.print("Nota 2: ");
        aluno.nota2 = sc.nextDouble();
        System.out.println();
        System.out.print("Nota 3: ");
        aluno.nota3 = sc.nextDouble();
    
        if (aluno.soma() < 60) {
            System.out.println("Final grade: " + String.format("%.2f", aluno.soma()));
            System.out.println("Reprovado");
            System.out.println("Faltou: " + aluno.avaliacao() + " pontos" );
        }
        else {
            System.out.println(aluno.soma());
            System.out.print("Passou");
        }
        sc.close();
    }
}