
package ejercicio;

import javax.swing.JOptionPane;

public class Ejercicio {

    public static void main(String[] args) {
        Operaciones obj = new Operaciones ();
        Arreglos opcB = new Arreglos();
        int w=1;
        int f=0;
        
        while(w==1){
            
           int opcion = Integer.parseInt(JOptionPane.showInputDialog("SELECCIONE UNA OPCION\n"+
                                                                     "1. Operaciones Basicas\n"+
                                                                     "2. Arreglos\n"+
                                                                     "3. Matrices\n"+
                                                                     "4. SALIR\n"));
           
           switch(opcion){
               case 1:
                   obj.opcionA();
                   break;
                   
               case 2:
                   opcB.opcionB();
                   break;
                   
               case 3:
                   obj.vector();
                   break;
                   
               case 4:
                   w=0;
                   JOptionPane.showMessageDialog(null, "SALIENDO");
                   break;
                   
               default:
                   JOptionPane.showMessageDialog(null, "DIGITE UNA OPCION VALIDA");
        }
        }
    }
    
}
