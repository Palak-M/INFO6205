/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementationdoublelinkedlist;

public class ImplementationDoubleLinkedList {
    static Node head;
    
    public class Node{
        int data;
        Node next, prev;
        Node(int data)
        {
            this.data=data;
        }
    }
    
    public Node push(int data)
    {
        Node newNode=new Node(data);
        newNode.next=head;
        newNode.prev=null;
        if(head!=null)
            head.prev=newNode;
            
        head=newNode;
        return head;
        
    }
    
    void append(int newData)
    {
        Node newNode=new Node(newData);
        Node last=head;
        newNode.next=null;
        if(head==null)
        {
            newNode.prev=null;
            head=newNode;
            return;
        }
        while(last.next!=null)
            last=last.next;
        
        last.next=newNode;
        newNode.prev=last;
    }
    
    static int sizeOfLinkedList(Node node)
    {
        int k=0;
        while(node!=null)
        {
            k++;
            node=node.next;
        }
        return k;
    }
    
    public void printlist(Node node)
    {
        Node last=null;
        while(node!=null)
        {
            System.out.print(node.data+"->");
            last=node;
            node=node.next;
        }
        System.out.println("Null");
    }
    
    public static void main(String[] args) {
        ImplementationDoubleLinkedList list=new ImplementationDoubleLinkedList();
        list.append(1);
        list.push(2);
        list.push(3);
        list.push(5);
        list.append(4);
        System.out.println("Display Linked List: ");
        list.printlist(list.head);
        System.out.println("\nSize of Double Linked List is: "+sizeOfLinkedList(head));
    }
    
}
