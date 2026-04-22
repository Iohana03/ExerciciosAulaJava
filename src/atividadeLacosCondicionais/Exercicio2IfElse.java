package atividadeLacosCondicionais;

import java.util.Scanner;

public class Exercicio2IfElse {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int idade;
		String nome;
		boolean PrimeDoacao;
		
		System.out.println("Digite o Nome do doador: ");
		nome = leia.nextLine();
		
		System.out.println("Digite a Idade do doador: ");
		idade = leia.nextInt();
		
		System.out.println("Primeira doação de sangue?\n(Digite true se sim ou false se não) ");
		PrimeDoacao = leia.nextBoolean();
		
		if  (idade >= 18 && idade <= 59) {
		    System.out.println(nome + " está apto para doar sangue!");
		    
		}
		else if (idade >= 60 && idade <= 69 && PrimeDoacao == false ) {
			System.out.println(nome + " está apto para doar sangue!");
		
		}  else {
            System.out.println(nome + " não está apto para doar sangue!");
        }
		
	
		
	}

}
