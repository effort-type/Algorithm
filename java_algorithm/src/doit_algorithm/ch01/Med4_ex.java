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
public class Med4_ex {

    /**
         * @param args the command line arguments
         */
    
    static int med(int a, int b, int c) {
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
        
//        System.out.print("a의 값 : ");        
//        int a = sc.nextInt();
//        
//        System.out.print("b의 값 : ");        
//        int b = sc.nextInt();
//        
//        System.out.print("c의 값 : ");        
//        int c = sc.nextInt();
        
        System.out.println("med(3,2,1) =  " + med(3, 2, 1)); // [A] a > b > c
        System.out.println("med(3,2,2) =  " + med(3, 2, 2)); // [B] a > b = c
        System.out.println("med(3,1,2) =  " + med(3, 1, 2)); // [C] a > c > b
        System.out.println("med(3,2,3) =  " + med(3, 2, 3)); // [D] a = c > b
        System.out.println("med(2,1,3) =  " + med(2, 1, 3)); // [E] c > a > b
        System.out.println("med(3,3,2) =  " + med(3, 3, 2)); // [F] a = b > c
        System.out.println("med(3,3,3) =  " + med(3, 3, 3)); // [G] a = b = c
        System.out.println("med(2,2,3) =  " + med(2, 2, 3)); // [H] c > a = b
        System.out.println("med(2,3,1) =  " + med(2, 3, 1)); // [I] b > a > c
        System.out.println("med(2,3,2) =  " + med(2, 3, 2)); // [J] b > a = c
        System.out.println("med(1,3,2) =  " + med(1, 3, 2)); // [K] b > c > a
        System.out.println("med(2,3,3) =  " + med(2, 3, 3)); // [L] b = c > a
        System.out.println("med(1,2,3) =  " + med(1, 2, 3)); // [M] c > b > a
        
    }
    
}
