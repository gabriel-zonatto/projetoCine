package Classes;

public class Filme extends Sala{
	int id, ano, idadeRecomendada, tempo;
	String nome, ator1, ator2, sinopse;
	
	public Filme (int id, int ano, int idadeRecomendada, int tempo, String nome, String ator1, String ator2, String sinopse) {
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getIdadeRecomendada() {
		return idadeRecomendada;
	}
	public void setIdadeRecomendada(int idadeRecomendada) {
		this.idadeRecomendada = idadeRecomendada;
	}
	public int getTempo() {
		return tempo;
	}
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAtor1() {
		return ator1;
	}
	public void setAtor1(String ator1) {
		this.ator1 = ator1;
	}
	public String getAtor2() {
		return ator2;
	}
	public void setAtor2(String ator2) {
		this.ator2 = ator2;
	}
	public String getSinopse() {
		return sinopse;
	}
	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}
	
}
