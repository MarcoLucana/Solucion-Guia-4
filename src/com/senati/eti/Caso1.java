package com.senati.eti;

import java.util.Arrays;

public class Caso1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arrNombre = new String[4];
		
		arrNombre[0] = "Joe Castillo";
		arrNombre[1] = "Rosa Garcia";
		arrNombre[2] = "Carlos Ramos";
		arrNombre[3] = "Ericka Vásquez";
		
		System.out.println("FORMA 1");
		System.out.println(Arrays.toString(arrNombre));
		
		System.out.println("");
		
		System.out.println("FORMA 2");
		
		for (int x = 0; x < arrNombre.length; x++)
			System.out.println("Nombre" + (x + 1) + ": " + arrNombre[x]);
		
		System.out.println("");
		
		System.out.println("FORMA 3");
		int n = 1;
		for(String nombre:arrNombre) {
			System.out.println("Nombre: " + n + ": " + nombre);
			n++;
		}

	}

}
