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
public class atividade8 {
    
    public static void main(String[] args) {
        //Declarando variaveis
        int n1, par = 1, impar = 1;
        //
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira um numero aqui: ");
       
        n1 = entrada.nextInt();

        System.out.println("Os primeiros numeros PARES anteriores a " + n1 + " são: ");
        
        while (par <= n1) {
            
            if ((par % 2) == 0) {
                System.out.println(par);
            }
           
            par++;

        }
        System.out.println("Os primeiros numeros IMPARES anteriores a " + n1 + " são: ");
        while (impar <= n1) {
            
            if ((impar % 2) != 0) {
                System.out.println(impar);
            }
            
            impar++;
        }
    }

}


