package br.edu.ifpr.trabalho.poo.implementacao;

import br.edu.ifpr.trabalho.poo.conexao.CampusDAO;
import br.edu.ifpr.trabalho.poo.interfaces.IInserirDados;
import br.edu.ifpr.trabalho.poo.modelo.Aluno;
import br.edu.ifpr.trabalho.poo.modelo.Campus;
import br.edu.ifpr.trabalho.poo.modelo.Curso;
import br.edu.ifpr.trabalho.poo.modelo.Disciplina;
import br.edu.ifpr.trabalho.poo.modelo.Matricula;
import br.edu.ifpr.trabalho.poo.modelo.Professor;
import br.edu.ifpr.trabalho.poo.modelo.Turma;

public class InserirImp1 implements IInserirDados {

	public void salvarAluno(Aluno aluno) {
		// TODO Auto-generated method stub
		
	}

	public void salvarProfessor(Professor professor) {
		// TODO Auto-generated method stub
		
	}

	public void salvarCurso(Curso curso) {
		// TODO Auto-generated method stub
		
	}

	public void salvarTurma(Turma turma) {
		// TODO Auto-generated method stub
		
	}

	public void salvarDisciplina(Disciplina disciplina) {
		// TODO Auto-generated method stub
		
	}

	public void salvarMatricula(Matricula matricula) {
		// TODO Auto-generated method stub
		
	}

	public void salvarCampus(Campus campus) {
		
		CampusDAO campusdao = new CampusDAO();
		campusdao.salvarCampus(campus);
		
	}

}
