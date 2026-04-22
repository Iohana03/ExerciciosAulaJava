package primeiraAtividade;

import java.util.Scanner;

public class Testes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*int nota = 7;

		if (nota >= 9) {
		    System.out.println("Ótimo");
		} else if (nota >= 6) {
		    System.out.println("Aprovado");
		} else {
		    System.out.println("Reprovado");
		}
		
		-----------------------------
		
		for (int i = 0; i < 11; i++) {
			
			System.out.println("Número " + i);
		} //começa em 0, vai até < 5, incrementa i++
  
        ------------------------------
  
  
		int opcao =2;
		
		switch (opcao) {
		
		case 1:
			System.out.println("Você escolheu 1");
		break;
		
		case 2:
			System.out.println("Você escolheu 2");
			break;
			
		case 3:
			System.out.println("Você escolheu o 3");
		break;
		
		default:
			System.out.println("Opção inválida");
		
		} // break evita que execute os próximos casos / default é o “else” do switch
	
		---------------------------
		
		int [] numeros = {10,20,30,40};
		
		//System.out.println(numeros[0]); // Ira exibir o 10, o índice sempre começa em 0
		
		for (int i = 0; i < numeros.length; i++ ) {
			
			System.out.println(numeros [i]);
		}
		
		int[] numeros = {10, 20, 30, 40};

		for (int num : numeros) {
		    System.out.println(num);
		}
		*/

	        System.out.println("Digite o primeiro número:");
	        double n1 = sc.nextDouble();

	        System.out.println("Digite o segundo número:");
	        double n2 = sc.nextDouble();

	        System.out.println("Digite a operação (+, -, *, /):");
	        String op = sc.next(); // lê como String

	        double resultado = 0;

	        switch (op) {
	            case "+":
	                resultado = n1 + n2;
	                break;
	            case "-":
	                resultado = n1 - n2;
	                break;
	            case "*":
	                resultado = n1 * n2;
	                break;
	            case "/":
	                if (n2 != 0) {
	                    resultado = n1 / n2;
	                } else {
	                    System.out.println("Erro: divisão por zero");
	                    return;
	                }
	                break;
	            default:
	                System.out.println("Operação inválida");
	                return;
	        }

	        System.out.println("Resultado: " + resultado);

	       
}
	
}

