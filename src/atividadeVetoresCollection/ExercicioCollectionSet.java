package atividadeVetoresCollection;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class ExercicioCollectionSet {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		Set<Integer> numeros = new HashSet<>();
		
		 for (int i = 0; i < 10; i++) {
	            System.out.print("Digite o " + (i + 1) + "º número: ");
	            numeros.add(leia.nextInt());
	        }
		 System.out.print("Digite o número que deseja buscar: ");
	        int numero = leia.nextInt();
		
	        if (numeros.contains(numero)) {
	            System.out.println("Número " + numero + " encontrado!");
	        } else {
	            System.out.println("O número " + numero + " não foi encontrado!");
	        }
		
	}

}
