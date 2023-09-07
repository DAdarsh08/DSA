package LinkedList;

import java.util.Scanner;

public class DLl {
    private Node head;
    public  void insertFirst(int val)
    {
        Node node =new Node(val);
        node.prev=null;
        node.next=head;
        if(head!=null) {
            head.prev = node;
        }
        head=node;
    }
    public void insertAtlast(int val)
    {
        Node node=new Node(val);
        Node last=head;
        while(last.next!=null)
        {
            last=last.next;
        }
        last.next=node;//hear last and node ref variable will be in the scope only they will ultimately get distroyed;
        node.prev=last;
        node.next=null;


    }
    public void insertany(int val)
    {
        Node temp =findval(val);
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the val to insert");
        x= sc.nextInt();
        Node  node= new Node(x);
       node.next=temp.next;
       temp.next.prev=node;
       temp.next=node;
       node.prev=temp;



    }
    public Node findval(int data)
    {
        Node node;
        node=head;
        while(node.val!=data)
        {
            node=node.next;
        }
        return node;
    }
    public void display()
    {
        Node temp=head;
        Node last=null;
        while (temp!=null)
        {
            last=temp;
            System.out.print(temp.val+"-->");
            temp=temp.next;
        }
        System.out.print("END");
        System.out.println();
        while (last!=null)
        {
            System.out.print(last.val+"-->");
            last=last.prev;
        }
        System.out.println("START");

    }

    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
