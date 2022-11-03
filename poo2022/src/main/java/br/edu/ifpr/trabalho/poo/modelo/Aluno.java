package br.edu.ifpr.trabalho.poo.modelo;

public final class Aluno extends Pessoa {
	
	private int anoIngresso;

	
	public Aluno() {
		
	}
	
	public Aluno(int anoIngresso) {
		this.anoIngresso = anoIngresso;
	}

	public int getAnoIngresso() {
		return anoIngresso;
	}

	public void setAnoIngresso(int anoIngresso) {
		this.anoIngresso = anoIngresso;
	}

	public void imprimirDados() {
		// TODO Auto-generated method stub
		
	}

}
