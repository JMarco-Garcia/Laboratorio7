package laboratorio7.Entidades;

public class Paciente {

    private String telefono;
    private DataPersona dataB;

    public Paciente(String telefono, DataPersona dataB) {
        this.telefono = telefono;
        this.dataB = dataB;
    }
    
    public String getText(){
        return dataB.getNombre() + 
                " - DNI: " + dataB.getDni();
    }
    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public DataPersona getDataB() {
        return this.dataB;
    }

    public void setDatab(DataPersona dataB) {
        this.dataB = dataB;
    }

}
