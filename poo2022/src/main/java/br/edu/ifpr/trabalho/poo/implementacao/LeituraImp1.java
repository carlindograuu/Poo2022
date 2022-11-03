package br.edu.ifpr.trabalho.poo.implementacao;

import java.util.Scanner;

import br.edu.ifpr.trabalho.poo.interfaces.ILeituraDeDados;
import br.edu.ifpr.trabalho.poo.modelo.Aluno;
import br.edu.ifpr.trabalho.poo.modelo.Campus;
import br.edu.ifpr.trabalho.poo.modelo.Curso;
import br.edu.ifpr.trabalho.poo.modelo.Disciplina;
import br.edu.ifpr.trabalho.poo.modelo.Matricula;
import br.edu.ifpr.trabalho.poo.modelo.Professor;
import br.edu.ifpr.trabalho.poo.modelo.Turma;

public class LeituraImp1 implements ILeituraDeDados {

	public Aluno lerDadosAluno() {
		// TODO Auto-generated method stub
		return null;
	}

	public Professor lerDadosProfessor() {
		// TODO Auto-generated method stub
		return null;
	}

	public Curso lerDadosCurso() {
		// TODO Auto-generated method stub
		return null;
	}

	public Turma lerDadosTurma() {
		// TODO Auto-generated method stub
		return null;
	}

	public Turma lerDadosTurma(Curso curso) {
		// TODO Auto-generated method stub
		return null;
	}

	public Disciplina lerDadosDisciplina(Professor professor, Turma turma) {
		// TODO Auto-generated method stub
		return null;
	}

	public Matricula lerDadosMatricula() {
		// TODO Auto-generated method stub
		return null;
	}

	public Matricula lerDadosMatricula(Aluno aluno, Turma turma) {
		// TODO Auto-generated method stub
		return null;
	}

	public Campus lerDadosCampus() {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o nome do campus:");
		String nome = teclado.nextLine();
		System.out.println("Informe o endereço do campus:");
		String endereco = teclado.nextLine();
		System.out.println("Informe a cidade do campus:");
		String cidade = teclado.nextLine();
		Campus campus = new Campus(nome, endereco, cidade);

		teclado.close();

		return campus;

	}
}
