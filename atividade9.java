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
public class atividade9 {
    public static void main (String[]args){
        int i, numDiv=0;
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite um número:");
        i=sc.nextInt();
        
        for (int y=1; y<i;y++){
            if (i%y==0)
                numDiv++;
            
        }if (numDiv == 2){
            System.out.println("O número é primo");
        } else {
            System.out.println("O número não é primo");
        }
    }
}
