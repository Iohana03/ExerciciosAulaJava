package atividadeVetoresCollection;

import java.util.Scanner;
import java.util.ArrayList;

public class ExercicioCollectionArrayList {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		 ArrayList<Integer> lista = new ArrayList<>();
		 
		 for (int i = 0; i < 10; i++) {
	            System.out.print("Digite o " + (i + 1) + "º número: ");
	            lista.add(leia.nextInt());
	        }
		 System.out.print("Digite o número que deseja buscar: ");
	        int numero = leia.nextInt();
	        
	        int posicao = lista.indexOf(numero);
	        
	        if (posicao != -1) {
	            System.out.println("Número encontrado na posição: " + posicao);
	        } else {
	            System.out.println("O número " + numero + " não foi encontrado!");
	        }
		
	}

}
