package br.edu.ifpr.trabalho.poo.conexao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.edu.ifpr.trabalho.poo.modelo.Aluno;
import br.edu.ifpr.trabalho.poo.modelo.Campus;

public class AlunoDAO {
	public ArrayList<Aluno> listar() {
		ArrayList<Aluno> listaDeAluno = new ArrayList<Aluno>();
		String SQL = "SELECT * FROM matricula.tb_aluno";
		

		try {
			PreparedStatement preparacaoDaInstrucao = Conexao.getConexao().prepareStatement(SQL);
			ResultSet resultado = preparacaoDaInstrucao.executeQuery();

			while (resultado.next()) {
				Aluno aluno = transformarResultSetEmObjeto(resultado);
				listaDeAluno.add(aluno);
			}

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return listaDeAluno;
	}

	public void salvarAluno(Aluno aluno) {
		String SQL = "INSERT INTO tb_aluno (anoIngresso, nome, cpf, telefone, dataNascimento) VALUES (?, ?, ?, ?, ?)";

		try {
			PreparedStatement preparacaoDaInstrucao = Conexao.getConexao().prepareStatement(SQL);
			preparacaoDaInstrucao.setInt(1, Aluno.getAnoIngresso());
			preparacaoDaInstrucao.setString(2, Aluno.getNome());
			preparacaoDaInstrucao.setString(3, Aluno.getCpf());
			preparacaoDaInstrucao.setString(4, Aluno.getTelefone());
			preparacaoDaInstrucao.setInt(5, Aluno.getDataNascimento());

			preparacaoDaInstrucao.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// transformação
	public Aluno transformarResultSetEmObjeto(ResultSet resultSet) throws SQLException {
		Aluno aluno = new Aluno();
		try {
			aluno.setIdCampus(resultSet.getInt("id_campus"));
			aluno.setNome(resultSet.getString("nome"));
			aluno.setEndereco(resultSet.getString("endereco"));
			aluno.setCidade(resultSet.getString("cidade"));
			return campus;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SQLException("Erro ao transformar!");
		}
	}




	}
}
