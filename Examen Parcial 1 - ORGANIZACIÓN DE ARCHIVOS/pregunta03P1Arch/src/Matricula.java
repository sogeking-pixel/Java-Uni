
import java.util.HashSet;

public class Matricula{
        
        private int codigo;
        private int codigoALumno; 
        private int codigoCurso;
        
        //Un matricula puede tener de 1* cursos, hay una relación entre clase matricula y curso
        private HashSet<Curso> listaDeCursos = new HashSet<Curso>();

        public Matricula(int codigo, int codigoALumno, int codigoCurso) {
            this.codigo = codigo;
            this.codigoALumno = codigoALumno;
            this.codigoCurso   = codigoCurso;
        }

        public int getCodigo() {
            return codigo;
        }

        public void setCodigo(int codigo) {
            this.codigo = codigo;
        }

        public int getCodigoALumno() {
            return codigoALumno;
        }

        public void setCodigoALumno(int codigoALumno) {
            this.codigoALumno = codigoALumno;
        }

    @Override
    public String toString() {
        return "Matricula{" + "codigo=" + codigo + ", codigoALumno=" + codigoALumno + ", codigoCurso=" + codigoCurso + ", listaDeCursos=" + listaDeCursos + '}';
    }
        
        
    }