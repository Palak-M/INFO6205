/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nthsmallest;
import java.util.Arrays;

public class NthSmallest {

    public static int nthSmallestInteger(int a[], int n){
        Arrays.sort(a);
        return a[n-1];
    }
   
    
    public static void main(String[] args) {
        int a[]=new int[]{4,8,7,9,2};
        int n=3;
        System.out.println("nth Smallest element in the Array is "+ nthSmallestInteger(a,n));
    }
    
}
