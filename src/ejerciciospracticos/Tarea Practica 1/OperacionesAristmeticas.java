/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesaristmeticas;

public class OperacionesAristmeticas {

    
    public static void main(String[] args) { 
        
        //Declaramos Variables
        int Numero1 = 50;
        int Numero2 = 10;
        int suma,resta,multiplicacion = 0;
        double division = 0;
        
        suma = Numero1 + Numero2;
        resta = Numero1 - Numero2;
        multiplicacion = Numero1 * Numero2;
        
        if ( Numero2!= 0){
            division = Numero1 / Numero2;
        }
        
        System.out.println("La Suma es: "+suma);
        System.out.println("La Resta es: "+resta);
        System.out.println("La Multiplicacion es: "+multiplicacion);
        System.out.println("La Division es: "+division);
        
        System.out.println("Todos los Resultados Fueron Calculados");
        System.out.println("Que tenga Buen Dia");
        System.out.println(":-)");
    }
    
}
