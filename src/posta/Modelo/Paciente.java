package posta.modelo;

public class Paciente {
    private String dni;
    private String nombres;
    private String apellidos;
    private int edad;
    private String sexo;

    // Constructor vacío para inicializar
    public Paciente() {
    }

    // Constructor con datos
    public Paciente(String dni, String nombres, String apellidos, int edad, String sexo) {
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.sexo = sexo;
    }

    // Getters y Setters 
    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    public String getNombres() { return nombres; }
    public void setNombres(String nombres) { this.nombres = nombres; }

    public String getApellidos() { return apellidos; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }
}