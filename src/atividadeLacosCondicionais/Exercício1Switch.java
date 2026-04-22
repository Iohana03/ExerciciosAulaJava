package atividadeLacosCondicionais;

import java.util.Scanner;

public class Exercício1Switch {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int codigo, quantidade;
		String produto = "";
		double preco = 0;
		double ValorTotal;

		System.out.println("Digite o Código do Produto: ");
		codigo = leia.nextInt();

		System.out.println("Digite a Quantidade: ");
		quantidade = leia.nextInt();

		switch (codigo) {

		case 1:
			produto = "Cachorro Quente";
			preco = 10.00;
			break;

		case 2:
			produto = "X-Salada";
			preco = 15.00;
			break;

		case 3:
			produto = "X-Bacon";
			preco = 18.00;
			break;

		case 4:
			produto = "Bauru";
			preco = 12.00;
			break;

		case 5:
			produto = "Refrigerante";
			preco = 8.00;
			break;

		case 6:
			produto = "Suco de laranja";
			preco = 13.00;
			break;

		default:
			System.out.println("Código digitado inválido!");

		}
		ValorTotal = quantidade * preco;

		System.out.println("Produto: " + produto +"\nValor total: " + ValorTotal);

	}

}
