/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.lenovo.mathutil.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author LENOVO
 */
public class MathUtilityTest {
    //Cau truc TC: ID | Desc | Steps/Procedures | Expected Result | Status 
    //Steps:
    // 1. Given n=0
    // 2. Call/invoke getFactorial(n=0)
    //Expected Result:
    // the method must return 1 as the result of 0;
    //Status: PASSED | FAILED doan xem, cho code xong, chay moi biet duoc
   @Test
    public void verifyFactorialGivenRightArgument0ReturnsOk(){
       assertEquals(1, MathUtility.getFactorial(0));
}
    //Test case 2:
    @Test
    public void verifyFactorialGivenRightArgument1ReturnsOk(){
       assertEquals(1, MathUtility.getFactorial(1));
}
    //Test case 3:
    @Test
    public void verifyFactorialGivenRightArgument3ReturnsOk(){
       assertEquals(120, MathUtility.getFactorial(5));
}
}
