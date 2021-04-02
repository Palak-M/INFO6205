/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sol4;

/**
 *
 * @author palak
 */
//Time Complexity:O(log n)
//Space Compexity:O(log n)
public class Sol4 {

    public static int firstOccurence(int a[],int low, int high, int x, int n){
        if(high >= low){
            int mid= low +(high - low)/2;
            if((mid ==0 || x>a[mid -1]) && a[mid] == x)
                return mid;
            else if(x>a[mid])
                return firstOccurence(a,(mid+1),high,x,n);
            else
                return firstOccurence(a,low,(mid-1),x,n);
        }
        return -1;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int a[]={2,4,4,4,6,7,7,7,8,9,9,9};
        int n=a.length;
        int x=7;
        System.out.println("First Occurence= "+firstOccurence(a,0,n-1,x,n));
    }
    
}
