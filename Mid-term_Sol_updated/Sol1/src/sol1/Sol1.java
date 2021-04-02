/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sol1;

/**
 *
 * @author palak
 */
//Time Complexity:O(n)
//Space Compexity:O(1)
public class Sol1 {

    ListNode head;
    
    public boolean areConverging(ListNode n1, ListNode n2){
        int arr1=size(n1);
        int arr2=size(n2);
        int difference=Math.abs(arr1-arr2);
        if(arr1>arr2){
            for(int i=0; i<difference; i++){
                n1=n1.next;
            }
    }
        else if(arr2>arr1){
            for(int i=0;i<difference; i++){
                n2=n2.next;
            }
        }
        while(n1 != null && n2 !=null && n1.val != n2.val){
            n1=n1.next;
            n2=n2.next;
        }
        if(n1 == null){
            return false;
        }
        if(n1.val==n2.val){
            return true;
        }
        return false;
    }
    
    public int size(ListNode head){
        int size=0;
        ListNode cur=head;
        while(cur != null){
            cur=cur.next;
            ++size;
        }
        return size;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Sol1 ll_1=new Sol1();
        ll_1.head=new ListNode(1);
        ll_1.head.next=new ListNode(5);
        ll_1.head.next.next=new ListNode(10);
        ll_1.head.next.next.next=new ListNode(15);
        ll_1.head.next.next.next.next=new ListNode(20);
        
        Sol1 ll_2= new Sol1();
        ll_2.head=new ListNode(11);
        ll_2.head.next=new ListNode(2);
        ll_2.head.next.next=new ListNode(22);

        System.out.println("Check if the 2 linkedlists are converging: "+ ll_1.areConverging(ll_1.head, ll_2.head));
    }
    
}
