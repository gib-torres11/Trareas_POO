/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioarreglomultidimencional;


public class EjercicioArregloMultidimencional {

    
    public static void main(String[] args) {
        System.out.println(" ***** DATOS PERSONALES ALUMNOS ****** ");
        System.out.println("");
        // TODO code application logic here
        String[ ][ ]  informacionAlumno = new String[5][5];
        informacionAlumno[0][0]= "Eduardo Rivera    - ING Industrial     - N.T";
        informacionAlumno[1][1]= "Kevin Alfaro      - ING En Computacion - N.T";
        informacionAlumno[2][2]= "Heli Reyes        - ING En Electronica - N.T";
        informacionAlumno[3][3]= "Aylin Funez       - ING En Computacion - N.T";
        informacionAlumno[4][4]= "Cristian Menjivar - ING Industrial     - N.T";
        System.out.println( ""+informacionAlumno[0][0]);
        System.out.println( ""+informacionAlumno[1][1]);
        System.out.println( ""+informacionAlumno[2][2]);
        System.out.println( ""+informacionAlumno[3][3]);
        System.out.println( ""+informacionAlumno[4][4]);
        System.out.println(" ************************************* ");
      
  

    }
    
}
