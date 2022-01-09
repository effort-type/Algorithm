/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doit_algorithm.ch01;

import java.util.Scanner;

/**
 *
 * @author Minsu <wjdalstn1450@naver.com>
 */
public class SumWhileEx_01_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n의 값 : ");
        int n = sc.nextInt();
        
        int sum = 0;
        int i = 1;
        
        while(i <= n) {
            sum += i;
            i++;
        }
        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
        System.out.println("while문 종료 후 i의 값은 " + i + "입니다.");
    }
    
}
