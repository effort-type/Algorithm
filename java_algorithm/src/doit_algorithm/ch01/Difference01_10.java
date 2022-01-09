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
public class Difference01_10 {

    /**
     * @param args the command line arguments
     */
    
    
    static int Difference(int a, int b) {
        int min = a;
        int big = b;
        
        if(min > b) {
            min = b;
            big = a;
        }            
        
        int diiference = big - min;
        
        return diiference;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        
        int b;
        System.out.print("a의 값 : ");
        int a = sc.nextInt();
                
        
        do {           
            System.out.print("b의 값 : ");
            b = sc.nextInt();      
            if(b - a <= 0)
                System.out.println("a보다 큰 값을 입력하세요!");
        } while(b <= a);
        
        System.out.println("b - a는 " + Difference(a, b) + "입니다.");
    }
    
}
