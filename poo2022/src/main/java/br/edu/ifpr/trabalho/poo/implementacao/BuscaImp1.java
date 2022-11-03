package br.edu.ifpr.trabalho.poo.implementacao;

import java.util.ArrayList;

import br.edu.ifpr.trabalho.poo.conexao.CampusDAO;
import br.edu.ifpr.trabalho.poo.interfaces.IBuscaDeDados;
import br.edu.ifpr.trabalho.poo.modelo.Aluno;
import br.edu.ifpr.trabalho.poo.modelo.Campus;
import br.edu.ifpr.trabalho.poo.modelo.Curso;
import br.edu.ifpr.trabalho.poo.modelo.Disciplina;
import br.edu.ifpr.trabalho.poo.modelo.Matricula;
import br.edu.ifpr.trabalho.poo.modelo.Professor;
import br.edu.ifpr.trabalho.poo.modelo.Turma;

public class BuscaImp1 implements IBuscaDeDados{

	public ArrayList<Matricula> buscarMatriculasAtivas() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Matricula> buscarTodasMatriculas() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Aluno> buscarAlunos() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Turma> buscarTurmas() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Professor> buscarProfessores() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Disciplina> buscarDisciplinas() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Curso> buscarCursos() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Campus> buscarCampi() {
		CampusDAO campusdao = new CampusDAO();
		return campusdao.listar();
	}

}
