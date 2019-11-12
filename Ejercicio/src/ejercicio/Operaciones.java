
package ejercicio;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Operaciones {
    private int numero1 = 0;
    private int numero2 = 0;
    private double resultado;
    
    
    public void setNumero1(int num1){
        this.numero1 = num1;
    }
    
    public int getNumero1(){
        return this.numero1;
    }
    
    public void setNumero2(int num2){
        this.numero2 = num2;
    }
    
    public int getNumero2(){
        return this.numero2;
    }
    
    public void setResultado(double result){
        this.resultado = result;
    }
    
    public double getResultado(){
        return this.resultado;
    }
    
    public void opcionA(){
                int i=1;
                numero1 = Integer.parseInt(JOptionPane.showInputDialog(null,"digite el valor del primer numero"));
                numero2 = Integer.parseInt(JOptionPane.showInputDialog(null,"digite el valor del segundo numero"));
                while(i==1){
                int opc = Integer.parseInt(JOptionPane.showInputDialog(null,"SELECCIONE UNA OPCION\n"+
                                                                            "1. SUMA\n"+
                                                                            "2. RESTA\n"+
                                                                            "3. MULTIPLICACION\n"+
                                                                            "4. DIVISION\n"+
                                                                            "5. VOLVER"));
        
                switch (opc){
                    case 1:
                        JOptionPane.showMessageDialog(null, sumar());
                        break;
                    case 2: 
                        JOptionPane.showMessageDialog(null, restar());
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, multiplicar());
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, division());
                        break;
                    case 5:
                        i=0;
                        JOptionPane.showMessageDialog(null, "VOLVIENDO");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "opcion no valida");
                 }     }
        
    }
    
    public int sumar(){
       return this.getNumero1() + this.getNumero2(); 
    }
    
    public int restar(){
       return this.getNumero1() - this.getNumero2(); 
    }
    
    public int multiplicar(){
       return this.getNumero1() * this.getNumero2(); 
    }
    
    public double division(){
       return (double) this.getNumero1()/this.getNumero2(); 
    }
    
    public void tablaMultiplicar(){
        int tabla [][] = new int [10][3];
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));
        
        for(int i=0 ; i<10 ; i++){
                tabla[i][0]=numero;
                tabla[i][1]=i+1;
                tabla[i][2] = tabla[i][0] * tabla[i][1];
        }
        for(int i=0 ; i<10 ; i++){
                JOptionPane.showMessageDialog(null,tabla[i][0]+" X "+tabla[i][1]+" = "+tabla[i][2]);
        }  
    }
    
    public void vector(){
        String arregloDatos [] = new String[3];
       
                
       
                
    }
}
