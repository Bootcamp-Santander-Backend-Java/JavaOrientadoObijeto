package com.paulo.fabrica;

import com.paulo.fabrica.copiadora.Copiadora;
import com.paulo.fabrica.copiadora.Xerox;
import com.paulo.fabrica.digitalizadora.Digitalizadora;
import com.paulo.fabrica.digitalizadora.Scanner;
import com.paulo.fabrica.impressora.Deskjet;
import com.paulo.fabrica.impressora.Impressora;
import com.paulo.fabrica.impressora.LaserJet;
import com.paulo.fabrica.multifuncional.Multifuncional;

public class Fabrica {

	public static void main(String[] args) {
		Impressora desckjet = new Deskjet();
		desckjet.imprimir();
		
		Impressora laser = new LaserJet();
		laser.imprimir();
		
		Impressora multi = new Multifuncional();
		multi.imprimir();
		
		Copiadora xerox = new Xerox();
		xerox.copiar();	
		
		Copiadora mult = new Multifuncional();
		mult.copiar();	
		
		Digitalizadora scanner = new Scanner();
		scanner.digitalizar();
		
		Digitalizadora multif = new Scanner();
		multif.digitalizar();
		
	}

}
