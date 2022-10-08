//barato
//  valor <=10 pode comprar
//  valor >10 <15 - pedir desconto
//15 >= 15 valor <17 - pesquisar mais
// >= 17 muito caro

import java.util.Scanner;

public class PrecoBaixo {

    public static void main (String[] arges){

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o valor do item");
        double valor = scan.nextDouble();

        if (valor <=10) {
            System.out.println("Esta barato, pode comprar");
        } else if (valor > 10 && valor <15) {
            System.out.println("Você pode pedir desconto");
        } else if (valor >= 15 && valor < 17) {
            System.out.println("Pode pesquisar mais");
        } else if (valor >= 17) {
            System.out.println("Muito caro");

        }
    }
}


