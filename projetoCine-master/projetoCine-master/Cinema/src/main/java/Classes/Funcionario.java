package Classes;

import java.util.Date;

public class Funcionario extends Pessoa{
	String carteiraTrabalho;
	Date dataNascimento;
	float salario;

    public Funcionario(String carteiraTrabalho, Date dataNascimento, float salario, int id, String nome, String cpf, String rg, String telefone, String cep, String rua, String bairro, String cidade, String UF) {
        super(id, nome, cpf, rg, telefone, cep, rua, bairro, cidade, UF);
        this.carteiraTrabalho = carteiraTrabalho;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }


	
	public String getCarteiraTrabalho() {
		return carteiraTrabalho;
	}
	public void setCarteiraTrabalho(String carteiraTrabalho) {
		this.carteiraTrabalho = carteiraTrabalho;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
}
