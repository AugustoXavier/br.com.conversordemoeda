package br.com.conversordemoeda;

import java.util.Scanner;

public class ConversorApp {

	public static void main(String[] args) {
		Scanner entrada1 = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		int input = 0;
		int opcao = 0;
		System.out.println("------------------------------------------------------------------");
		System.out.println("                        Conversor de Moeda                        ");
		System.out.println("------------------------------------------------------------------");
		System.out.println("Digite [1] Para converter de Real Para Outra Moeda e [2] o Inverso");
		opcao = input = entrada2.nextInt(); 
		if(opcao == 1) {
		while (input != 6) {
			Moedas.exibirMenu();
			input = entrada2.nextInt();
		
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
		}}else if (opcao == 2){
			while (input != 6) {
				Moedas.exibirMenuReal();
				input = entrada2.nextInt();
			
				switch (input) {
		
				case 1:
					//Dolar
					ConversorMoedas.saida2(4.80,"Dolar");
					break;
				case 2:
					//Euro
					ConversorMoedas.saida2(5.34, "Euro");
					break;
				case 3:
					//Libras
					ConversorMoedas.saida2(6.16, "Libra");
					break;
				case 4:
					//Peso Argentino
					ConversorMoedas.saida2(0.018, "Peso Argentino");
					break;
				case 5:
					//Peso Chileno
					ConversorMoedas.saida2(0.0059 , "Peso Chileno");
					break;
				case 6:
					System.out.println("Fim do Programa!");
					break;

				default:
					System.out.println("Digite uma opção valida");
					break;
				}		
			}
		}else{
			System.out.println("Fim do Programa!");
			};
		
		entrada1.close();
		entrada2.close();
	}

}
