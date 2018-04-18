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
public class atividade10 {

    public static void main(String[] args) {
        int i;
        int numDiv = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero:");
        i = sc.nextInt();
        while (i > 0) {
            for (int y = 1; y <= i; y++) {
                if (i % y == 0) {
                    numDiv++;

                }
                if (numDiv == 2) {
                    System.out.println("Os números primos são:" + i);
                }
            }
            numDiv = 0;
            i--;
        }

    }

}
