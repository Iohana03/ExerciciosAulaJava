package atividadeLacosCondicionais;

import java.util.Scanner;

public class Exercício2Switch {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int CodCargo;
		float Salario,NovoSalario,percentual= 0;
		String Nome, Cargo = "";

		System.out.println("Nome do Colaborador:");
		Nome = leia.nextLine();

		System.out.println("Cargo:");
		CodCargo = leia.nextInt();

		System.out.println("Salário:");
		Salario = leia.nextFloat();

		switch (CodCargo) {

		case 1:
			Cargo = "Gerente";
			percentual = 0.10f;
			break;

		case 2:
			Cargo = "Vendedor";
			percentual = 0.07f;
			break;

		case 3:
			Cargo = "Supervisor";
			percentual = 0.09f;
			break;

		case 4:
			Cargo = "Motorista";
			percentual = 0.06f;
			break;

		case 5:
			Cargo = "Estoquista";
			percentual = 0.05f;
			break;

		case 6:
			Cargo = "Técnico de TI";
			percentual = 0.08f;
			break;

		default:
			System.out.println("Código Inválido");
		}
		
		NovoSalario = Salario + (percentual*Salario);
		
		System.out.println("Nome do Colaborador: " + Nome +  "\nCargo: " + Cargo + "\nSalário: " + NovoSalario);
	}

}
