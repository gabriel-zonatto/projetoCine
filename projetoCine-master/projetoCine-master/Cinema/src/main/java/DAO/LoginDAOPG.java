package DAO;

import Classes.Login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LoginDAOPG implements LoginDAO{

    @Override
    public void createLogin(int id, String email, String senha) throws SQLException {
        //conexao
		Connection conexao = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/cinema", "postgres", "root");
		
		
		String sql = "INSERT INTO Login(id, email, senha) values"
				+ "('"+id+"','"+email+"','"+senha+");";
		PreparedStatement pst = conexao.prepareStatement(sql);
		pst.execute(sql);
    }

    @Override
    public List<Login> retrieveLogin() throws SQLException {
        //conexao
		Connection conexao = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/cinema", "postgres", "root");
		
		String sql = "SELECT * from Login";
		PreparedStatement pst = conexao.prepareStatement(sql);
		ResultSet rs = pst.executeQuery(sql);
		List<Login> loginList = new ArrayList<>();
		while(rs.next()) {
			int id = rs.getInt("id");
			String email = rs.getString("email");
			String senha = rs.getString("senha");
			Login l = new Login(id,email,senha);
			loginList.add(l);
			
		}
		rs.close();
		return loginList;
		
    }
    
}
