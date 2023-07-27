package br.com.conversordemoeda;

import java.util.Scanner;

public class ConversorMoedas {

		private static Scanner ValorEmReais;


		public static double converter(double moedaCambio, double leitor ) {
			double moedaReal = leitor;
			double total = moedaReal * moedaCambio;
			return total;
			}
		public static double converter2(double moedaCambio, double leitor ) {
			double moedaReal = leitor;
			double total = moedaReal / moedaCambio;
			return total;
		}



		public static void saida(double cotacao, String moeda) {

			System.out.println("Digite um valor Em Real:");
			ValorEmReais = new Scanner(System.in);
			double d = ValorEmReais.nextDouble();
			System.out.println("A Converção de " + moeda +  " Para Reais é: " + ConversorMoedas.converter(cotacao,d));
			
		}
		public static void saida2(double cotacao, String moeda) {

			System.out.println("Digite um valor Em "+ moeda + " :"  );
			ValorEmReais = new Scanner(System.in);
			double d = ValorEmReais.nextDouble();
			System.out.println("A Converção de Reais  Para" + moeda + " e: "+ ConversorMoedas.converter2(cotacao,d));
			
		}


	
	
}
