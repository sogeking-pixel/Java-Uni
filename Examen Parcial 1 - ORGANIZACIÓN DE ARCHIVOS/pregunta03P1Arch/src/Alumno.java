
import java.util.HashSet;

public class Alumno{
       private int codigo;
       private String nombres;
       private String apellidos;
       private int edad;
       private String lugarDeNacimiento;
       
        
       //Como en el SUV los alumnos tienen una lista de matriculas, por ejemplo matricula 2020-1 2020-2 2021-1 2021-2 
        
       
        private HashSet<Curso> listaDeCursos = new HashSet<Curso>();
        private HashSet<Matricula> listaDeMatriculas = new HashSet<Matricula>();
        
        public Alumno(int codigo, String nombres, String apellidos, int edad, String lugarDeNacimiento) {
            this.codigo = codigo;
            this.nombres = nombres;
            this.apellidos = apellidos;
            this.edad = edad;
            this.lugarDeNacimiento = lugarDeNacimiento;
        }
        
        public int getCodigo() {
            return codigo;
        }

        public String getNombres() {
            return nombres;
        }

        public String getApellidos() {
            return apellidos;
        }

        public int getEdad() {
            return edad;
        }

        public String getLugarDeNacimiento() {
            return lugarDeNacimiento;
        }
        
        public void guardarCurso(Curso curso){
            System.out.println("Se guardo "+curso.toString()+" en el perfil de"+nombres);
            listaDeCursos.add(curso);
        }
        public void guardarMatricula(Matricula matricula){
            System.out.println("Se guardo la matricula: "+matricula.getCodigo()+" en el perfil de"+ nombres);
            listaDeMatriculas.add(matricula);
        }
        public HashSet<Curso> mostraCursos(){
            return listaDeCursos;
        }
        @Override
        public String toString() {
            return "Nombres: "+nombres+"\nApellidos: "+apellidos+"\nCodigo: "+codigo+"\nEdad: "+edad+"Lugar de nacimiento: "+lugarDeNacimiento+"\n\n";           
        }
        
        
   }