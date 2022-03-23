package archivos;

import java.io.*;

public class EscrituraTxt {
    public static void main(String[] args) {
        String[] lineas={"Pascal","C++","Java","Python","R"};
        FileWriter fichero=null;
        try{
            fichero=new FileWriter("amigos1.txt");
            for(String linea:lineas){
                fichero.write(linea+"\n");                
            }
            fichero.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
}
