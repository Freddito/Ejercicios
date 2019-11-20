
package ejercicio;

import javax.swing.JOptionPane;

public class Ejercicio {

    public static void main(String[] args) {
        Operaciones obj = new Operaciones ();
        Arreglos opcB = new Arreglos();
        Matrices opcC = new Matrices();
        Ordenamientos opcD = new Ordenamientos();
        Listas opcE = new Listas();
        int w=1;
        
        while(w==1){
            
           int opcion = Integer.parseInt(JOptionPane.showInputDialog("SELECCIONE UNA OPCION\n"+
                                                                     "A. Operaciones Basicas\n"+
                                                                     "B. Arreglos\n"+
                                                                     "C. Matrices\n"+
                                                                     "D. Ordenamientos\n"+
                                                                     "E. Listas\n"+
                                                                     "F. Salir\n"));
           
           switch(opcion){
               case 1:
                   obj.opcionA();
                   break;
                   
               case 2:
                   opcB.opcionB();
                   break;
                   
               case 3:
                   opcC.opcionC();
                   break;
                   
               case 4:
                   opcD.opcionD();
                   break;
                   
               case 5:
                   opcE.opcionE();
                   break;
                   
               case 6:
                   w=0;
                   JOptionPane.showMessageDialog(null, "SALIENDO");
                   break;
                   
               default:
                   JOptionPane.showMessageDialog(null, "DIGITE UNA OPCION VALIDA");
        }
        }
    }
    
}
