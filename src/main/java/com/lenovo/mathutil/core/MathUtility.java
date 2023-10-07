/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lenovo.mathutil.core;

/**
 *
 * @author LENOVO
 */
//Day la bo thu vien chua cac ham dung trong tinh toan
//toan hoc, clone giong clas sMath ben jDK
//Khi goi la thu vien dung chung ma k can nho nhung
//gi sau khi xu li -> thu vien chua do STATIC
public class MathUtility {
    public static final double PI=3.1415;
    
    //ham tinh n!=1.2.3....n
    //n<0 n>20 k tinh do 21! tran kieu long
    //k tinh giai thua am!!!
    //0! = 1! = 1
    public static long getFactorial(int n){
        long result =1;
        if(n<0 || n>20)
            throw new IllegalArgumentException("Invalid n. n must be between 0..20");
        
        if(n==0 || n==1)
            return 1;
        
        for (int i = 2; i <= n; i++) 
            result *=i;
            
            return result;
        
    }
    
}
