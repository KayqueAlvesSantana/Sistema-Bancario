package POO;

import java.util.Scanner;

import entidades.estaticodolar;

public class membroestatico {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Qual a cotação do dólar: ");
        double cotacao = sc.nextDouble();
        System.out.print("Quantos dólares vai comprar? ");
        double compra = sc.nextDouble();

        double calculo = estaticodolar.conversao(cotacao, compra);


        System.out.print("Você vai pagar: " + calculo);

        sc.close();
    }
}
