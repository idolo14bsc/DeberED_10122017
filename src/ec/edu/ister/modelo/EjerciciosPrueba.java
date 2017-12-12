package ec.edu.ister.modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * Nombre: Cristian Calle
 */

public class EjerciciosPrueba {
    private Integer arrayTemperaturas[];
    
    public void dimensionar() {
        int dim = Integer.parseInt(JOptionPane.showInputDialog("ingrese cuantas temperaturas"));
        arrayTemperaturas = new Integer[dim];
    }
     public int tamaño() {
        return arrayTemperaturas.length;
    }

    public void llenarArreglo(){
        for (int i = 0; i < tamaño(); i++) {
            arrayTemperaturas[i]=(int)(Math.random()*10);
            
        }
    }
    public void imprimir(){
       String acu="";
        for (int i = 0; i < arrayTemperaturas.length; i++) {
           acu += " "+arrayTemperaturas[i];
        }
         JOptionPane.showMessageDialog(null,acu);
    }
     public void imprimirFacil(){
        
        JOptionPane.showMessageDialog(null,Arrays.toString(arrayTemperaturas));
        
    }
    public void ordenar(){
        Arrays.sort(arrayTemperaturas);
    }
    public  void maximo(){
        List<Integer> arr = new ArrayList();
        arr=Arrays.asList(arrayTemperaturas);
        Integer max= Collections.max(arr);
        JOptionPane.showMessageDialog(null,max);
        }
    
    
    
    public  void menu () {
        int op;
        do {
            op=Integer.parseInt(JOptionPane.showInputDialog(""
                    + "                  Menu \n"
                    + "1.- Dimensionar Arreglo \n"
                    + "2.- Llenar  Arreglo Random\n"
                    + "3.- Imprimir Arreglo\n"
                    + "4.- Ordenar Arreglo\n"
                    + "5.- Maximo del Arreglo\n"
                    + "6.- Salir"));
            switch(op){
                case 1:
                    dimensionar();
                    break;
                case 2:
                    llenarArreglo();
                    break; 
                 case 3:
                    imprimir();
                    break;  
                 case 4:
                    ordenar();
                    imprimirFacil();
                    break; 
                 case 5:
                    maximo();
                    break;   
            }
        } while (op!=6);
            
        }
    
}
