/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doit_algorithm.ch01;

/**
 *
 * @author Minsu <jminsu084@gmail.com>
 */
public class Ex01_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("  | ");
        for(int i = 1; i <= 9; i++) {
            System.out.printf(" %2d", i);
        }
        
        System.out.println();
        System.out.println("---+---------------------------");
        
        for(int i = 1; i <= 9; i++) {
            System.out.printf("%d | ", i);
            for(int j = 1; j <= 9; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
    }
    
}
