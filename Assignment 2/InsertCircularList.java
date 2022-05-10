/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertcircularlist;

/**
 *
 * @author palak
 */
public class InsertCircularList 
{
     Node head;
public static class Node
{
        int data;
        Node next;
        
        Node(int data){
        this.data=data;
    }
}
    public Node insert(Node head, int insertValue)
    {
        Node newNode=new Node(insertValue);
        if(head==null)
        {
            head=newNode;
            head.next=head;
            return head;
        }
        else if(head.next==head)
        {
            if(head.data>insertValue)
            {
                newNode.next=head;
                head.next=newNode;
                head=newNode;
            }
            else
            {
                head.next=newNode;
                newNode.next=head;
            }
            return head;
        }
        else
        {
            Node cur=head.next;
            Node pre=head;
            while(cur.data>=pre.data && cur!=head)
            {
                pre=cur;
                cur=cur.next;
            }
            if((cur==head && (cur.data==pre.data || cur.data>insertValue))|| insertValue<cur.data || insertValue>pre.data)
            {
                pre.next=newNode;
                newNode.next=cur;
                return head;
            }
            
            Node originalHead=cur;
            pre=originalHead;
            cur=originalHead.next;
            while(true)
            {
                //System.out.println(pre.data+" "+ cur.data);
                if(pre.data<=insertValue && cur.data>=insertValue)
                {
                    pre.next=newNode;
                    newNode.next=cur;
                    break;
                }
                pre=cur;
                cur=cur.next;
            }
            return head;
        }
    }
    public void printList(Node head)
    {
        if(head==null)
        {
            return;
        }
        System.out.print(head.data+"->");
        Node cur=head.next;
        while(cur!=head)
        {
        System.out.print(cur.data+"->");
        cur=cur.next;
        }
        System.out.println("HEAD");
    }
    public static void main(String[] args) 
    {
        // TODO code application logic here
        InsertCircularList ob=new InsertCircularList();
        ob.head=new Node(1);
        ob.head.next=new Node(2);
        ob.head.next.next=new Node(3);
        ob.head.next.next.next=new Node(5);
        ob.head.next.next.next.next=ob.head;
        System.out.println("Print Circular Linked list: ");
        ob.printList(ob.head);
    
        ob.insert(ob.head.next,4);
    
        System.out.println("Print Linked list after inserting the node: ");
        ob.printList(ob.head);
    }
    
}
