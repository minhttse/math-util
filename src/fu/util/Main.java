/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fu.util;

/**
 *
 * @author minhv
 */
public class Main {
    public static void main(String[] args) {
        // ta test thu ham cua ta
        // dung mat de so sanh ket qua thuc te khi chay va ket qua ta mong doi
        long expected =120; //ta mong nhan 120 neu goi ham 5!
        long actual= MathUtility.getFactorial(5);
        System.out.println("5!: Expected: "+expected+"; Actual: "+actual);
        
        //expected 720 neu 6!
        System.out.println("6!: "+MathUtility.getFactorial(6));
        
        //expected 1 neu 0!
        System.out.println("0!: "+MathUtility.getFactorial(0));
        
        //excepted: IllegalArgumentException if tinh -5;
        System.out.println("-5!: "+MathUtility.getFactorial(-5));
        
        //in thu PI coi co giong Math.PI hem
        System.out.println("PI: "+MathUtility.PI);
    }
}
