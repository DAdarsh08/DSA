package Tree;

import java.util.Scanner;

public class BinaryTree {
   public BinaryTree()
    {

    }
    private Node root;
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public void  populate(Scanner scanner)
    {
        System.out.println("enter the root node");
        int value=scanner.nextInt();
         root=new Node(value);
         populate(scanner,root);


    }

    private void populate(Scanner scanner, Node node) {
        System.out.println("do you want to enter left of the node"+node.val);
        boolean left= scanner.nextBoolean();
        if(left)
        {
            System.out.println("enter the value of left of: "+node.val);
            int val=scanner.nextInt();
            node.left=new Node(val);
            populate(scanner,node.left);
        }
        System.out.println("do you want to enter right of the node"+node.val);
        boolean right= scanner.nextBoolean();
        if (right) {
            int val = scanner.nextInt();
            node.right = new Node(val);
            populate(scanner, node.right);
        }
    }
    public void display()
    {
        isDisplay(this.root,"");
    }
    private void isDisplay(Node node, String indent)
    {
        if(node==null)
        {
            return;
        }
        System.out.println(indent+node.val);
        isDisplay(node.left,indent+"\t");
        isDisplay(node.right,indent+"\t");

    }
    public void prettyDisplay()
    {
        prettyDisplay(root,0);
    }

    private void prettyDisplay(Node node, int level) {
        if(node==null)
        {
            return;
        }
        prettyDisplay(node.right, level + 1);
        if(level!=0)
        {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------->" + node.val);
        }else{
            System.out.println(node.val);
        }
        prettyDisplay(node.left, level + 1);
    }
    public void preorde()
    {
        preorder(this.root);
    }

    private void preorder(Node node) {
        if(node==null)
        {
            return;
        }
        System.out.println(node.val+"");
        preorder(node.left);
        preorder(node.right);
    }
    public void inorder()
    {
        inorder(this.root);
    }

    private void inorder(Node node) {
        if(node==null)
        {
            return;
        }
        inorder(node.left);
        System.out.println(node.val+"");
        inorder(node.right);
    }
    public void postorder()
    {
        postorder(this.root);
    }

    private void postorder(Node node) {
        if(node==null)
        {
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.println(node.val+"");
    }



}
