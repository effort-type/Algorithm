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
public class Median {

    /**
     * @param args the command line arguments
     */
    
    static int med3(int a, int b, int c) {
        if(a >= b)
        {
            if(b >= c)
                return b;
            else if(a <= c)
                return a;
            else
                return c;
        }
        else if(a > c)
            return a;
        else if(b > c)
            return c;
        else
            return b;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("세 정수의 중앙값을 구합니다.");
        
        System.out.print("a의 값 : ");        
        int a = sc.nextInt();
        
        System.out.print("b의 값 : ");        
        int b = sc.nextInt();
        
        System.out.print("c의 값 : ");        
        int c = sc.nextInt();
        
        System.out.println("중앙값은 " + med3(a, b, c) + "입니다.");
    }
    
}
