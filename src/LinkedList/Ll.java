package LinkedList;

public class Ll {
   private Node head;
   private Node tail;
   private  int size;
   public void addFirst(int val)
   {
       Node node=new Node(val);
       node.next=head;
       head=node;

       if(tail==null)
       {
           tail=head;

       }
       size+=1;


   }
   public void insertlast(int val)
   {
       if(tail==null)
       {
           addFirst(val);
           return;
       }
       Node node=new Node(val);
       tail.next=node;
       tail=node;
       size++;



   }
   public void insertAtany(int val,int index)
   {
       Node temp=head;
       if(index==0)
       {
           addFirst(val);
           return;
       }
       if(index == size )
       {
           insertlast(val);
           return;
       }

       for(int i =1;i<index;i++)
       {
           temp=temp.next;
       }
       Node node=new Node(val,temp.next);
       temp.next=node;
       size+=1;



   }
   public int delfirst()
   {
       if(head==null)//there is only one element;
       {
           tail=null;
       }



       int val=head.val;
       head=head.next;
       if(head==null)//there is only one element;
       {
           tail=null;
       }
       size-=1;
       return val;
   }
   public int deleteatlast()
   {
       if(size<=1)
       {
          return delfirst();
       }
       Node temp=get(size-2);
       int val=temp.val;

       tail=temp;
       tail.next=null;
       size--;
       return val;




   }
   public int deleteATany(int index)
   {
       if(index==0)
       {
           return delfirst();

       }
       if(index==size-1)
       {
           return  deleteatlast();
       }
       Node temp=get(index-1);
       int val=temp.next.val;
       temp.next=temp.next.next;
       return val;

   }
   public Node get(int index)
   {
       Node node=head;
       for (int i=0;i<index;i++)
       {
           node=node.next;
       }
       return node;

   }

   public void display()
   {
       Node temp;
       temp=head;
       while (temp!=null)
       {
           System.out.println(temp.val);
           temp=temp.next;

       }
   }


    private class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
