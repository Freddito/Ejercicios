
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
                   int numero1 = 3;
                   int numero2 = 4;
                   int i=1;
                while(i==1){
                int opc = Integer.parseInt(JOptionPane.showInputDialog(null,"SELECCIONE UNA OPCION\n"+
                                                                            "1. SUMA\n"+
                                                                            "2. RESTA\n"+
                                                                            "3. MULTIPLICACION\n"+
                                                                            "4. DIVISION\n"+
                                                                            "5. VOLVER"));
        
                switch (opc){
                    case 1:
                        JOptionPane.showMessageDialog(null, obj.sumar(numero1,numero2));
                        break;
                    case 2: 
                        JOptionPane.showMessageDialog(null, obj.restar(numero1,numero2));
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, obj.multiplicar(numero1,numero2));
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, obj.division(numero1,numero2));
                        break;
                    case 5:
                        i=0;
                        JOptionPane.showMessageDialog(null, "VOLVIENDO");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "opcion no valida");
                 }     }     
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
