/*
 * med 메소드보다 NewMed 메소드가 비효율적인 이유 : 불필요한 비교횟수가 있기때문에 비교횟수가 늘어나기 때문이다.
 * med 메소드 비교횟수 : 13
 * NewMed 메소드 비교횟수 : 14
 */
package doit_algorithm.ch01;

/**
 *
 * @author Minsu <wjdalstn1450@naver.com>
 */
public class Med5_ex {

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
    
    static int NewMed(int a, int b, int c) {
        if((b >= a && c <= a) || (b <= a && c >= a))
            return a;
        else if((a >b && c < b) || (a < b && c > b))
            return b;
        return c;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
