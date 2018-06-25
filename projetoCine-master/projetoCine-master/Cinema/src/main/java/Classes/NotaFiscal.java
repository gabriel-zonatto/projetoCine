package Classes;

public class NotaFiscal {
	int id;
	float valorCompra;
	String nomeComprador, cpfComprador;

    public NotaFiscal(int id, float valorCompra, String nomeComprador, String cpfComprador) {
        this.id = id;
        this.valorCompra = valorCompra;
        this.nomeComprador = nomeComprador;
        this.cpfComprador = cpfComprador;
    }
	
	
        
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(float valorCompra) {
		this.valorCompra = valorCompra;
	}
	public String getNomeComprador() {
		return nomeComprador;
	}
	public void setNomeComprador(String nomeComprador) {
		this.nomeComprador = nomeComprador;
	}
	public String getCpfComprador() {
		return cpfComprador;
	}
	public void setCpfComprador(String cpfComprador) {
		this.cpfComprador = cpfComprador;
	}
	
	
}
