package br.edu.ifpr.trabalho.poo.modelo;

public abstract class Pessoa {
	
	protected String nome;
	protected String cpf;
	protected String telefone;
	protected String endereco;
	protected String dataNascimento;
	
	public abstract void imprimirDados();
	
}
