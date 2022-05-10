/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evenoddlinklist;

public class EvenOddLinkList 
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
public static ListNode oddEvenList(ListNode head)
{
    if(head==null || head.next==null)
    {
        return head;
    }
    ListNode oddHead=head;
    ListNode evenStart=head.next;
    ListNode evenHead=head.next;
    
    while(evenHead!=null)
    {
        oddHead.next=evenHead.next;
        if(oddHead.next!=null)
        {
            oddHead=oddHead.next;
        }
        evenHead.next=oddHead.next;
        evenHead=evenHead.next;
    }
    oddHead.next=evenStart;
    return head;
}
static void printlist(ListNode node)
{
    while(node!=null)
    {
        System.out.print(node.data+"->");
        node=node.next;
    }
    System.out.println("Null");
}
    public static void main(String[] args) 
    {
       //EvenOddLinkList ob=new EvenOddLinkList();
       ListNode head=new ListNode(1);
       head.next=new ListNode(2);
       head.next.next=new ListNode(3);
       head.next.next.next=new ListNode(4);
       head.next.next.next.next=new ListNode(5);
              
        System.out.println("Show linked list");
        printlist(head);
        head=oddEvenList(head);
        
        System.out.println("Show Even Odd Modified linked list");
        printlist(head);
                      
    }
    
}
