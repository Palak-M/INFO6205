/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort_adjacentintegers;

public class Sort_AdjacentIntegers {

    static void adjacentColors(int a[],int a_size){
    int low=0;
    int mid=0;
    int high=a_size-1;
    int temp=0;
    while(mid<=high){
        switch(a[mid]){
            case 0: {
                temp=a[low];
                a[low]=a[mid];
                a[mid]=temp;
                low++;
                mid++;
                break;
            }
            case 1:{
                mid++;
                break;
            }
            case 2:{
                temp=a[mid];
                a[mid]=a[high];
                a[high]=temp;
                high--;
                break;
            }
        }
    }
}
    
    static void printlist(int a[],int a_size)
    {
        for(int i=0; i<a_size;i++)
            System.out.print(a[i]+ " ");
        System.out.println("");
    }
    
    public static void main(String[] args) {
        int a[]={2,1,0,0,1,2,0,2,2,1,1};
        int a_size=a.length;
        adjacentColors(a,a_size);
        System.out.println("Display Sorted Array with Adjacent Integers");
        printlist(a,a_size);
        
    }
    
}
