package com.paulo.heranca;



public class Autodromo {

	public static void main(String[] args) {
		
			Carro jeep = new Carro();
			jeep.ligar();
			jeep.setChassi("32543");
			jeep.setPlaca("azf-1b87 /n");
			
			Moto hornet = new Moto();
			hornet.setChassi("326598");
			hornet.setPlaca("ABC-3274");
			hornet.ligar();
			

	}

}