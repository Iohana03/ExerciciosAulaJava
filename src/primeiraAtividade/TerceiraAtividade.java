package primeiraAtividade;

import java.util.Scanner;

public class TerceiraAtividade {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float salabruto,adicinotur,horaextra,descontos,salarioliquido;
		
		System.out.println("Digite o seu Salário Bruto: ");
		salabruto = leia.nextFloat();
		
		System.out.println("Digite o seu Adicional Noturno: ");
		adicinotur =leia.nextFloat();
		
		System.out.println("Digite a sua Hora Extra: ");
		horaextra = leia.nextFloat();
		
		System.out.println("Digite o seus Descontos : ");
		descontos = leia.nextFloat();
		
		salarioliquido = salabruto + adicinotur + (horaextra * 5) - descontos;
		
		System.out.println("O seu Salário Líiquido é de: " + salarioliquido);
		
		
	}

}
