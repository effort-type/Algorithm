/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doit_algorithm.ch01;

import java.util.Scanner;

/**
 *
 * @author Minsu<wjdalstn1450@naver.com>
 */
public class Max3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("세 정수의 최댓값을 구합니다.");
        System.out.print("a의 값 : ");
        int a = sc.nextInt();
        System.out.print("b의 값 : ");
        int b = sc.nextInt();
        System.out.print("c의 값 : ");
        int c = sc.nextInt();
        
        int max = a;
        if(b > max)
            max = b;
        if(c > max)
            max = c;
        
        System.out.println("최댓값은 " + max + "입니다.");
    }
    
}
