// 5 - Faça um programa que peça um raio de um circulo, calcule e mostre asua área

import java.util.Scanner;


public class Exerc06{

    public static void main (String [] arges){

        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o raio do circulo");
        double raio = scan.nextDouble();

        double area = Math.PI * Math.pow (raio, 2);
        System.out.println("A área do circulo é: " +area);

    }
}

