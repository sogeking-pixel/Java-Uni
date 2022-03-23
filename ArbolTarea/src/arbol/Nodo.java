package arbol;
import java.util.ArrayList;
import java.util.Iterator;

public class Nodo {
	private String nombre;  
	private Nodo padre; 
	private ArrayList<Nodo> hijos = null; 

    public Nodo(String nombre, Nodo padre) {
        this.nombre = nombre;
        this.padre = padre;
        hijos = new  ArrayList<Nodo>();
    }

   public void agregarHijo(Nodo hijo){
       hijos.add(hijo);
   }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Nodo getPadre() {
        return padre;
    }

    public void setPadre(Nodo padre) {
        this.padre = padre;
    }

    public ArrayList<Nodo> getHijos() {
        return hijos;
    }

    public void setHijos(ArrayList<Nodo> hijos) {
        this.hijos = hijos;
    }
   
   public int cntHijos(Nodo nodo){
        int i= 0;
        while (nodo.nombre!= "null"){
            i +=1;
            nodo = nodo.padre;
        }
        return i;
    }
   public int ContainsNode(Nodo node){
            for(int i=0; i<this.hijos.size(); i++){

                if(this.hijos.get(i).getNombre().equals(node.getNombre())){
                    return i;
                }
            }
        return -1;
    }
    
	
}
