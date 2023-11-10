package CodigoInicial;

import java.util.Scanner;

public class E1_FOR {

	public static void main(String[] args) {
		
		int  num1, num2, x;
		
		
		try (Scanner input = new Scanner (System.in)) {
			
			System.out.println("Entre com um número");
			num1 = input.nextInt();
			
			System.out.println("Entre com um número");
			num2 = input.nextInt();
			
			if (num1 > num2) {
				System.out.println("\n Não é possível fazer o laço");
			} else {
				for (x=num1; x <=num2; x++) {
					if (x % 3 == 0 && x % 5 == 0) {
					System.out.println("\nO número" +x+ " é mútiplo por 3 e 5");
					
				}
			}
				}
				
					}
			}
}
