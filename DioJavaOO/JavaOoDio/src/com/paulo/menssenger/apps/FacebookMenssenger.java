package com.paulo.menssenger.apps;

public class FacebookMenssenger extends SevicoMensagemInstantanea {

	@Override
	public void enviarMensagem() {
		validarConexao();
		System.out.println("Mensagem Enviada Pelo Facebook");
		
	}

	@Override
	public void receberMenssagem() {
		System.out.println("Mensagem Enviada Pelo Facebook");
		
	}

}
