
package ejercicio;

import javax.swing.JOptionPane;

public class Ordenamientos {
    public void opcionD(){
        int u=1;
        while(u==1){
        String opc = JOptionPane.showInputDialog("SELECCIONE UNA OPCION\n"+
                                                               "A. Ordenamiento burbuja\n"+
                                                               "B. Ordenamiento shell\n"+
                                                               "C. Salir\n");
        
        switch(opc){
            case "A":
                burbuja();
                break;
                
            case "B":
                shell();
                break;
                
            case "C":
                JOptionPane.showMessageDialog(null, "SALIENDO");
                u++;
                break;
                
            default:
                JOptionPane.showMessageDialog(null, "DIGITE UNA OPCION VALIDA");
        }
    }
}
    
    public void burbuja(){
        int tamanio = Integer.parseInt(JOptionPane.showInputDialog("digite el tamaño del arreglo"));
        int arregloDatos [] = new int[tamanio];
        int e=1;
                while(e==1){
                    String opc1 = JOptionPane.showInputDialog("SELECCIONE UNA OPCION\n"+
                                                               "a. Cargar datos\n"+
                                                               "b. Mostrar datos\n"+
                                                               "c. Ordenar\n"+
                                                               "d. Salir");
                    
                    switch(opc1){
                        case "a":
                            for(int f=0; f<arregloDatos.length;f++){
                                arregloDatos[f]=Integer.parseInt(JOptionPane.showInputDialog("ingrese un valor tipo String en la posicion "+ f ));
                            }
                        break;
                        
                        case "b":
                            for(int j=0;j<arregloDatos.length;j++){
                                JOptionPane.showMessageDialog(null,"el valor en la posicion "+ j + " es "+ arregloDatos[j] );
                            }
                            break;
                            
                        case "c":
                            int i, j, aux;
                            for (i = 0; i < arregloDatos.length - 1; i++) {
                                for (j = 0; j < arregloDatos.length - i - 1; j++) {
                                    if (arregloDatos[j + 1] < arregloDatos[j]) {
                                        aux = arregloDatos[j + 1];
                                        arregloDatos[j + 1] = arregloDatos[j];
                                        arregloDatos[j] = aux;
                                    }
                                }
                            }
                            JOptionPane.showMessageDialog(null, "DATOS ORDENADOS");
                            break;
                            
                        case "d":
                            JOptionPane.showMessageDialog(null, "SALIENDO");
                            e++;
                            break;
                            
                        default:
                            JOptionPane.showMessageDialog(null, "Digite una opcion valida");
                    }
                }
    }
    
    public void shell(){
        int u=1;
        int tamanio = Integer.parseInt(JOptionPane.showInputDialog("digite el tamaño del arreglo"));
        int arregloDatos [] = new int[tamanio];
        int p=1;
                while(p==1){
                    String opc1 = JOptionPane.showInputDialog("SELECCIONE UNA OPCION\n"+
                                                               "a. Cargar datos\n"+
                                                               "b. Mostrar datos\n"+
                                                               "c. Ordenar\n"+
                                                               "d. Salir");
                    
                    switch(opc1){
                        case "a":
                            for(int f=0; f<arregloDatos.length;f++){
                                arregloDatos[f]=Integer.parseInt(JOptionPane.showInputDialog("ingrese un valor tipo String en la posicion "+ f ));
                            }
                        break;
                        
                        case "b":
                            for(int j=0;j<arregloDatos.length;j++){
                                JOptionPane.showMessageDialog(null,"el valor en la posicion "+ j + " es "+ arregloDatos[j] );
                            }
                            break;
                            
                        case "c":
                            int salto, aux, i;
                            boolean cambios;
                            for(salto=arregloDatos.length/2; salto!=0; salto/=2){
                                cambios=true;
                                while(cambios){ // Mientras se intercambie algún elemento
                                    cambios=false;
                                    for(i=salto; i< arregloDatos.length; i++) // se da una pasada
                                        if(arregloDatos[i-salto]>arregloDatos[i]){ // y si están desordenados
                                            aux=arregloDatos[i]; // se reordenan
                                            arregloDatos[i]=arregloDatos[i-salto];
                                            arregloDatos[i-salto]=aux;
                                            cambios=true; // y se marca como cambio.
                                            }
                                }
                            }
                            JOptionPane.showMessageDialog(null, "DATOS ORDENADOS");
                            break;
                            
                        case "d":
                            JOptionPane.showMessageDialog(null, "SALIENDO");
                            p++;
                            break;
                            
                        default:
                            JOptionPane.showMessageDialog(null, "Digite una opcion valida");
                    }
                }
        
    }
}
