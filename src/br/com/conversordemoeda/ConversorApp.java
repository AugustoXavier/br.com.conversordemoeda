package br.com.conversordemoeda;

import java.util.Scanner;

public class ConversorApp {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int input = 0;
		
		while (input != 6) {
			Moedas.exibirMenu();
			input = entrada.nextInt();
		
			switch (input) {
	
			case 1:
				//Dolar
				ConversorMoedas.saida(4.80,"Dolar");
				break;
			case 2:
				//Euro
				ConversorMoedas.saida(5.34, "Euro");
				break;
			case 3:
				//Libras
				ConversorMoedas.saida(6.16, "Libra");
				break;
			case 4:
				//Peso Argentino
				ConversorMoedas.saida(0.018, "Peso Argentino");
				break;
			case 5:
				//Peso Chileno
				ConversorMoedas.saida(0.0059 , "Peso Chileno");
				break;
			case 6:
				System.out.println("Fim do Programa!");
				break;

			default:
				System.out.println("Digite uma opção valida");
				break;
			}		
		}
		System.out.println("");

		entrada.close();
	}

}
