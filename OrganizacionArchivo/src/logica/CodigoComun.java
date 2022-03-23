package logica;





public class CodigoComun {
    
    public String salto=System.getProperty("line.separator");//hacer salto de linea
    
    
    public String rrellenarEspacios(String var, int tam){
        if(var.length() > tam){return "TAMAÑO  EXEDIDO";}
        if(var.length() != tam){
            int res = (tam - var.length());//calcular cuantos espacios quedan disponibles de los 'N' espacios reservados
            for (int i = 0; i < res; i++) {
                var+=" ";//rrellena los espacios faltantes con ESPACIOS en blanco
            }
        }
        return var;
    }
    
}
