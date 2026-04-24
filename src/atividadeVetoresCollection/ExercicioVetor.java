package atividadeVetoresCollection;

import java.util.Scanner;

public class ExercicioVetor {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int [] vetor = new int [10];
		int numero;
		boolean encontrado =false;
		
		for (int i =0; i < 10; i++) {
		   System.out.println("Digite o " + (i + 1) + "º número:");
		   vetor[i]= leia.nextInt();
		}
		
		System.out.println("Digite o número que você deseja encontrar: ");
		numero = leia.nextInt();
		
		for (int i =0; i < 10; i++) {
			if(vetor[i] == numero) {
				System.out.println("Número encontrado na posição: " + i );
				encontrado =true;
			}
		}
			
			if (!encontrado) {
				
				System.out.println("Não foi encontrado!");
				
			}
			
		}
		
		
	}

