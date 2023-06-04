package POO;

import java.util.Scanner;

import entidades.pooproduto; 

public class pooatividade {
    public static void main(String[] Args) {
        pooproduto produto;
        produto = new pooproduto();

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as informações do produto: ");
        System.out.print("Nome: ");
        produto.nome = sc.nextLine();
        System.out.print("Preço: ");
        produto.preco = sc.nextDouble();
        System.out.print("Quantidade: ");
        produto.quantidade = sc.nextInt();

        System.out.println();
        System.out.println(produto);

        System.out.print("Quantos produtos serão adicionadas no estoque: ");
        int quantidade = sc.nextInt();  
        produto.adicionarquantidade(quantidade);

        System.out.print("Quantos produtos serão removidos do estoque? ");
        quantidade = sc.nextInt();
        produto.removerprodutos(quantidade);

        System.out.println();
        System.out.print("Informações atualizadas: " + produto);
        
        sc.close();
    }
    
}
