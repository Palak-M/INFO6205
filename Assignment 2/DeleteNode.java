/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deletenode;
        
public class DeleteNode 
{
    Node list;
    public static class Node
    {
        int val;
        Node next;
        Node(int val)
        {
            this.val=val;
        }
    }
        
    public void deleteNode(Node node)
    {
    node.val=node.next.val;
    node.next=node.next.next;
    }
    
    public void printlist()
    {
        Node node=list;
        while(node!=null)
        {
            System.out.print(node.val+"->");
            node=node.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) 
    {
        DeleteNode ob=new DeleteNode();
        ob.list=new Node(1);
        ob.list.next=new Node(2);
        ob.list.next.next=new Node(3);
        ob.list.next.next.next=new Node(4);
        ob.list.next.next.next.next=new Node(5);
        System.out.println("Show LinkedList before deleting the node");
        ob.printlist();
        ob.deleteNode(ob.list.next.next);
        System.out.println("\nShow LinkedList after deleting the node");
        ob.printlist();
        
    }
    
}
