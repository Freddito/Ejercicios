
package ejercicio;

import javax.swing.JOptionPane;

public class Colas {
    public void opcionG() {
        String opcion;
        int tamanio = 0;
        int elemento = 0, opc=1;
        Cola colita = new Cola();
        
        do{
        
            try {
                opcion= JOptionPane.showInputDialog(null,"A. Insertar dato\n"
                        + "B. Elemento ubicado al inicio de la cola\n"
                        + "C. Quitar un elemento en la Cola\n"
                        + "D. Limpiar cola\n"
                        + "E. Salir","Menú de opciones de una Cola",
                        JOptionPane.QUESTION_MESSAGE);
                
                switch(opcion){
                    case "A":
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el elemento","Insertando en la Cola",JOptionPane.QUESTION_MESSAGE));
                         colita.insertar(elemento);
                        break;
                        
                    case "B":
                        if(!colita.estaVacia()){
                        JOptionPane.showMessageDialog(null, "El elemento ubicado al inicio de la Cola es "+colita.inicioCola(),"Cola Vacia",JOptionPane.INFORMATION_MESSAGE);
                        }else{
                        JOptionPane.showMessageDialog(null, "La Cola está Vacia","Cola Vacia",JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                        
                    case "C":
                        if(!colita.estaVacia()){
                            JOptionPane.showMessageDialog(null, "El elemento atendido es " + colita.quitar(),"Quitando elemento de la cola",JOptionPane.INFORMATION_MESSAGE);
                        }else {
                            JOptionPane.showMessageDialog(null, "La cola está vacia" ,"Cola Vacia",JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                        
                    case "D":
                        break;
                        
                    case "E":
                        JOptionPane.showMessageDialog(null, "Aplicación Finalizada","Fin",JOptionPane.INFORMATION_MESSAGE);
                        opc=0;
                        break;
                        
                    default:
                        JOptionPane.showMessageDialog(null, "Opción incorrecta","¡Cuidado!",JOptionPane.INFORMATION_MESSAGE);
                     
                }
               
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
                        
            }
        
        }while(opc==1);
    }
    }
