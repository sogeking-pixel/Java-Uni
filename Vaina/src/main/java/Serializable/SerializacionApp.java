package Serializable;

import java.io.*;

public class SerializacionApp {
    
    public static void main(String[] args) {
        //Creamos el objeto
        Contactos contact1=new Contactos("Carlos","Rios",91405289);
        Contactos contact2=new Contactos("Lalo","Castelli",91852740);
        Contactos contact3=new Contactos("Lucia","Jimenez",94955663);
        
        try(ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream("miscontactos.dat"))){
        //Escribimos en el fichero
            oos.writeObject(contact1);
            oos.writeObject(contact1);
            
            
            
            
        }catch(IOException e){
        }        
        
        try(ObjectInputStream ois=new ObjectInputStream (new FileInputStream("miscontactos.dat"))){
           while(true){
               Contactos aux=(Contactos)ois.readObject();
               System.out.println(aux.getNombre());
               System.out.println(aux.getApellido());
               System.out.println(aux.getNumero());
               System.out.println("");
           
           }
        
        }catch(ClassNotFoundException e){
        }catch(EOFException e){
        }catch(IOException e){
        }
    }

}
  