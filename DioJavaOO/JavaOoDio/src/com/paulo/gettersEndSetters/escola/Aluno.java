package com.paulo.gettersEndSetters.escola;

public class Aluno {
	private String nome;
	private int idade;
	
	// Constructors
	public Aluno(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	// getters and setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	
	
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
	
	
	
}
