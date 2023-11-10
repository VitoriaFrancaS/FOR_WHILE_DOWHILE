package CodigoInicial;

import java.util.Scanner;

public class E1_DoWhile {

	public static void main(String[] args) {
			
		int num, soma = 0;
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Escreva qualquer número seja negativo ou positivo: ");
			num = input.nextInt();
			
			do {
					if (num > 0) {
						soma += num;
						
						
					}
					
					System.out.println("Escreva qualquer número seja negativo ou positivo: ");
					num = input.nextInt();
				
			}while(num !=0);
		} 
		
		System.out.println("\nA soma dos números positivos é: " +soma);
	}

}
