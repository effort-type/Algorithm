/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doit_algorithm.ch01;
// 세 값의 최솟값을 구하는 min3 메서드를 작성하세요.

/**
 *
 * @author Minsu <wjdalstn1450@naver.com>
 */
public class Min3_ex {

    /**
     * @param args the command line arguments
     */
    static int min3(int a, int b, int c) {
        int min = a;
        if(b < min)
            min = b;
        if(c < min)
            min = c;
        
        return min;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print(min3(3, 2, 1));
    }
    
}
