package codes;

import java.util.Scanner;

public class DurchschnittsRechner {

	public static void main (String[]args) {
		Scanner eingabe = new Scanner(System.in);
		begrüßung("Durchschnittsrechner  ");
		berechnung(eingabe);
	}
	public static void begrüßung (String x) {
		
		for (int i = 0 ; i < 5; i++) {
			System.out.println();
			for (int j = 0; j < 5; j++) {
				System.out.print(x);
			}
		}
		System.out.printf("%n%n");
		System.err.println("Für Ergebnis bitte 00 und Enter");
		System.out.printf("%n%n");
	}
	
	public static void berechnung (Scanner eingabe) {
		int zählerEingabe = 0;
		double zahl, summe = 0;
		do {
			
			zählerEingabe = zählerEingabe +1;
			System.out.printf("%d. Zahl Eingabe: ", zählerEingabe);
			zahl = eingabe.nextDouble();
			summe += zahl;
			
			
		}while(zahl != 00);
		summe /= (zählerEingabe-1);
		System.out.printf("Der Durschnitt von den %d. Zahlen ist %.2f ", zählerEingabe, summe);
	}
}
