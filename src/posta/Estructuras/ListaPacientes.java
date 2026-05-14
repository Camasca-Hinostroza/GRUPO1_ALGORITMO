package posta.estructuras;

import java.util.ArrayList;
import posta.modelo.Paciente;

public class ListaPacientes {
    private ArrayList<Paciente> lista;

    public ListaPacientes() {
        this.lista = new ArrayList<>();
    }

    public void agregarPaciente(Paciente p) {
        lista.add(p);
    }

    public ArrayList<Paciente> obtenerTodos() {
        return lista;
    }
    
   // implementar el método para buscar por DNI
}