package atividadeLacoRepeticao;

import java.util.Scanner;

public class ExercicioWhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade =0;
		int menores21=0;
		int maiores50=0;
		
		System.out.println("Digite uma idade: ");
		idade = leia.nextInt();
		
		while(idade >= 0) {
			
			if (idade <21) {
				
				menores21++;
			}
			if (idade >50) {
				
				maiores50++;
			}
			
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();
		}
		
		System.out.println("Total de pessoa menores de 21 anos: " + menores21);
		System.out.println("Total de pessoa maiores de 50 anos: " + maiores50);
		
	}

}
