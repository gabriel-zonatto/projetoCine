package Classes;

import java.util.Date;

public class Cliente extends Pessoa{
	Date dataCadastrado;

    public Cliente(Date dataCadastrado, int id, String nome, String cpf, String rg, String telefone, String cep, String rua, String bairro, String cidade, String UF) {
        super(id, nome, cpf, rg, telefone, cep, rua, bairro, cidade, UF);
        this.dataCadastrado = dataCadastrado;
    }


 
        

	public Date getDataCadastrado() {
		return dataCadastrado;
	}

	public void setDataCadastrado(Date dataCadastrado) {
		this.dataCadastrado = dataCadastrado;
	}
	
	
}
