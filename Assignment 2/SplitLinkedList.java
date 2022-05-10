/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package splitlinkedlist;

public class SplitLinkedList 
{
    ListNode head;
public static class ListNode
{
    int data;
    ListNode next;
    ListNode(int data)
    {
        this.data=data;
    }
}

public ListNode[] splitList(ListNode root, int k)
{
    ListNode cur=root;
    int n=0;
    while(cur!=null)
    {
        cur=cur.next;
        n++;
    }
    int width=n/k, rem=n%k;
    
    ListNode[] ans=new ListNode[k];
    cur=root;
    for(int i=0;i<k;++i)
    {
        ListNode head1=new ListNode(-1);
        ListNode curSplit=head1;
        for(int j=0;j<width;++j)
        {
            curSplit.next=cur;
            curSplit=curSplit.next;
            cur=cur.next;
        }
        if(rem>0)
        {
            curSplit.next=cur;
            curSplit=curSplit.next;
            cur=cur.next;
            --rem;
        }
        curSplit.next=null;
        ans[i]=head1.next;
    }
    return ans;
}

public void printlist(ListNode head)
{
    ListNode cur=head;
    while(cur!=null)
    {
        System.out.print(cur.data+"->");
        cur=cur.next;
    }
    System.out.println("Null");
}
    public static void main(String[] args) 
    {
     SplitLinkedList ob=new SplitLinkedList();
     ob.head=new ListNode(1);   
     ob.head.next=new ListNode(2);
     ob.head.next.next=new ListNode(3);
     ob.head.next.next.next=new ListNode(4);
     ob.head.next.next.next.next=new ListNode(5);
     
     System.out.println("Show linked list before splitting");
     ob.printlist(ob.head);
     
     int div=2;
     
     System.out.println("Show linked list after splitting into "+div+" parts");
     ListNode[] parts=ob.splitList(ob.head, div);
     
     for(ListNode ln:parts)
        {
         ob.printlist(ln);
        }
    }
    
}
