/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deletennodesaftermnodes;
/**
 *
 * @author palak
 */
public class DeleteNnodesAfterMnodes {

    static class Node{
        int val;
        Node next;
    };
    
    static Node insertNode(Node k,int new_n)
    {
        Node node=new Node();
        node.val=new_n;
        node.next=(k);
        (k)=node;
        return k;
    }
    
    static void display(Node head){
        Node q=head;
        while(q!=null)
        {
            System.out.printf("%d ",q.val);
            q=q.next;
        }
        System.out.printf("\n");
    }
    
    static void retainMdeleteN(Node head,int M,int N)
    {
        Node cur=head,a;
        int ctr;
        while(cur!=null)
        {
            for(ctr=1;ctr<M && cur!=null;ctr++)
                cur=cur.next;
            if(cur==null)
                return;
            a=cur.next;
            for(ctr=1;ctr<=N && a!=null;ctr++)
            {
                Node q=a;
                a=a.next;
            }
            cur.next=a;
            cur=a;
        }
    }
    
    public static void main(String[] args) {
       Node head=null;
       int M=3,N=1;
       head=insertNode(head,2);
       head=insertNode(head,3);
       head=insertNode(head,4);
       head=insertNode(head,5);
       head=insertNode(head,6);
       head=insertNode(head,7);
       head=insertNode(head,1);
       head=insertNode(head,11);
       System.out.printf("M= %d, N= %d \nDisplay"+"Linked List:\n",M,N);
       display(head);
       retainMdeleteN(head,M,N);
       System.out.printf("\n Display Linked List after deletion:\n");
       display(head);
       
    }
    
}
