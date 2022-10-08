// Tendo como dados de entrada a altura de uma pessoa, construa um algoritimo
// que calcule seu peso ideal , usando a seguinte formula (72.7*altura)-58



import java.util.Scanner;

public class Exerc12{

    public static void main (String [] arges){

        Scanner scan = new Scanner(System.in);

        System.out.println ("Entre com a altura");
        double altura = scan.nextDouble();
        double pesoIdeal = (72.7 * altura) - 58;

        System.out.println("O peso ideal é " + pesoIdeal);

    }
}

