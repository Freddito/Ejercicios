
package ejercicio;

import javax.swing.JOptionPane;

public class Ejercicio {

    public static void main(String[] args) {
        Operaciones obj = new Operaciones ();
        int w=1;
        int f=0;
        
        while(w==1){
            
           int opcion = Integer.parseInt(JOptionPane.showInputDialog("SELECCIONE UNA OPCION\n"+
                                                                     "1. CALCULADORA\n"+
                                                                     "2. TABLA DE MULTIPLICAR\n"+
                                                                     "3. CARGAR Y MOSTRAR UN VECTOR\n"+
                                                                     "4. SALIR\n"));
           
           switch(opcion){
               case 1:
                   obj.opcionA();
                   break;
                   
               case 2:
                   obj.tablaMultiplicar();
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
