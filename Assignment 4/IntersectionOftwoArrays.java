/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intersectionoftwoarrays;

import java.util.Arrays;


public class IntersectionOftwoArrays {

    static void intersectionOfArrays(int a[], int b[],int q, int r)
    {
        int i=0;
        int j=0;
        while(i<q && j<r)
        {
            if(a[i] > b[j]){
                j++;
            }
            else if(a[i] < b[j]){
                i++;
            }
            else{
                System.out.print(a[i]+ " ");
                i++;
                j++;
            }
        }
    }
    
    public static void main(String[] args) {
        int a[]={6,3,5,6,7};
        int b[]={6,4,1,3};
        
        int q = a.length;
        int r = b.length;
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        intersectionOfArrays(a,b,q,r);
    }
}
