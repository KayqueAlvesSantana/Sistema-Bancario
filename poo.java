/*O Triângulo é minha classe, ele tem três atributos que são os 3 lados, declarei esses 3 atributos 
 no projeto "triangulo".
 Nesse projeto, eu instanciei(criei) duas variáveis, "X E Y", elas vão representar os dois triângulos 
 Assim, 
 */ 
package POO;

import java.util.Scanner;

import entidades.pootriangulo;

public class poo {
    public static void main(String[] args){ 
    Scanner sc = new Scanner(System.in);
// Atribuí duas variáveis para o triângulo, cada um simbolizando cada triângulo //
//Intanciei as variáveis para criar espaços na memória, para acessar os atributos do x, que são os lados//
    pootriangulo x,y;
    x = new pootriangulo();
    y = new pootriangulo();

    System.out.println("Digite os lados do triângulo X");
    x.a = sc.nextInt();
    x.b = sc.nextInt();
    x.c = sc.nextInt();

    System.out.println("Digite os lados do triângulo Y");
    y.a = sc.nextInt();
    y.b = sc.nextInt();
    y.c = sc.nextInt();
    
    double areax = x.area();
    double areay = y.area();
    
    System.out.print("Área do triângulo X: " + areax);
    System.out.print("Área do triângulo Y: " + areay);

    sc.close();

    }
}
