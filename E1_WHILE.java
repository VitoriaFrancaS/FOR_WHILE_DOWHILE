package CodigoInicial;

import java.util.Scanner;

public class E1_WHILE {

	public static void main(String[] args) {
			
		int idade, SomaMenor=0, SomaMaiores=0;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Digite a sua idade: ");
		idade = input.nextInt();
		
		while (idade !=0) {
			if (idade <21 ) {
				SomaMenor ++;
				}else if (idade > 50) {
					SomaMaiores ++;
				}
			System.out.println("Digite a sua idade: ");
			idade = input.nextInt();
		}
			System.out.println("\n Soma dos menores de 21 anos: "+SomaMenor);
			System.out.println("\n Soma dos maiores de 50 anos: "+SomaMenor);
	}

}
