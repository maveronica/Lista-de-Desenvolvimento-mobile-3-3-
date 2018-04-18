
package lista3;

import java.util.Scanner;


public class atividade3 {
    public static void main (String [] args){
        int soma=0;
        int j=1;
        Scanner sc = new Scanner (System.in);
        
        for (int i=1; i<=99; i=i+2){
            System.out.println(i + "/"+j);
            soma =( i /j) +soma;
            j++;
        }
        
        System.out.println("O valor da soma é:"+soma);
}
}