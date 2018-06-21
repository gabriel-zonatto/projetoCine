package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Classes.*;

public class FilmeDAOPG implements FilmeDAO{

	@Override
	public void createFilme(int id, int ano, int idadeRecomendada, int tempo,
			String nome, String ator1, String ator2, String sinopse) throws SQLException {
	//conexao
		Connection conexao = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/cinema", "postgres", "root");
		
		
		String sql = "INSERT INTO Filme(id, ano, idadeRecomendada, tempo, nome, ator1, ator2, sinopse) values"
				+ "('"+id+"','"+ano+"','"+idadeRecomendada+"','"+tempo+"','"+nome+"',"+ator1+","+ator2+","+sinopse+");";
		PreparedStatement pst = conexao.prepareStatement(sql);
		pst.execute(sql);
	}

	@Override
	public List<Filme> retrieve() throws SQLException {
		//conexao
		Connection conexao = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/cinema", "postgres", "root");
		
		String sql = "SELECT * from Filme";
		PreparedStatement pst = conexao.prepareStatement(sql);
		ResultSet rs = pst.executeQuery(sql);
		List<Filme> filmeList = new ArrayList<>();
		while(rs.next()) {
			int id = rs.getInt("id");
			int ano = rs.getInt("ano");
			int idadeRecomendada = rs.getInt("idadeRecomendada");
			int tempo = rs.getInt("tempo");
			String nome = rs.getString("nome");
			String ator1 = rs.getString("ator1");
			String ator2 = rs.getString("ator2");
			String sinopse = rs.getString("sinopse");
			Filme f = new Filme(id,ano,idadeRecomendada, tempo, nome, ator1, ator2, sinopse);
			filmeList.add(f);
			
		}
		rs.close();
		return filmeList;
		
	}


	@Override
	public void delete(String nome) throws SQLException {
		//conexao
		Connection conexao = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/cinema", "postgres", "root");
        String sql = "DELETE FROM Filme WHERE nome = '" + nome + "';";
        PreparedStatement pst = conexao.prepareStatement(sql);
        pst.execute(sql);
		
	}
}

