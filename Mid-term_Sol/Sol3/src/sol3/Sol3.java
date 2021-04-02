/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sol3;

/**
 *
 * @author palak
 */
//Time Complexity:O(n)
//Space Compexity:O(1)
public class Sol3 {

    static int getMaxConsecutiveOnes(int nums[],int n){
        int ans=0;
        int cnt=0;
        
        for(int i=0; i<n; i++){
            if(nums[i]==0)
                cnt=0;
            else{
                cnt++;
                ans=Math.max(ans,cnt);
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int nums[]={0,1,0,1,1,0,1,1,1,0,0,0};
        int l=nums.length;
        System.out.println("Maximum no. of consecutive 1's in the array: "+getMaxConsecutiveOnes(nums,l));
    }
    
}

