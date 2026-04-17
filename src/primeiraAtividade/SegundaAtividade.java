package primeiraAtividade;

import java.util.Scanner;

public class SegundaAtividade {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
       float nota1,nota2,nota3,nota4,calculamedia;
		
		System.out.println("Digite a Primeira Nota: ");
		nota1 = leia.nextFloat();
		
		System.out.println("Digite a Segunda Nota: ");
		nota2 = leia.nextFloat();
		
		System.out.println("Digite a Terceira Nota: ");
		nota3 = leia.nextFloat();
		
		System.out.println("Digite a Quarta Nota: ");
		nota4 = leia.nextFloat();
		
		calculamedia= (nota1+ nota2+ nota3 +nota4)/4;
		
		System.out.println("Sua media final é:  " + calculamedia);
		

	}

}
