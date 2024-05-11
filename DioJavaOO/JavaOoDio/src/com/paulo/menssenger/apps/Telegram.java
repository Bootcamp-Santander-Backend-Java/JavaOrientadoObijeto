package com.paulo.menssenger.apps;

public class Telegram extends SevicoMensagemInstantanea{

	@Override
	public void enviarMensagem() {
		validarConexao();
		System.out.println("Mensagem Enviada Pelo Telegram");
		
	}

	@Override
	public void receberMenssagem() {
		System.out.println("Recebendo mensagem Pelo Telegram");
		
	}

}
