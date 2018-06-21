package Classes;

public class Login {
	int id;
	String email, senha;

    public Login(int id, String email, String senha) {
        this.id = id;
        this.email = email;
        this.senha = senha;
    }
        
        
	public enum permissaoEnum {
		Funcionario, Cliente;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

}
