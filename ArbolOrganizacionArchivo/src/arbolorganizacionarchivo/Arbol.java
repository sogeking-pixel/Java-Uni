/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolorganizacionarchivo;

/**
 *
 * @author yerso
 */
public class Arbol {
	private Nodo raiz;
        private String cad="";
        private int cont=0;
        
	public Arbol(String dato) {
		raiz=new Nodo(dato);
		raiz.setIzquierda(null);
		raiz.setDerecha(null);
	}

   
	
	 public String preOrden(Nodo ref) {
		 if(ref!=null) {
                        if(ref==raiz){
                            cad="";
                        }
                        if(!ref.getDato().equals("")){
                            if(cad.equals("")){
                                cad = ref.getDato();
                            }else{
                                 cad=cad+" = "+ref.getDato();
                            }
                            
                        }
                            
                        preOrden(ref.getIzquierda());
			preOrden(ref.getDerecha());
		 }
                 return cad; 
	 }
	 public String inOrden(Nodo ref) {
		 if(ref!=null) {
                        if(ref==raiz){
                            cad="";
                        }
			inOrden(ref.getIzquierda());
                       if(!ref.getDato().equals("")){
                            if(cad.equals("")){
                                cad = ref.getDato();
                            }else{
                                 cad=cad+" = "+ref.getDato();
                            }
                            
                        } 
                        inOrden(ref.getDerecha());
		 }
            return cad; 
	 }
	 public String posOrden(Nodo ref) {
		 if(ref!=null) {
			if(ref==raiz){
                            cad="";
                        }
			
                        posOrden(ref.getIzquierda());
			posOrden(ref.getDerecha());
                        if(!ref.getDato().equals("")){
                            if(cad.equals("")){
                                cad = ref.getDato();
                            }else{
                                 cad=cad+" = "+ref.getDato();
                            }
                            
                        }
		 }
                 return cad; 
	 }
         
        public String invPreOrden(Nodo ref) {
		 if(ref!=null) {
                        if(ref==raiz){
                            cad="";
                        }
                        if(!ref.getDato().equals("")){
                            if(cad.equals("")){
                                cad = ref.getDato();
                            }else{
                                 cad=cad+" = "+ref.getDato();
                            }
                            
                        }
                        invPreOrden(ref.getDerecha());
                        invPreOrden(ref.getIzquierda());
		 }
                 return cad; 
	}
        
        public String invInOrden(Nodo ref) {
		 if(ref!=null) {
                        if(ref==raiz){
                            cad="";
                        }
			invInOrden(ref.getDerecha());
                       if(!ref.getDato().equals("")){
                            if(cad.equals("")){
                                cad = ref.getDato();
                            }else{
                                 cad=cad+" = "+ref.getDato();
                            }
                            
                        }
                        invInOrden(ref.getIzquierda());
		 }
            return cad; 
	 }
        
        public String invPosOrden(Nodo ref) {
		 if(ref!=null) {
			if(ref==raiz){
                            cad="";
                        }
			
			invPosOrden(ref.getDerecha());
                        invPosOrden(ref.getIzquierda());
                        if(!ref.getDato().equals("")){
                            if(cad.equals("")){
                                cad = ref.getDato();
                            }else{
                                 cad=cad+" = "+ref.getDato();
                            }
                            
                        }
		 }
                 return cad; 
	 }
        
        public String grado(Nodo ref) {
		 if(ref!=null) {
                        if(ref==raiz){
                            cad="";
                        }
                        int cont=0;
                        if(ref.getDerecha()!=null){
                            cont++;
                        }
                        if(ref.getIzquierda()!=null){
                            cont++;
                        }
                        if(!ref.getDato().equals("")){
                            if(cad.equals("")){
                                cad = "\n\tNodo: "+ref.getDato()+"\n\tGrado: "+cont+"\n=================================================\n";
                            }else{
                                 cad=cad+"\n\tNodo: "+ref.getDato()+"\n\tGrado: "+cont+"\n=================================================\n"; 
                            }
                            
                        }
                       
                        grado(ref.getIzquierda());
			grado(ref.getDerecha());
		 }
                 return cad; 
	 }
        
