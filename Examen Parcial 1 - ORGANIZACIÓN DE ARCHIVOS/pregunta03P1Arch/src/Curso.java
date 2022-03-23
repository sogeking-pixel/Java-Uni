
import java.util.HashSet;

public class Curso{
       int codigo;
       String descripcion;
        
       //Un curso puede tener más de 1 alumno matriculado, por ejemplo en el aula virtual nos aparece los participantes
       //eso quiere decir que hay una relación entre al clase curso y alumno 0*
       private HashSet<Alumno> participantes = new HashSet<Alumno>();
       
       //constructor
        public Curso(int codigo, String descripcion) {
            this.codigo = codigo;
            this.descripcion = descripcion;
        }
        
        //metodos get and set 
        public int getCodigo() {
            return codigo;
        }

        public void setCodigo(int codigo) {
            this.codigo = codigo;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }
       
       //los siguientes metodos guarda al alumno matriculado en este curso.
        
        public void guardarAlumno(Alumno alumno){
            System.out.println("Se guardo el alumno"+alumno.getNombres()+" "+alumno.getApellidos());
            participantes.add(alumno);
        }  
        
        public HashSet<Alumno> mostrarAlumnos()
        {
            return participantes;
        }
        
   }