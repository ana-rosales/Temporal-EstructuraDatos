package main;

import componentes.TarjetaGrafica;
import lacompu.Computadora;

public class Main {
	public static void main(String[] args) {
		
		Computadora miCompu= new Computadora();
        miCompu.setMarca("DELL");
        miCompu.setGrafica(new TarjetaGrafica("EVGA", 4.0));
        System.out.println( miCompu );
	}
}
