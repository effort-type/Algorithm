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
public class DigitsNum_01_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n;
        
        // n의 값이 양의 정수를 입력받게 하기 위함
        do {
            System.out.print("n의 값 : ");
            n = sc.nextInt();
        } while(n <= 0);
        
        int co = 1; // n의 값은 양의 정수이기 때문에 최소 한 자릿수이므로 초깃값 1로 초기화
        while(n > 1) {
            n = n / 10; // 1보다 작아질 때까지 나눈 횟수가 자릿수
            co++;
        }
        
        System.out.println("그 수는 " + co + "자리입니다.");        
    }    
}
