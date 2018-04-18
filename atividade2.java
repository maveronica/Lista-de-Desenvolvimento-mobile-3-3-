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
public class atividade2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 9; i++) {
            for (int n = 0; n <= 9; n++) {
                System.out.println(i + "x" + n + "=" + i * n);
            }
        }

    }
}
