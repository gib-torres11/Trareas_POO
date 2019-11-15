
package Ayudantes;


// Creacion de clase llamada Ciudadano
public class Ciudadano {
    
    //Declaramos la Variables Protegidas
    private String nombre;
    
    private int edad;
    
    private int Experiencia; 
    
    
    //Declaramos el Constructor de la Clase Ciudadano
    public Ciudadano(){
        
}
    // Declaramos metodos publicos Set que no retorna ningun valor
    public void setNombre(String nombre){
        this.nombre = nombre;
       
}
    // Declaramos un metodo publico Get el cual retorna le volor de nombre
    public String getnombre(){
        return nombre;
    }

   // Declaramos metodos publicos Set que no retorna ningun valor
    public void setedad(int edad){
        this.edad = edad;
       
    }
    
   // Declaramos un metodo publico Get el cual retorna le volor de Edad
    public int getedad(){
        return edad;
    }
    
    // Declaramos un metodo publico Set el cual no retorna ningun volor 
    public void setExperiencia(int Experiencia){
        this.Experiencia = Experiencia;
       
}
   // Declaramos un metodo publico Get el cual retorna le volor de Años Experiencia
    public int getnExperiencia(){
        return Experiencia;
    }
}
    
