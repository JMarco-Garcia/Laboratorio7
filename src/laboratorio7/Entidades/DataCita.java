package laboratorio7.Entidades;

public class DataCita {

    private String hora;
    private String fecha;
    private String especialidad;

    public DataCita(String hora, String fecha, String especialidad) {
        this.hora = hora;
        this.fecha = fecha;
        this.especialidad = especialidad;
    }

    public String getHora() {
        return hora;
    }

    public String getFecha() {
        return fecha;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

}
