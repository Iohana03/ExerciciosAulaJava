package atividadeVetoresCollection;
import java.util.Scanner;
import java.util.Stack;

public class ExercicioCollectionPilha {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Stack<String> pilha = new Stack<String>();
		
		int opcao;
		String nome;
		
		while(true) {
			
			System.out.println("Digite uma opção:");
			opcao = leia.nextInt();
			leia.nextLine();
			
			switch(opcao) {
			
			case 1:
				System.out.println("Digite o nome:");
				nome = leia.nextLine();
				
				pilha.push(nome);
				
				System.out.println("Pilha:");
				for(String livro : pilha) {
					System.out.println(livro);
				}
				
				System.out.println("Livro adicionado!");
				break;
				
			case 2:
				System.out.println("Lista de Livros na Pilha:");
				for(String livro : pilha) {
					System.out.println(livro);
				}
				break;
				
			case 3:
				if(pilha.isEmpty()) {
					System.out.println("A Pilha está vazia!");
				}else {
					pilha.pop();
					
					System.out.println("Pilha:");
					for(String livro : pilha) {
						System.out.println(livro);
					}
					
					System.out.println("Um Livro foi retirado da pilha!");
				}
				break;
				
			case 0:
				System.out.println("\nPrograma Finalizado!");
				leia.close();
				return;
			}
		}
		
		
	}

}
