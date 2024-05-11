package com.paulo.menssenger.apps;

public abstract class SevicoMensagemInstantanea {
	public abstract void enviarMensagem();		
	public abstract void receberMenssagem();

	protected void validarConexao() {
		System.out.println("Validando Conexão");
	}
	
	
}
