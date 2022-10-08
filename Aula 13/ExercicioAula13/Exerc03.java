// 3 - Faça um programa que peça dois número e imprima a soma
import java.util.Scanner;


public class Exerc03{

    public static void main (String [] arges){

        Scanner scan = new Scanner(System.in);

        System.out.println ("Entre com o primeiro número:");
        int num1 = scan.nextInt();

        System.out.println ("Entre com o segundo número:");
        int num2 = scan.nextInt();
        
        int resultado = num1 + num2;
        System.out.println("A soma dos numeros é " + resultado);

    }
}


