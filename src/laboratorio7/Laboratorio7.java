package laboratorio7;

import java.util.List;
import java.util.ArrayList;
import laboratorio7.Entidades.Cita;
import laboratorio7.Entidades.DataPersona;
import laboratorio7.Entidades.Paciente;
import laboratorio7.Entidades.Medico;
import laboratorio7.Pantallas.PantallaInicio;

public class Laboratorio7 {

    private static List<Medico> listaMedicos = new ArrayList<>();
    private static List<Paciente> listaPacientes = new ArrayList<>();
    private static List<Cita> listaCitas = new ArrayList<>();

    private static void cargarListaMedicos(List<Medico> lista) {
        DataPersona data1 = new DataPersona("juan", "71318392", 0);
        DataPersona data2 = new DataPersona("omar", "42342331", 0);
        DataPersona data3 = new DataPersona("sandra", "66323499", 1);
        DataPersona data4 = new DataPersona("cristian", "41199000", 0);
        DataPersona data5 = new DataPersona("josue", "41677789", 0);
        lista.add(new Medico("CMP-12345", data1));
        lista.add(new Medico("CMP-23415", data2));
        lista.add(new Medico("CMP-32590", data3));
        lista.add(new Medico("CMP-24900", data4));
        lista.add(new Medico("CMP-99234", data5));
    }

    private static void cargarListaPacientes(List<Paciente> lista) {
        DataPersona data1 = new DataPersona("marcos", "71318391", 0);
        DataPersona data2 = new DataPersona("simeon", "99912331", 0);
        DataPersona data3 = new DataPersona("nayeli", "677122", 1);
        DataPersona data4 = new DataPersona("nahaman", "23333124", 0);
        DataPersona data5 = new DataPersona("eliseo", "32344259", 0);
        lista.add(new Paciente("9444063951", data1));
        lista.add(new Paciente("9344123190", data2));
        lista.add(new Paciente("8900037114", data3));
        lista.add(new Paciente("3319901233", data4));
        lista.add(new Paciente("9991200313", data5));
    }

    public static List<Medico> getListaMedicos() {
        return listaMedicos;
    }

    public static List<Paciente> getListaPacientes() {
        return listaPacientes;
    }

    public static List<Cita> getListaCitas() {
        return listaCitas;
    }

    public static void setListaMedicos(List<Medico> listaMedicos) {
        Laboratorio7.listaMedicos = listaMedicos;
    }

    public static void setListaPacientes(List<Paciente> listaPacientes) {
        Laboratorio7.listaPacientes = listaPacientes;
    }

    public static void setListaCitas(List<Cita> listaCitas) {
        Laboratorio7.listaCitas = listaCitas;
    }

    public static void main(String[] args) {
        cargarListaMedicos(listaMedicos);
        cargarListaPacientes(listaPacientes);

        PantallaInicio inicio = new PantallaInicio();
        inicio.setVisible(true);

    }

}
