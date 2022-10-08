// 4 - Faça um programa que peça as 4 notas bimestrais e mostre a média.
import java.util.Scanner;

public class Exerc04{

    public static void main (String [] arges){

        Scanner scan = new Scanner(System.in);

        System.out.println ("Entre com o primeira nota:");
        double nota1 = scan.nextDouble();

        System.out.println ("Entre com o segunda nota:");
        
        double nota2 = scan.nextDouble();

        System.out.println ("Entre com o terceira nota:");
        double nota3 = scan.nextDouble();

        System.out.println ("Entre com o quarta nota:");
        double nota4 = scan.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A média é: " + media);


    }
}




