package milosbogdanovic;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Odaberite brojeve od 1 do 3 za željenu pretragu!");
		System.out.println("Linear search: 1");
		System.out.println("Binary search: 2");
		System.out.println("Fibonnaci search: 3");
		System.out.print("Unesite broj: ");
		int n = sc.nextInt();

		Pretrazivanje pretraga = new Pretrazivanje();

		switch (n) {
		case 1: {
			System.out.println("Odabrali ste Linear search!");
			pretraga.linearSearch();
			System.out.println(
					"\nLinear search (takođe poznat kao sekvencijalno pretraživanje) je jedan od najjednostavnijih algoritama za pretraživanje podataka.\nRadi tako što prolazi kroz niz elemenata i poredi svaki element sa ciljnom vrijednosti dok se ne pronađe ciljni element ili dok se ne pretraži celi niz.\nJedna od prednosti linearnog pretraživanja je njegova jednostavnost i primjenjivost na bilo koju vrstu podataka.\nNedostatak je taj što zbog vremenske složenosti nije pogodan za velike nizove!  ");
			break;
		}
		case 2: {
			System.out.println("Odabrali ste Binary search!");
			pretraga.binarySearch();
			System.out.println(
					"\nBinary search (binarno pretraživanje) je efikasan algoritam za pretraživanje sortiranih nizova.\nAlgoritam radi tako da pronalazi srednju tačku niza i poredi je sa ciljnom vrednošću koju želimo pronaći.\nAko je srednja vrednost manja od ciljne vrednosti, binarno pretraživanje traži samo desnu polovinu niza, \njer se ciljna vrednost može nalaziti samo u toj polovni (budući da je niz sortiran).\nAko je srednja vrednost veća od ciljne vrednosti, pretraživanje se nastavlja samo sa levom polovinom niza.\nOvaj proces se ponavlja dok se ne pronađe ciljna vrednost ili dok se ne iscrpi celi niz.\nJedna od glavnih prednosti binarnog pretraživanja je njegova efikasnost, jer u svakoj iteraciji algoritma polovina niza se eliminiše kao potencijalni izbor.\nOvo rezultira brzim pronalaskom ciljne vrednosti.\nVažno je napomenuti da se binarno pretraživanje može primijeniti samo na sortirane nizove! ");
			break;
		}
		case 3: {
			System.out.println("Odabrali ste Fibbonaci search!");
			pretraga.fibonacciSearch();
			System.out.println(
					"\nFibonacci search (pretraživanje po Fibonačiju) je algoritam za pretraživanje niza koji koristi Fibonačijev niz brojeva kako bi pronašao traženu vrednost.\nAlgoritam započinje tako što odabere Fibonačijev broj koji je najveći, ali ne veći od dužine niza.\nZatim se određuju se dva indeksa:\n- indeks trenutnog elementa, koji počinje na početku niza.\n - indeks srednjeg elementa, koji se nalazi na Fibonačijevom broju prethodnom odabranom broju.\nZatim se proerava da li je ciljna vrednost jednaka srednjem elementu.\nAko je to tačno, algoritam se zaustavlja i vraća indeks srednjeg elementa.\nAko je ciljna vrednost manja od srednjeg elementa, pretraživanje se nastavlja samo sa levom polovinom niza\nizmeđu početnog elementa i prethodnog elementa Fibonačijevog niza.\nAko je ciljna vrednost veća od srednjeg elementa, pretraživanje se nastavlja\nsamo sa desnom polovinom niza između srednjeg elementa i poslednjeg elementa Fibonačijevog niza.\nOvaj proces se ponavlja dok se ne pronađe ciljna vrednost ili dok se ne iscrpi celi niz.\nEfikasnije je od Linarnog pretraživanja, ali je manje efikasno od Binarnog pretraživanja ");
			break;
		}
		default:
			throw new IllegalArgumentException("Unesli ste nepostojeći broj, morate uneti od 1 do 3: " + n);
		}

	}

}
