/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swapkthnodebeginandend;

/**
 *
 * @author palak
 */
public class SwapKthnodeBeginAndEnd {

    Node head;
    
    class Node
    {
        int val;
        Node next;
        Node (int val){
            this.val=val;
        }
    }
    
    void begin(int new_val)
    {
        Node n=new Node(new_val);
        n.next=head;
        head=n;
    }
    
    void printlist()
    {
        Node node=head;
        while(node!=null){
            System.out.print(node.val+" ");
            node=node.next;
        }
        System.out.println(" ");
    }
    
    int calculateLength()
    {
        int len=0;
        Node k=head;
        while(k!=null)
        {
            len++;
            k=k.next;
        }
        return len;
    }
    
    void swapKthNode(int t)
    {
        int countNodes=calculateLength();
        if(countNodes<t)
            return;
        
        if(2*t-1==countNodes)
            return;
        
        Node st=head;
        Node st_prev=null;
        for(int i=1;i<t;i++){
            st_prev=st;
            st=st.next;
        }
        
        Node lt=head;
        Node lt_prev=null;
        for(int i=1;i<countNodes-t+1;i++){
            lt_prev=lt;
            lt=lt.next;
        }
        
        if(st_prev!=null)
            st_prev.next=lt;
        
        if(lt_prev!=null)
            lt_prev.next=st;
        
        Node temp=st.next;
        st.next=lt.next;
        lt.next=temp;
        if(t==1)
            head=lt;
        if(t==countNodes)
            head=st;
    }
    
    public static void main(String[] args) {
        SwapKthnodeBeginAndEnd list=new SwapKthnodeBeginAndEnd();
        for(int i=5;i>=1;i--)
            list.begin(i);
            System.out.print("Show Original Linked List: ");
            list.printlist();
            System.out.println(" ");
                
            list.swapKthNode(4);
            System.out.println("Modified Linked List when k = 4");
            list.printlist();
            System.out.println(" ");
    }  
}
