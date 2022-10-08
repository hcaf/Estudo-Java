// Faça um programa que pergunte quanto você ganha por hora e o numero de horas trabalhadas no mês. Calcule
// e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o imposto de 
// Renda, 8% para o INSS e 5% para o sindicato, faça um porgrama que nos dê: Salário Bruto 
// a - Quanto pagou ao INSS
// b - Qaunto pagou ao Sindicato 
// c - Salário liquido 
// d - Calcule os descontos e o salário liquido, conforme a tabela abaixo:
// + salario Bruto : R$ - IR (11%) : INSS (8%) : R$ - Sindicato (5%) : R$ = Salário Liquido : R$

import java.util.Scanner;

public class Exerc13{

    public static void main (String [] arges){
        double valorHora;
            Scanner scan = new Scanner(System.in);

        System.out.println ("Entre com o valor/hora");
        valorHora = scan.nextDouble();

        System.out.println("Entre com a quantidade de horas trabalhadas no mês");
        double horas = scan.nextDouble();

                double salarioBruto = valorHora * horas;
                double inss = (salarioBruto / 100) * 8;
                double sindicato = (salarioBruto / 100) * 5;
                double ir = (salarioBruto / 100) * 11;
                double totalDescontos = inss + sindicato + ir;
                double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("O Salario bruto: " + salarioBruto);
        System.out.println("INSS: " + inss);
        System.out.println("Sindicato: " + sindicato);
        System.out.println("IR: " + ir);
        System.out.println("Total de descontos: " + totalDescontos);
        System.out.println("Salario liquido: " + salarioLiquido);

        }
    }

    





