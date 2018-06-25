package DAO;

import Classes.Cliente;
import Classes.Filme;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClienteDAOPG implements ClienteDAO{

    @Override
    public void createCliente(int id, String nome, Date dataCadastrado, String cpf, String rg, String telefone, String cep, String rua, String bairro, String cidade, String UF) throws SQLException {
        //conexao
		Connection conexao = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/cinema", "postgres", "root");
		
		
		String sql = "INSERT INTO Cliente(id, nome, dataCadastrado, cpf, rg, telefone, cep, rua, bairro, cidade, UF) values"
				+ "("+id+",'"+nome+"',"+dataCadastrado+",'"+cpf+"','"+rg+"','"+telefone+"','"+cep+"','"+rua+"','"+bairro+"','";
		PreparedStatement pst = conexao.prepareStatement(sql);
		pst.execute(sql);
    }

    @Override
    public List<Cliente> retrieveCliente() throws SQLException {
        //conexao
		Connection conexao = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/cinema", "postgres", "root");
		
		String sql = "SELECT * from Cliente";
		PreparedStatement pst = conexao.prepareStatement(sql);
		ResultSet rs = pst.executeQuery(sql);
		List<Cliente> clienteList = new ArrayList<>();
		while(rs.next()) {
			int id = rs.getInt("id");
                        String nome = rs.getString("nome");
                        Date dataCadastrado = rs.getDate("dataCadastrado");
			String cpf = rs.getString("cpf");
			String rg = rs.getString("rg");
			String telefone = rs.getString("telefone");
			String cep = rs.getString("cep");
			String rua = rs.getString("rua");
			String bairro = rs.getString("bairro");
                        String cidade = rs.getString("cidade");
                        String UF = rs.getString("UF");
                        
			Cliente c = new Cliente(dataCadastrado, id, nome, cpf, rg, telefone, cep, rua, bairro, cidade, UF);
			clienteList.add(c);
			
		}
		rs.close();
		return clienteList;
		
    }

    @Override
    public void deleteCliente(int id) throws SQLException {
        //conexao
		Connection conexao = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/cinema", "postgres", "root");
        String sql = "DELETE FROM Cliente WHERE id = '" + id + "';";
        PreparedStatement pst = conexao.prepareStatement(sql);
        pst.execute(sql);
    }
    
}
