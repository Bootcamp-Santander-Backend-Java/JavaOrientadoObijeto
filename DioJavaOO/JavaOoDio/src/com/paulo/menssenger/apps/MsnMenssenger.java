package com.paulo.menssenger.apps;

public class MsnMenssenger extends SevicoMensagemInstantanea {

	@Override
	public void enviarMensagem() {
		validarConexao();
		System.out.println("Mensagem Enviada Pelo Msn");
		
	}

	@Override
	public void receberMenssagem() {
		System.out.println("Mensagem Recebida Pelo Msn");
	}
	
	
	
}
