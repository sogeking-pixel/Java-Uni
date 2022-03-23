package archivos;

import java.io.*;

public class escribir2_txt {
    public static void main(String[] args) {
         String[] lineas={"Pascal","C++","Java","Python","R"};
         Writer fout=null;
        try{
            fout=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("amigos2.txt"),"UTF-8"));
            for(String linea:lineas){
                fout.write(linea+"\n");                
            }
            fout.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
}
