package POO;
import java.util.Scanner;
import entidades.construtoresproduto;

public class atividadeconstrutores {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        /* Criei variável temporária para iniciar com valores que obriquei no construtor */
        System.out.println("Digite as informações do produto: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Preço: ");
        Double preco = sc.nextDouble();

        construtoresproduto produto = new construtoresproduto(nome, preco);

/*Utilizando encapsulamento, privando detalhes sobre classe para que usuário não acesse */
/*Para acessar o nome e realizar alterações, preciso */
        System.out.print("Você errou o nome do produto e o valor, deixe eu atualizar as informações corretas");
        produto.setNome("Computador");
        System.out.print(produto.getNome());
        produto.setPreco((double)1200);
        System.out.println("Novo preço: " + produto.getPreco()); 

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
