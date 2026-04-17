package primeiraAtividade;

import java.util.Scanner;

public class PrimeiraAtividade {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float salario,abono, novosalario;
		
		System.out.println("Digite o Salário: ");
		salario= leia.nextFloat();
		
		System.out.println("Digite o Abono: ");
		abono= leia.nextFloat();
		
		novosalario = salario + abono;
		
		System.out.println("O novo salário é de: " + novosalario);

	}

}
