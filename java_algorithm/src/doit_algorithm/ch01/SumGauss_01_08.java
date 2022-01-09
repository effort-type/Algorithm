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
public class SumGauss_01_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.println("n의 값 : ");
        int n = sc.nextInt();
        
        int sum = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0); // 책 해답, 짝수일 때 0을 더해주고 홀수일 때 가운데 수를 더해준다.
        
        
//        // 내 풀이
//        int temp = (n / 2) + 1;
//        
//        for(int i = 0; i < (n / 2); i++) {
//            // 1.  n이 짝수일 경우
//            sum += (i + 1) + (n - i);
//        }
//        
//        // 2. n이 홀수일 경우
//        if(n % 2 != 0)
//            sum += temp;
        
        System.out.println(sum);
        
    }
    
}
