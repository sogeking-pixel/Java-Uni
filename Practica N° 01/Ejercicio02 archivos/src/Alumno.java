public class Alumno {
    
    private int  expediente;
    private String nombre;
    private float  nota;
    
    public Alumno(int expediente, String nombre, float nota) {
        this.expediente = expediente;
        this.nombre = nombre;
        this.nota = nota;
    }

    public void setExpediente(int expediente) {
        this.expediente = expediente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public int getExpediente() {
        return expediente;
    }

    public String getNombre() {
        return nombre;
    }

    public float getNota() {
        return nota;
    }

    public String toString() {
        return "Info Alumno" + 
                "Expediente :" + expediente + 
                "Nombre : " + nombre + 
                "Nota :" + nota ;
    }
    
}
