// 8 - Faça um programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês
//Calcule e mostre o total do seu salario no referio mês.

import java.util.Scanner;

public class Exerc08{

    public static void main (String [] arges){

        Scanner scan = new Scanner(System.in);

        System.out.println ("Entre com o valor/hora");
        double valorHora = scan.nextDouble();

        System.out.println("Entre com a quantidade de horas trabalhadas no mês");
        double horas = scan.nextDouble();

        double salario = valorHora * horas;
        System.out.println("O salario é de: " + salario);


    }
}

