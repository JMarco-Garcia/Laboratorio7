package laboratorio7.Entidades;
import java.util.List;
import java.util.ArrayList;

public class Medico {

    private String cmp;
    private DataPersona dataP;
    private List<String> especialidades;

    public Medico(String cmp, DataPersona dataP) {
        this.cmp = cmp;
        this.dataP = dataP;
        especialidades = new ArrayList<>();
    }
    
    public String getText(){
        return dataP.getNombre() + " - " + this.cmp;
    }

    public String getCmp() {
        return this.cmp;
    }
    
    public DataPersona getDataP() {
        return this.dataP;
    }

    public List<String> getEspecialidades() {
        return especialidades;
    }
    
    public void setCmp(String cmp) {
        this.cmp = cmp;
    }

    public void setDataP(DataPersona dataP) {
        this.dataP = dataP;
    }

    public void setEspecialidades(List<String> especialidades) {
        this.especialidades = especialidades;
    }
    
}
