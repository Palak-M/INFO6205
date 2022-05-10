/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package removeallelementsfromlist;

/**
 *
 * @author palak
 */
public class RemoveAllElementsFromList {

    static Node head;
    
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    
    void deleteElement(int num)
    {
        Node k=head;
        Node prev=null;
        
        while(k!=null && k.val==num)
        {
            head=k.next;
            k=head;
        }
        while(k!=null)
        {
            while(k!=null && k.val!=num)
            {
                prev=k;
                k=k.next;
            }
            if(k==null)
                return;
            
            prev.next=k.next;
            k=prev.next;
        }
    }
    
    public void insertNode(int n)
    {
        Node new_n=new Node(n);
        new_n.next=head;
        head=new_n;
    }
    
    public void display()
    {
        Node q=head;
        while(q!=null)
        {
            System.out.print(q.val+" ");
            q=q.next;
        }
    }
    
    public static void main(String[] args) {
        RemoveAllElementsFromList list=new RemoveAllElementsFromList();
        list.insertNode(2);
        list.insertNode(4);
        list.insertNode(7);
        list.insertNode(1);
        list.insertNode(3);
        list.insertNode(3);
        
        int element=3;
        System.out.println("Display Linked List: ");
        list.display();
        list.deleteElement(element);
        System.out.println("\nDisplay Linked List after deletion: ");
        list.display();
    }
    
}
