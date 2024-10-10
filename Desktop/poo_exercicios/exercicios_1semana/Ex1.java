package exercicios_1semana;
import java.util.Scanner;

public class Ex1{
    public static void main(String[] args) {
        Scanner escreve = new Scanner(System.in);
        System.out.println("Olá! DIGITE UM NÚMERO:");
        int num = escreve.nextInt();
        System.out.println(num + " é o número digitado.");
        escreve.close();
    }
}