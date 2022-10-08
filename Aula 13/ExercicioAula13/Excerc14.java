// Faça um programa que peça o tamanho de um download (em MB) e a velocidade de um link de internet
// (em Mbps), calcule e informe o tempo aproximando de download do arquivo usando link (em minutos)

import sun.lwawt.macosx.CSystemTray;

import java.util.Scanner;

public class Excerc14 {
    public static void main (String[] arges){

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o tamanho do arquivo:");
        double tamArquivo = scan.nextDouble();

        System.out.println("Entre com a velocidade da internet:");
        double velInternet = scan.nextDouble();

        double tempo = tamArquivo / velInternet;

        System.out.println("Tempo de download:" + tempo);

    }
}

