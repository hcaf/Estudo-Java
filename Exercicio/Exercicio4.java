public class Exercicio4 {
	public static void main(String[] args) {
	
		int nota1 = 7;
		int nota2 = 8;
		int nota3 = 6;
		int media;
		
		media = (nota1 + nota2 + nota3) / 3;
			if (media >= 7) {
				System.out.println("Aprovado com Conceito A e média "+media);
			}
			else if (media >= 5 && media < 7) {
				System.out.println("Aprovado com Conceito B e média "+media);	
				// não entendi o porque não se pediu nada para o comando
			}
			else 
				System.out.println("Reprovado com Conceito C e média "+media);	
	}
}
