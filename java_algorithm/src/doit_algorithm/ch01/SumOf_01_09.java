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
public class SumOf_01_09 {

    /**
     * @param args the command line arguments
     */
    
    static int SumOf(int a, int b) {
        int sum = 0;
        
        if(a < b)
            sum = ((a + b) % 2 == 0 ? (a + b) * ((b - a) / 2) + (a + b) / 2 : (a + b) * ((b - a + 1) / 2));
        else if(a == b)
            sum = a;
        else if(a > b)
            sum = ((a + b) % 2 == 0 ? (a + b) * ((a - b) / 2) + (a + b) / 2 : (a + b) * ((a - b + 1) / 2));       
        
        return sum;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.print("a를 입력하시오 : ");
        int a = sc.nextInt();
        System.out.print("b를 입력하시오 : ");
        int b = sc.nextInt();
        
        System.out.println(a + "부터 " + b + "까지의 합은 " + SumOf(a, b) + "입니다.");        
        
    }
    
}
