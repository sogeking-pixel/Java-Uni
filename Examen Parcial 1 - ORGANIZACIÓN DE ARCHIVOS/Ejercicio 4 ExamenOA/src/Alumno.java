import java.io.Serializable;

public class Alumno implements Serializable{
    private static final long serialVersionUID = -1L;
    
    //Atributos de la clase
    protected String apellido;
    protected String nombre;
    protected String edad;
    protected String lugarDeNacimiento;
    
    //Metodos de la clase

    //Contrusctor de la clase, para poder instanciar un objeto

    public Alumno(String apellido, String nombre, String edad, String lugarDeNacimiento) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.edad = edad;
        this.lugarDeNacimiento = lugarDeNacimiento;
    }
    
    
    //Metodos Setter

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setLugarDeNacimiento(String lugarDeNacimiento) {
        this.lugarDeNacimiento = lugarDeNacimiento;
    }
    
    //Metodos Getter

    public String getApellido() {
        return apellido;
    }

    public String getEdad() {
        return edad;
    }

    public String getLugarDeNacimiento() {
        return lugarDeNacimiento;
    }
    
    @Override
    public String toString() {
        return "Contacto :" + 
        " Nombre :" + nombre + 
        " Apellido :" + apellido + 
        " Edad :" + edad + 
        " Lugar De Nacimiento :" + lugarDeNacimiento;
    }
    
    
}
