import java.util.Scanner;

//10 - Faça um programa que peça a temperatura em graus Celcius, transformee
// mostre a temperatura em graus Farenheit.

public class Exerc10{

    public static void main (String [] arges){

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a temperatura em Celsius:");
        double c = scan.nextDouble();

        double f = (c * 1.8) + 32;

        System.out.println("A temperatura " + c + "C é igual a" + f + "F");

    }
}


