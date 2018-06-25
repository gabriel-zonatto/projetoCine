package DAO;

import java.sql.SQLException;
import java.util.List;
import Classes.*;

public interface FilmeDAO {
	public void createFilme(int id, int ano, int idadeRecomendada, int tempo,
							String nome, String ator1, String ator2, String sinopse) throws SQLException;
	
	public List<Filme> retrieveFilme()throws SQLException;
	
	public void deleteFilme(String nome)throws SQLException;
}
