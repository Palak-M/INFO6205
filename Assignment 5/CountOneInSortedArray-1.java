public class CountOneInSortedArray {

   static int countOnesInTheSortedArray(int[] a, int left, int right)
    {
        if(right>=left){
            int mid= left + (right-left)/2;
            if((mid==right || a[mid+1]==0) && (a[mid]==1))
                return mid+1;
            if(a[mid]==1)
                return countOnesInTheSortedArray(a,(mid+1),right);
            return countOnesInTheSortedArray(a,left,(mid-1));
        }
        return 0;
    }
    
    public static void main(String[] args) {
        
    int[] a={1,1,1,1,0,0};
    System.out.println("The count of 1's present in the sorted(descending order) array is: "
            +countOnesInTheSortedArray(a,0,a.length - 1));
    }
    
}
