/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergelinkedlists;

public class MergeLinkedLists {
     Node head;
    
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    
    public static Node mergeInLinkedList(Node n1,int i,int j, Node n2)
    {
        Node list1BeforeDelete=n1;
        Node list1AfterDelete=n1;
        int t=0;
        Node cur=n1;
        while(cur!=null)
        {
            if(t == i - 1)
            {
                list1BeforeDelete = cur;
            }
            else if(t == j + 1)
            {
                list1AfterDelete = cur;
                break;
            }
            ++t;
            cur=cur.next;
        }
        Node list2node=n2;
        while(list2node.next != null)
        {
            list2node=list2node.next;
        }
        list1BeforeDelete.next=n2;
        list2node.next=list1AfterDelete;
        return n1;
    }
    
    public void printlist()
    {
        Node cur=head;
        while(cur!=null)
        {
            System.out.print(cur.val + "->");
            cur=cur.next;
        } 
        System.out.println("Null");
    }
    
    public static void main(String[] args) {
        MergeLinkedLists list1=new MergeLinkedLists();
        list1.head=new Node(1);
        list1.head.next=new Node(2);
        list1.head.next.next=new Node(3);
        list1.head.next.next.next=new Node(4);
        list1.head.next.next.next.next=new Node(5);
        list1.head.next.next.next.next.next=new Node(11);
        
        System.out.println("Show Linked List 1: ");
        list1.printlist();
        
        MergeLinkedLists list2=new MergeLinkedLists();
        list2.head=new Node(6);
        list2.head.next=new Node(7);
        list2.head.next.next=new Node(8);
        list2.head.next.next.next=new Node(9);
        list2.head.next.next.next.next=new Node(10);
        
        System.out.println("\nShow Linked List 2: ");
        list2.printlist();
        
        int i=2;
        int j=3;
        
        list1.head=mergeInLinkedList(list1.head,i,j,list2.head);
        System.out.println("\nShow Merge in between Linked List after removing list1's nodes from ith to jth node and placing list2's node in their place: ");
        list1.printlist();
        
    }
    
}
