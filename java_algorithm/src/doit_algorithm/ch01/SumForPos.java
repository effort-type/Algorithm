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
public class SumForPos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.println("1부터 n까지의 합을 구합니다.");
        
        do {
            System.out.print("n의 값 : ");
            n = sc.nextInt();
        } while(n <= 0); // n이 0보다 클 때까지 반복 입력 받는다. do-while은 무조건 한번 실행한다.
        
        int sum = 0; // 합
        
        for(int i = 0; i <= n; i++)
            sum += i;
        
        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
    }
    
}
