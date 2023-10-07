/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lenovo.mathutil.main;

import com.lenovo.mathutil.core.MathUtility;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        //test thu ham minh vua viet co dung k
        //cb bo data test, test case
        //#Test Case #1: Check if getFactorials() runs
        // well with n=0
        //Test Procedures:
        // Given n=0
        //Invoke getFactorial(n=0)
        //Test Procedures/Steps:
        // Given n=0
        // Invoke getFactorial(n=0)
        //Expected Result: 1; //0! == 1???
        
        long expected = 1;// em hy vong 1 dc tra ve
        int n=0;           // neu anh dua vao 0;
        long actual = MathUtility.getFactorial(0);   //chay ham moi biet
        
        //in ra va tu ket luan co giong ki vong hay k
        System.out.println(n+"! | expected = "+expected+
                               "| actual = "+actual);
        
        
        //#Test Case #2: Check if getFactorials() runs
        // well with n=1
        //Test Procedures:
        // Given n=1
        //Invoke getFactorial(n=1)
        //Test Procedures/Steps:
        // Given n=1
        // Invoke getFactorial(n=1)
        //Expected Result: 1; //0! == 1???
         System.out.println("1! | expected = 1"+
                               "| actual = "+MathUtility.getFactorial(1));
        
    }
}
