
package ejercicio;

import java.util.Stack;
import javax.swing.JOptionPane;

public class Pilas {
    public void opcionF(){
        int u=1;
        int i=1;
        Stack<String> pila = new Stack<String>();
        
        while(u==1){
            String opc = JOptionPane.showInputDialog("SELECCIONE UNA OPCION\n"+
                                                                   "A. Insertar dato.\n"+
                                                                   "B. Mostrar la cima.\n"+
                                                                   "C. Sacar dato de la cima.\n"+
                                                                   "D. Limpiar pila\n"+
                                                                   "F. Salir.\n");
            
            switch(opc){
                case "A":
                    pila.push(JOptionPane.showInputDialog("ingrese un valor de tipo String para  ingresarlo a la pila"));
                    JOptionPane.showMessageDialog(null, "dato cargado");
                    break;
                    
                case "B":
                    if(pila.isEmpty()==true){
                        JOptionPane.showMessageDialog(null, "ERROR, la pila esta vacia");
                    }else
                    JOptionPane.showMessageDialog(null, pila.peek());
                    break;
                    
                case "C":
                    pila.pop();
                    JOptionPane.showMessageDialog(null, "Se quito el elemento de la cima");
                    break;
                    
                case "D":
                    while (!pila.empty()){
                    System.out.println(pila.pop());}
                    JOptionPane.showMessageDialog(null, "Lista Vaciada");
                    break;
                    
                case "F":
                    u=0;
                    JOptionPane.showMessageDialog(null, "SALIENDO");
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "digite una opcion valida");
            }
        }
    }
}
