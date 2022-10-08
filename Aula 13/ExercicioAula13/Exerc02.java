// 2 - Faça um programa que peça um número e então mostre a mensagem, O numero informado foi [número].

import java.util.Scanner;

public class Exerc02{

    public static void main (String [] arges){

        Scanner scan = new Scanner (System.in);
        
        System.out.println("Entre com um numero inteiro:");
        int numero = scan.nextInt();
        System.out.println("O número information foi: " + numero);
    }
}

