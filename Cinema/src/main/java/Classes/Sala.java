package Classes;

public class Sala {
	int id, numero, qtdAssento;
	String nome;
	public enum salaEnum{
		tresD, Normal;
	}

    public Sala(int id, int numero, int qtdAssento, String nome) {
        this.id = id;
        this.numero = numero;
        this.qtdAssento = qtdAssento;
        this.nome = nome;
    }
        
        
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getQtdAssento() {
		return qtdAssento;
	}
	public void setQtdAssento(int qtdAssento) {
		this.qtdAssento = qtdAssento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
