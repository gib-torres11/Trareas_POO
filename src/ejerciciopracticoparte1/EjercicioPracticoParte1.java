
package ejerciciopracticoparte1;

import Ayudantes.Ciudadano;

public class EjercicioPracticoParte1 {

  
 
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Instanciar la Clase
        Ciudadano ciudadano = new Ciudadano();
         
        //Establecer valor a variable privada
        ciudadano.setNombre("Ivan Torres");
        //Imprimir en pantalla
        System.out.println("El Nombre del ciudadano es:"+ciudadano.getnombre());
        ciudadano.setedad(26);
        System.out.println("La edad del Ciudadano es:"+ciudadano.getedad()+" Años");
        ciudadano.setExperiencia(3);
        System.out.println("La Experiencia del ciudadano es de:"+ciudadano.getnExperiencia()+ " Años");
        
    }
    
}
