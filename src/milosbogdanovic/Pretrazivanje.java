package milosbogdanovic;

import java.util.Scanner;

public class Pretrazivanje {

	// Metoda za linarno pretaživanje
	public static void linearSearch() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Unesite duzinu niza a: ");
		int n = scanner.nextInt();
		int[] a = new int[n];

		System.out.print("Unesite elemente niza a: ");
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = scanner.nextInt();
		}

		System.out.print("Unesite element za pretragu: ");
		int x = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			if (a[i] == x) {
				System.out.println("Traženi element je: " + x + " i ima indeks: " + i);
				return; // Izlazimo iz metode nakon pronalaska elementa
			}
		}

		System.out.println("Element nije pronadjen.");
	}

	// Metoda za Binarno pretraživanje
	public static void binarySearch() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Unesite dužinu niza a: ");
		int n = scanner.nextInt();
		int[] a = new int[n];

		System.out.println("Unesite elemente niza a: ");
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = scanner.nextInt();
		}

		System.out.print("Unesite broj koji tražite: ");
		int x = scanner.nextInt();

		int levi = 0;
		int desni = a.length - 1;

		while (levi <= desni) {
			int sredina = (levi + desni) / 2;

			if (a[sredina] == x) {
				System.out.println("Element " + x + " je pronađen na poziciji " + sredina);
				return;
			} else if (a[sredina] < x) {
				levi = sredina + 1;
			} else {
				desni = sredina - 1;
			}
		}

		System.out.println("Element " + x + " nije pronađen u a nizu.");
	}

	// Metoda za pretraživanje po Fibonačiju
	public static int fibonacciSearch() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Unesite duzinu niza a: ");
		int n = scanner.nextInt();

		int[] a = new int[n];
		System.out.print("Unesite elemente niza a: ");
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}

		System.out.print("Unesite element za pretragu: ");
		int x = scanner.nextInt();

		int fib1 = 0;
		int fib2 = 1;
		int fibM = fib1 + fib2;

		while (fibM < n) {
			fib1 = fib2;
			fib2 = fibM;
			fibM = fib1 + fib2;
		}

		int offset = -1;
		while (fibM > 1) {
			int i = Math.min(offset + fib1, n - 1);
			if (a[i] < x) {
				fibM = fib2;
				fib2 = fib1;
				fib1 = fibM - fib2;
				offset = i;
			} else if (a[i] > x) {
				fibM = fib1;
				fib2 = fib2 - fib1;
				fib1 = fibM - fib2;
			} else {
				System.out.println("Element " + x + " se nalazi na poziciji " + i);
				return i;
			}
		}

		if (fib2 == 1 && a[offset + 1] == x) {
			System.out.println("Element " + x + " se nalazi na poziciji " + (offset + 1));
			return offset + 1;
		}

		System.out.println("Element " + x + " nije pronadjen u a nizu.");
		return -1;
	}

}
