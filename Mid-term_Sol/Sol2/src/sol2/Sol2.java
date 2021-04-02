/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sol2;

/**
 *
 * @author palak
 */

//Time Complexity:O(n)
//Space Compexity:O(n)

public class Sol2 {

    ListNode root;
    
    void printLeaves(ListNode node){
        if (node == null)
            return;
        printLeaves(node.right);
        
        if(node.left==null && node.right ==null)
            System.out.println(node.val+"");
        printLeaves(node.left);
    }
    
    void printLeftBoundary(ListNode node){
        if(node == null)
            return;
        if(node.left != null){
            printLeftBoundary(node.left);
            System.out.println(node.val+"");
        }
        else if(node.right!=null){
            printLeftBoundary(node.right);
            System.out.println(node.val+"");
        }
    }
    
    void printRightBoundary(ListNode node){
        if(node == null)
            return;
        if(node.right != null){
            printRightBoundary(node.right);
            System.out.println(node.val+"");
        }
        else if(node.left!=null){
            printRightBoundary(node.left);
            System.out.println(node.val+"");
        }
    }
    void printBoundary(ListNode node){
        if(node == null)
            return;
        System.out.println(node.val+"");
        printRightBoundary(node.right);
        printLeaves(node.right);
        printLeaves(node.left);
        printLeftBoundary(node.left);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Sol2 head=new Sol2();
        head.root=new ListNode(1);
        head.root.left=new ListNode(2);
        head.root.left.left=new ListNode(3);
        head.root.left.right=new ListNode(4);
        head.root.left.right.left=new ListNode(5);
        head.root.left.right.right=new ListNode(6);
        head.root.right=new ListNode(7);
        head.root.right.right=new ListNode(8);
        head.printBoundary(head.root);
    }
    
}
