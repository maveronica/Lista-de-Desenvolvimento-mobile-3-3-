/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista3;

import java.util.Scanner;

/**
 *
 * @author chave
 */
public class atividade7 {
    
      
    public static void main(String[] args) {
        
        double mfinal, maiorm = 0, menorm = 0, mturma = 0;
        int con = 0;

        Scanner entrada = new Scanner(System.in);
       
        do {
            System.out.println("Digite a media final: ");
            mfinal = entrada.nextDouble();
            con++;
            
            if (mfinal >= 0) {
                mturma = mturma + mfinal;
            }

            if (mfinal > maiorm) {
                maiorm = mfinal;
            } else {
                
                menorm = mfinal;
            }
           
        } while (mfinal >= 0);

        
        System.out.println("A maior media é: " + maiorm);
        System.out.println("A menor media é: " + menorm);
        System.out.println("A media da turma é: " + mturma / (con - 1));
    }

}
  