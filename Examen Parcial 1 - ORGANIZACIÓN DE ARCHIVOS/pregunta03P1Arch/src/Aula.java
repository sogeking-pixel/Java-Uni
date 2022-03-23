
import javax.swing.JOptionPane;

public class Aula{
    
    
    public static void main(String[] args) {
        int iteradorAlum = 3;
        int iteradorCur = 3;
        int iteradorMatriculas = 0;
        
        String nombres;
        String apellidos;
        int codigo, codalum, codCurso, CodMatri;
        int edad;
        String LugarDeNacimiento;
        
        Alumno lista_alumnos[] = new Alumno[100];
        Curso lista_cursos[] = new Curso[20];
        Matricula lista_matriculados[] = new Matricula[100];
        int opMenu;
        //alumnos predeterminados
        Alumno a1 = new Alumno(72645194,"Luis Eduardo","Murrugarra Vigo",18,"San Pedro de LLoc");
        lista_alumnos[0]=a1;
        Alumno a2 = new Alumno(74397198,"Carlos Miguel","Fernandez Vigo",19,"Guadalupe");
        lista_alumnos[1]=a2;
        Alumno a3 = new Alumno(73358242,"Jerson Solano", "Arrelucea Arrelucea",18,"Gaudalupe");
        lista_alumnos[2]=a3;
        
        //3 cursos predeterminados(cursos de 4tho ciclo)
        
        Curso c1 = new Curso(1,"Organización de Archivos");
        lista_cursos[0]=c1;
        Curso c2 = new Curso(2,"Computación Gráfica");
        lista_cursos[1]=c2;
        Curso c3 = new Curso(3,"Algoritmos y Complejidad");
        lista_cursos[2]=c3;
        
        do
        {
            opMenu = Integer.parseInt(JOptionPane.showInputDialog(null,"1) Agregar Alumno\n2) Agregar curso\n3)Matricular\n4)mostrar matriculas\n5)salir"));
            
            switch(opMenu){
                case 1:
                    nombres = JOptionPane.showInputDialog("Nombres: ");
                    apellidos = JOptionPane.showInputDialog("apellidos: ");
                    codigo = Integer.parseInt(JOptionPane.showInputDialog("Codigo: "));
                    edad = Integer.parseInt(JOptionPane.showInputDialog("Edad: "));
                    LugarDeNacimiento = JOptionPane.showInputDialog("Lugar de Nacimiento: ");
                    Alumno alum = new Alumno(codigo, nombres, apellidos, edad, LugarDeNacimiento);
                    lista_alumnos[iteradorAlum] = alum;
                    iteradorAlum= iteradorAlum+1;
                    break;
                case 2:
                    codigo = Integer.parseInt(JOptionPane.showInputDialog("Codigo: "));
                    apellidos = JOptionPane.showInputDialog("apellidos: ");
                    Curso curs = new Curso(codigo, apellidos);
                    lista_cursos[iteradorCur] = curs;
                    iteradorCur = iteradorCur+1;
                    break;
                case 3: 
                    
                    codalum = Integer.parseInt(JOptionPane.showInputDialog("Codigo Alumno: "));
                    codCurso = Integer.parseInt(JOptionPane.showInputDialog("Codigo Curso: "));
                    CodMatri = Integer.parseInt(JOptionPane.showInputDialog("Codigo Matricua: "));
                    Matricula matri = new Matricula(CodMatri, codalum, codCurso);
                    lista_matriculados[iteradorMatriculas] = matri;
                    iteradorMatriculas = iteradorMatriculas+1; 
                    int j=0; boolean encC = false;
                    while(j<20 && encC ==false)
                    {
                        if(lista_cursos[j].codigo == codCurso){
                            encC= true;
                        }
                        j++;
                    }
                    int i=0; boolean enc = false;
                    if(encC == true)
                    {
                        while(i <=100 && enc == false)
                        {
                            if(lista_alumnos[i].getCodigo()==codalum){
                                enc = true;
                            }
                            i++;
                        }
                        lista_alumnos[i].guardarCurso(lista_cursos[j]);
                        lista_alumnos[i].guardarMatricula(matri);
                    }
                    break;
                case 4:
                    int it =0;
                    while(lista_matriculados[it]!= null)
                    {
                        JOptionPane.showMessageDialog(null,lista_matriculados[it].toString()+"\n");
                        it++;
                    }
            }
        }while(opMenu != 5);
    }
    
   
}
