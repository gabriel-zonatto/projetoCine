package Classes;

public class Assento {
	int id, numeroAssento;
	char fileiraAssento;

    public Assento(int id, int numeroAssento, char fileiraAssento) {
        this.id = id;
        this.numeroAssento = numeroAssento;
        this.fileiraAssento = fileiraAssento;
    }

        
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumeroAssento() {
		return numeroAssento;
	}
	public void setNumeroAssento(int numeroAssento) {
		this.numeroAssento = numeroAssento;
	}
	public char getFileiraAssento() {
		return fileiraAssento;
	}
	public void setFileiraAssento(char fileiraAssento) {
		this.fileiraAssento = fileiraAssento;
	}
	
	
}
