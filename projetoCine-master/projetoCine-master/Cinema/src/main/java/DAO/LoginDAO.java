package DAO;
import Classes.*;
import java.sql.SQLException;
import java.util.List;

public interface LoginDAO {
    public void createLogin(int id, String email, String senha) throws SQLException;
    
    public List<Login> retrieveLogin() throws SQLException;
}
