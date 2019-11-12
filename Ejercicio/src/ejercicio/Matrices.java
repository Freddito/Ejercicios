
package ejercicio;

import javax.swing.JOptionPane;

public class Matrices {
    public void opcionC(){
        int tamanio;
        tamanio = Integer.parseInt(JOptionPane.showInputDialog("digite el tamaño de la matriz cuadrada"));
        int tabla [][] = new int [tamanio][tamanio];
        int f=1;
        
        while(f==1){
            int opc = Integer.parseInt(JOptionPane.showInputDialog("SELECCIONE UNA OPCION\n"
                                                                    +"1.Cargar datos\n"
                                                                    +"2.Mostrar datos\n"
                                                                    +"3.Salir"));
            
            switch(opc){
                case 1:
                    for(int i=0 ; i<tamanio;i++){
                        for(int j=0;j<tamanio;j++){
                            tabla[i][j] = Integer.parseInt(JOptionPane.showInputDialog("digite un valor en la posicion ["+i+"] ["+j+"]"));
                        }
                    }
                    break;
                    
                case 2:
                    for(int i=0 ; i<tamanio;i++){
                        for(int j=0;j<tamanio;j++){
                            JOptionPane.showMessageDialog(null,"el valor en la posicion ["+i+"] ["+j+"] es "+tabla[i][j]);
                        }
                    }
                    break;
                    
                case 3:
                    JOptionPane.showMessageDialog(null, "SALIENDO");
                    f++;
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Seleccione una opcion valida");
                    
            }
        }
        
    }
}
