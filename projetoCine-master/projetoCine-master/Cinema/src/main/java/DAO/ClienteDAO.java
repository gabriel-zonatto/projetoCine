package DAO;

import Classes.Cliente;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public interface ClienteDAO {
    public void createCliente(int id, String nome, Date dataCadastrado, String cpf, String rg, String telefone, String cep, String rua, String bairro, String cidade, String UF) throws SQLException;

    public List<Cliente> retrieveCliente() throws SQLException;
    
    public void deleteCliente(int id) throws SQLException;
            
}
