package Classes;

public class Horario {
	int id;
	Float horaInicio, horaFinal;

    public Horario(int id, Float horaInicio, Float horaFinal) {
        this.id = id;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
    }
        
        
        
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Float getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(Float horaInicio) {
		this.horaInicio = horaInicio;
	}
	public Float getHoraFinal() {
		return horaFinal;
	}
	public void setHoraFinal(Float horaFinal) {
		this.horaFinal = horaFinal;
	}
	
	
}
