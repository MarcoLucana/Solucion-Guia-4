package com.senati.eti;
import java.util.Arrays;
import java.util.Scanner;
public class Caso3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Integer[] arrNumero = new Integer[5];
		
		System.out.println("REGISTRO DE NUMEROS");
		
		for( int x = 0; x < arrNumero.length; x++) {
			System.out.println("Número " + (x+ 1) + ": ");
			arrNumero[x] = sc.nextInt();
		}
		
		Arrays.sort(arrNumero);
		
		System.out.println("Numeros ordenados de forma ascendente");
		for( int x = 0; x < arrNumero.length; x++)
			System.out.println("Numero " + (x+1) + ": " + arrNumero[x]);
		
		}

	}


