/*
 * Clase Filacolor que representa una Secuencia de Pixeles.
 */
package ufps.negocio;

import ufps.util.Secuencia;
import ufps.negocio.Pixel;
/**
 *
 * @author FERNEY JARAMILLO VEGA-1150671
 * @author VALERIA GABRIELA SALAZAR-1150674
 */
public class FilaColor {

    Secuencia<Pixel> pixeles  ;
    
    
    /**
     * Constructor vacio de la clase FilaColor.
     */
    public FilaColor() {
     
    }
    
    /**
     * Metodo contructor de la Clase FilaColor , recibe un entero para crear una nueva Secuencia de pixeles.
     * @param filas 
     */
    public FilaColor(int filas){

     this.pixeles= new Secuencia<Pixel>(filas);
     
     for(int i =0 ; i<pixeles.length();i++){
     int dato = (int)(Math.random()*200);
     int dato2 = (int)(Math.random()*200);
     int dato3 = (int)(Math.random()*200);
      pixeles.set(i, new Pixel (dato,dato2,dato3));
    
     }

}
    /**
     * Metodo get de la Clase Secuencia<pixel> que retorna la secuencia de pixeles actual.
     * @return Secuencia 
     */
    public Secuencia<Pixel> getPixeles(){
        return this.pixeles;
   
    }
    /**
     * Metodo set de la clase Secuencia<pixel> que permite modificar la secuencia actual por una nueva.
     * @param val 
     */
    public void setPixeles (Secuencia<Pixel> val){
         this.pixeles=val;
    }
   
}
/**
 * Fin De la Clase FilaColor
 */