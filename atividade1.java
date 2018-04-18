/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author chave
 */
public class atividade1 {
    public static void main (String[]args){
        double numero [] = new double [15];
        
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <=numero .length; i++){
            System.out.println("Digite o numero:"); 
            numero [i-1] = sc. nextDouble();
            
            Arrays.sort(numero); 
            System.out.println("o maior é:" +numero[14]);
             System.out.println("o menor é:" +numero[0]);
        }
    }
}
