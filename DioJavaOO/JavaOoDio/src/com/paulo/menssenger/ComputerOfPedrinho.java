package com.paulo.menssenger;

import com.paulo.menssenger.apps.FacebookMenssenger;
import com.paulo.menssenger.apps.MsnMenssenger;
import com.paulo.menssenger.apps.SevicoMensagemInstantanea;
import com.paulo.menssenger.apps.Telegram;

public class ComputerOfPedrinho {

	public static void main(String[] args) {
		
		SevicoMensagemInstantanea mensagem = null;
		
		String appEscolhido = "msn";
		
		if(appEscolhido.equals("msn")) {
			mensagem = new MsnMenssenger();
		}else if(appEscolhido.equals("facebook")) {
			mensagem = new FacebookMenssenger();
		}else {
			new Telegram();			
		}
		
		mensagem.enviarMensagem();
		mensagem.receberMenssagem();

	}

}
