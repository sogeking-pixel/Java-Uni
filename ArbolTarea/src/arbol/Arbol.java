package arbol;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Arbol {
	
        
        private Nodo raiz;
        
        private boolean control;
        private StringBuffer textFile = new StringBuffer();
        private StringBuffer firtsFile = new StringBuffer();
        
        private String cad="";
        private int cont=0;
        
	

    public Arbol(){
        
    }

    public boolean isControl() {
        return control;
    }

    public void setControl(boolean control) {
        this.control = control;
    }

    public StringBuffer getTextFile() {
        return textFile;
    }

    public void setTextFile(StringBuffer textFile) {
        this.textFile = textFile;
    }

    public StringBuffer getFirtsFile() {
        return firtsFile;
    }

    public void setFirtsFile(StringBuffer firtsFile) {
        this.firtsFile = firtsFile;
    }
    
    public Nodo addHijo(String nombreHijo, String nombrePadre, Nodo raiz){
        for (int i = 0; i < raiz.getHijos().size(); i++) {
           
            Nodo padreNodo = raiz.getHijos().get(i);
            
            if(padreNodo.getNombre().equals(nombrePadre)){
                padreNodo.agregarHijo(new Nodo(nombreHijo, padreNodo));
                
                control = true;
                break;
            }
            
            if(padreNodo.getHijos().size()!=0){
                addHijo(nombreHijo, nombrePadre, padreNodo);
            }
        }
        
        return raiz;
    }
	
    public void visualizarArbol(Nodo raiz, boolean b){
        this.cad = "";
        String tab = "";
        for (int i = 0; i < raiz.getHijos().size(); i++) {
            tab = "";
            
            for (int j = 0; j < raiz.cntHijos(raiz); j++) {
                
                tab += '\t';
                
            }
            
            String str = tab + raiz.getHijos().get(i).getNombre();
            
            if(b){
                textFile.append(str + " " + System.getProperty("line.separator") );
            }
            else{
                System.out.println(str);
            }
            
            if(raiz.getHijos().get(i).getHijos().size() != 0){
                visualizarArbol(raiz.getHijos().get(i), b);
            }
            
            else{
                firtsFile.append(setLineOfFirstFile(raiz.getHijos().get(i)) + System.getProperty("line.separator"));
            }
        }
    }
    
    public String setLineOfFirstFile(Nodo nodo){
        String line = "";

        ArrayList<String> lineList = new ArrayList<String>();

        while (nodo.getNombre()!= "RootNode"){
            lineList.add(nodo.getNombre());
            nodo = nodo.getPadre();
        }

        Collections.reverse(lineList);
        
        for(int i=0; i< lineList.size();i++){
            line += lineList.get(i) + ",";
        }

        return line.substring(0, line.length()-1);
    }
    
    public void saveTreeStructureToFile(Nodo raiz, String filename,StringBuffer strBuffer){
        try{
            //se crea el archivo
            FileWriter fstream = new FileWriter(filename);
            BufferedWriter out = new BufferedWriter(fstream);
            out.write(strBuffer.toString());
            out.close();
        }catch (Exception e){
            System.err.println("Error: " + e.getMessage());
        }
    }
    
    
    public  Nodo sendRaiz(){
        File file = new File("readText.txt");
        BufferedReader reader = null;

       Nodo root = new Nodo("RootNode", null);

        
        Nodo broot = root;
        
        try {
            
            reader = new BufferedReader(new FileReader(file));
            String line = null;
 
            while ((line = reader.readLine()) != null) {
                String []fields = line.split(",");
                for(int i =0;i<fields.length;i++){

                    Nodo leaf = new Nodo(fields[i], broot);
 
                    int containsIndex = broot.ContainsNode(leaf);

                    if (containsIndex != -1){
 
                        broot = broot.getHijos().get(containsIndex);
                    }else{

                        broot.agregarHijo(leaf);

                        broot = leaf;

                    }
                }
                broot = root;

            }
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no ha sido encontrado");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error");
        } finally {
            try {
                if (reader != null) {
                reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return root;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	 
	 public Nodo getRaiz() {
		 return raiz; 
	 }
}
