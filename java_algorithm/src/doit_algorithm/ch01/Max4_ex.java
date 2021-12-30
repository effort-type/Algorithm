/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doit_algorithm.ch01;

// 네 값의 최댓값을 구하는 max4 메서드를 작성하세요.

/**
 *
 * @author Minsu <wjdalstn1450@naver.com>
 */
public class Max4_ex {

    /**
     * @param args the command line arguments
     */
    
    static int max4(int a, int b, int c, int d) {
        int max = a; // 최댓값 저장
        
        if(b > max)
            max = b;
        if(c > max)
            max = c;
        if(d > max)
            max = d;
        
        return max;
    }
    
    public static void main(String[] args) {
        System.out.print(max4(5,2,3,4));
    }
    
}