        public String peso(Nodo ref) {
		if(ref!=null) {
                    if(ref==raiz){
                        cad="";
                    }
			
                    peso(ref.getIzquierda());
                    peso(ref.getDerecha());
                    
                    cont=pesoAux(ref);
                    if(!ref.getDato().equals("")){
                            if(cad.equals("")){
                                cad = "\n\tNodo: "+ref.getDato()+"\n\tPeso: "+cont+"\n=================================================\n";
                            }else{
                                cad=cad+"\n\tNodo: "+ref.getDato()+"\n\tPeso: "+cont+"\n=================================================\n";
                            }
                            
                        }
                    
                    cont=0;
		}
                return cad; 
        }
        public int pesoAux(Nodo ref){
            
            if(ref!=null){
                
                pesoAux(ref.getIzquierda());
                pesoAux(ref.getDerecha());
            
                if(ref.getDerecha()!=null){
                    cont++;
                }
                if(ref.getIzquierda()!=null){
                    cont++;
                }
            }
            return cont;
        }
	 
	 public Nodo getRaiz() {
		 return raiz; 
	 }
         
         public void insertar(String elemento){
             raiz = insertar(raiz, elemento);
         }
         public int factorEquilibrio(Nodo arbol){
             if(arbol == null)
                 return 0;
             else
                 return (arbol.getFactorEquilibrio()+1);
         }
         
         private int mFe(int alturaIzquierdo, int alturaDerecho){
             if(alturaIzquierdo > alturaDerecho)
                 return alturaIzquierdo;
             else
                 return alturaDerecho;
         }
         
         private Nodo insertar(Nodo arbol, String elemento){
             if(arbol == null){
                 arbol = new Nodo (elemento, null, null);
             }
             else{
                 if(elemento.compareTo(arbol.getDato()) < 0){
                     arbol.setIzquierda(insertar(arbol.getIzquierda(), elemento));
                     if( factorEquilibrio(arbol.getDerecha()) - factorEquilibrio(arbol.getIzquierda()) == -2){
                         if(elemento.compareTo(arbol.getIzquierda().getDato()) < 0){
                             arbol = RotacionSimpleDer(arbol);
                        
                         }
                         else{
                             arbol = RotacionDobleIzqDer(arbol);
                         }
                     }
                 }
                 else{
                     if(elemento.compareTo(arbol.getDato())> 0){
                         arbol.setDerecha(insertar(arbol.getDerecha(), elemento));
                         if(factorEquilibrio(arbol.getDerecha()) - factorEquilibrio(arbol.getIzquierda()) == 2){
                             if(elemento.compareTo(arbol.getDerecha().getDato()) > 0){
                                 arbol = RotacionSimpleIzq(arbol);
                             }
                             else{
                                 arbol = RotacionDobleDerIzq(arbol);
                             }
                         }
                     }
                     else{
                         ;
                        }
                 }
                 
             }
             arbol.setFactorEquilibrio(mFe(factorEquilibrio(arbol.getIzquierda()),factorEquilibrio(arbol.getDerecha())));
             return arbol;
         }
         
        private Nodo RotacionSimpleDer(Nodo arbol){
            Nodo subArbol = arbol.getIzquierda();
            arbol.setIzquierda(subArbol.getDerecha());
            subArbol.setDerecha(arbol);
            arbol.setFactorEquilibrio(mFe(factorEquilibrio(arbol.getIzquierda()) , arbol.getFactorEquilibrio()));
            return subArbol;
        } 
        private Nodo RotacionSimpleIzq(Nodo arbol){
            Nodo subArbol = arbol.getDerecha();
            arbol.setDerecha(subArbol.getIzquierda());
            subArbol.setIzquierda(arbol);
            arbol.setFactorEquilibrio(mFe(factorEquilibrio(arbol.getIzquierda()) , factorEquilibrio(arbol.getDerecha())));
            subArbol.setFactorEquilibrio(mFe(factorEquilibrio(subArbol.getDerecha()) , arbol.getFactorEquilibrio()));
            return subArbol;
        } 
        
        private Nodo RotacionDobleIzqDer(Nodo arbol){
           arbol.setIzquierda(RotacionSimpleIzq(arbol.getIzquierda()));
           return RotacionSimpleDer(arbol);
        }
        
        private Nodo RotacionDobleDerIzq(Nodo arbol){
           arbol.setDerecha(RotacionSimpleDer(arbol.getDerecha()));
           return RotacionSimpleIzq(arbol);
        }
}

