
package evaluacionverdaderofalso;

public class EvaluacionVerdaderoFalso {

   
    public static void main(String[] args) {
        // TODO code application logic here
        int M = 6,T = 1,K = -10;
        
        if (M>T){
            System.out.println("La Evaluacion es Verdadera");
            
        }  else
            System.out.println("La Evaluacion es Falsa"); 
        
        if (T / K == -5){
            System.out.println("La Evaluacion es Verdadera");
        }else
            System.out.println("La Evaluacion es Falsa"); 
        
        if((M+T != 7)||(M-T == 5)) {
             System.out.println("La Evaluacion es Verdadera");
        } else 
            System.out.println("La Evaluacion es Falsa");
    }
    
    }
    

