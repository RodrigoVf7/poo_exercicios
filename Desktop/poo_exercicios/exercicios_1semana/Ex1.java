package exercicios_1semana;
import java.util.Scanner;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: "); 
        double num1 = scanner.nextDouble(); 
        System.out.print("Digite o segundo número: "); 
        double num2 = scanner.nextDouble(); 
        double soma = num1 + num2; 
        System.out.println("A soma é: " + soma); 
        scanner.close(); 
    }
}
