/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
import javax.swing.JOptionPane;
public class D13x2 {
    
    public static void main (String [] args){
        double tmc;
        double tpua = 0;
        double tpcma;
        double tpdc;
        int i;
        double r;
        double d;
        
        int x;
        x = Integer.parseInt(JOptionPane.showInputDialog(null,"Quantidade de círculos : "));
        double[] a = new double [x];
        tmc = Double.parseDouble(JOptionPane.showInputDialog(null,"Tamanho do círculo maior : "));
        d = tmc;
        tpdc = (tmc/6);
      //  JOptionPane.showMessageDialog(null,"Valor de tpdc é : "+tpdc);
                        r = d/2;
                a[0] = (Math.PI * (Math.pow(r,2)));

               // JOptionPane.showMessageDialog(null,"Valor de D : "+d+" Valor de a[0] : "+a[0]);
                
                
        for(i=1;i<=x-1;i++){
            
            r = ((d-tpdc) /2);
           
                //JOptionPane.showMessageDialog(null,"Valor de D na Posição : "+i+" Antes de diminuir é : " +r);
            a[i] = (Math.PI * (Math.pow(r,2)));
            //JOptionPane.showMessageDialog(null,"Valor de A["+i+"] é "+a[i]);
          d = d - tpdc;
        }
        tpua = a[0];
        for(i=1;i<x;i++){
        //tpua = a[0] + a[1] + a[2] + a[3] + a[4] + a[5];
            tpua = tpua + a[i];
            }
        tpcma = tpua * 5000;
        
        
        JOptionPane.showMessageDialog(null,"Quantidade de papelão em um circulo : "+tpua);
        JOptionPane.showMessageDialog(null,"Quantidade de 5000 circulos : "+tpcma);
    }
    
}
