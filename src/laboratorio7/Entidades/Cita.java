package laboratorio7.Entidades;

public class Cita {

    private Paciente paciente;
    private Medico medico;
    private DataCita dataC;

    public Cita(Paciente paciente, Medico medico, DataCita dataC) {
        this.paciente = paciente;
        this.medico = medico;
        this.dataC = dataC;
    }

    public String getText(){
        return "PACIENTE: " + this.paciente.getDataB().getNombre() +
                " DNI: " + this.paciente.getDataB().getDni() +
                " MEDICO: " + this.medico.getDataP().getNombre() + 
                " FECHA: " + this.getDataC().getFecha() + 
                " HORA: " + this.getDataC().getHora();
    }
    public Paciente getPaciente() {
        return paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public DataCita getDataC() {
        return dataC;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public void setDataC(DataCita dataC) {
        this.dataC = dataC;
    }

}
