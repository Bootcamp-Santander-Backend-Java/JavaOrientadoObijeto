package com.paulo.fabrica.multifuncional;

import com.paulo.fabrica.copiadora.Copiadora;
import com.paulo.fabrica.digitalizadora.Digitalizadora;
import com.paulo.fabrica.impressora.Impressora;

public class Multifuncional implements Copiadora , Digitalizadora , Impressora{

	@Override
	public void copiar() {
		System.out.println("Copiando via multifuncional");
		
	}

	@Override
	public void imprimir() {
		System.out.println("imprimindo via multifuncional");
		
	}

	@Override
	public void digitalizar() {
		System.out.println("Digitalizando via multifuncional");
		
	}

}
