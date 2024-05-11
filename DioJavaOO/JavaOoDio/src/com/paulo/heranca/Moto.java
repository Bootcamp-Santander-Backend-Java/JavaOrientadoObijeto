package com.paulo.heranca;

public class Moto extends Veiculo {
	public void ligar() {
		conferirCambio();
		coferirCombustivel();
		System.out.println("MOTO LIGADO");		
		}
	
	//Encapsulando Métodos que não precisam ficar visíveis ao usuario
	
	private void coferirCombustivel() {
		System.out.println("Conferindo combustivel");
	}
	private void conferirCambio() {
		System.out.println("Conferindo cambio em Neutro");
	}
}
