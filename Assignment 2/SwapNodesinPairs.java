/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swapnodesinpairs;

class SwapNodesinPairs 
{
    Node head;
public static class Node
{
    int data;
    Node next;
    
    Node(int data)
    {
        this.data=data;
    }
}

void swapPair()
{
    Node temp=head;
    while(temp!=null && temp.next!=null) //Traverse only till there are atleast 2 nodes left
    {
        int i=temp.data;
        temp.data=temp.next.data;
        temp.next.data=i;
        temp=temp.next.next;
     }
}
void printList()
{
    Node temp=head;
    while(temp!=null)
    {
        System.out.print(" "+temp.data);
        temp=temp.next;
     }
    System.out.println();
}

public static void main(String[] args) 
{
    SwapNodesinPairs ob=new SwapNodesinPairs();
    ob.head=new Node(1);
    ob.head.next=new Node(2);
    ob.head.next.next=new Node(3);
    ob.head.next.next.next=new Node(4);
    ob.head.next.next.next.next=new Node(5);
    ob.head.next.next.next.next.next=new Node(6);
    ob.head.next.next.next.next.next.next=new Node(7);
    ob.head.next.next.next.next.next.next.next=new Node(10);
    System.out.println("Print Linked list before swapping the nodes: ");
    ob.printList();
    
    ob.swapPair();
    
    System.out.println("Print Linked list after swapping the nodes: ");
    ob.printList();
    
    
}   
    
}
