/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista3;

import java.util.Scanner;

public class atividade5 {

    public void main(String[] args) {

        int num, par = 0, impar = 0, soma = 0;

        Scanner sc = new Scanner(System.in);
        while (soma <= 1000) {
            num = sc.nextInt();
            soma = soma + num;

            if (num % 2 == 0) {
                par = par + num;

            } else {
                impar = impar + num;
            }

            System.out.println("A soma dos pares são: " + par);
            System.out.println("A soma dos ímpares são: " + impar);
        }
    }
}
