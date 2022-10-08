//11 - Faça um programa que peça 2 números inteiros e um número real Calcule e mostre.
// a - O produto do dobro do primeiro com metade do segundo
// b - A soma do triplo do primeiro com o terceiro 
// c - O terceiro elevado ao cubo 


import java.util.Scanner;

public class Exerc11{

    public static void main (String [] arges){

        Scanner scan = new Scanner(System.in);

        System.out.println ("Entre com um numero inteiro");
        int num1 = scan.nextInt();

        System.out.println ("Entre com um outro numero inteiro");
        int num2 = scan.nextInt();

        System.out.println ("Entre com um numero real");
        double num3 = scan.nextDouble();

        int resultado1 = (num1 * 2)  * (num2 / 2);
        double resultado2 = (num1 * 3)  + num3;
        double resultado3 = Math.pow (num3, 3);

        System.out.println("Resultado 1; " + resultado1);
        System.out.println("Resultado 2; " + resultado2);
        System.out.println("Resultado 3; " + resultado3);

    }
}


