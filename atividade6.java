/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista3;

import java.util.Scanner;


public class atividade6 {
    
    public static void main(String[] args) {
        
        double x1, x2, x3;
        double s, p, m;
        Scanner sc = new Scanner(System.in);

        boolean a = true;
        
        while (a) {
            
            System.out.println("x1: ");
            x1 = sc.nextInt();
            System.out.println("x2: ");
            x2 = sc.nextInt();
            System.out.println("x3: ");
            x3 = sc.nextInt();
            
            if ((x3 > x2) && (x3 > x1) && (x2 > x1)) {
                //Realiza as seguintes operações, guardando seus resultados nas variaveis "s","p" e "m"
                s = x1 + x2 + x3;
                p = x1 * x2 * 3;
                m = (x1 + x2 + x3) / 3;
                
                System.out.println("Soma: " + s);
                System.out.println("Produto: " + p);
                System.out.println("Media: " + m);
            } else {
                
                System.out.println("INVALIDO");
                break;
            }

        }

    }

}

