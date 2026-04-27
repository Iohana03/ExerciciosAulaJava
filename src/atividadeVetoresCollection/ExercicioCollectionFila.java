package atividadeVetoresCollection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioCollectionFila {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();

		int opcao;
		String nome;

		while (true) {
			System.out.println("\n*******************");
			System.out.println("1 - Adicionar Cliente na Fila");
			System.out.println("2 - Listar todos os Clientes");
			System.out.println("3 - Retirar Cliente da Fila");
			System.out.println("0 - Sair");
			System.out.println("*******************");
			System.out.print("Entre com a opção desejada: ");
			opcao = leia.nextInt();
			leia.nextLine();

			if (opcao == 0) {
				System.out.println("nPrograma Finalizado!");
				break;
			}

			switch (opcao) {

			case 1:
				System.out.print("Digite o nome: ");
				nome = leia.nextLine();

				fila.add(nome);

				System.out.println("\nFila:");
				for (String cliente : fila) {
					System.out.println(cliente);
				}

				System.out.println("Cliente Adicionado!");
				break;

			case 2:
				System.out.println("\nLista de Clientes na Fila:");
				for (String cliente : fila) {
					System.out.println(cliente);
				}
				break;

			case 3:
				if (fila.isEmpty()) {
					System.out.println("A Fila está vazia!");
				} else {
					fila.poll();

					System.out.println("Fila:");
					for (String cliente : fila) {
						System.out.println(cliente);
					}

					System.out.println("O Cliente foi Chamado!");
				}
				break;

			default:
				System.out.println("\nOpção Inválida!");
			}
		}

	}

}
