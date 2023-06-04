package POO;

import java.util.Scanner;

import entidades.pooretangulo;

public class pooatividaderetangulo { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        pooretangulo retangulo;
        retangulo = new pooretangulo();
    
    System.out.print("Digite a base do retângulo: ");
    retangulo.base = sc.nextDouble();
    System.out.print("Digite a altura do retângulo: ");
    retangulo.altura = sc.nextDouble();

    double area = retangulo.area();
    double perimetro = retangulo.perimetro();
    double diagonal = retangulo.diagonal();

    System.out.println("Área: " + area);
    System.out.println("Perímetro: " + perimetro);
    System.out.println("Diagonal: " + diagonal);
        
    sc.close();
    }

}