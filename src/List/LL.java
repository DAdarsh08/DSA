package List;

public class LL {
    private Node head;
    private Node tail;
    private int size;
    public void  addfirst(int val)
    {
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null)
        {
            tail=head;

        }
        size++;
    }
    public void last(int val)
    {
        if(tail==null)
        {
            addfirst(val);

            return;
        }

        Node node=new Node(val);
        tail.next=node;
        node.next=null;
        tail=node;
        size++;
    }
    public void addAny(int index, int val)
    {
        Node temp=head;
        if(index==0)
        {
            addfirst(val);
            return;
        }
        if(index==size)
        {
            last(val);
            return;

        }
        for(int i=1;i<index;i++)
        {
            temp=temp.next;
        }
        Node node=new Node(val,temp.next);
        temp.next=node;
        size++;

    }
    public void insertrec(int index,int val)
    {
        head=insertAny(index,val,head);
    }
    public Node insertAny(int index,int val, Node node)
    {
        if(index==0)
        {
            Node temp=new Node(val,node);
            return  temp;

        }
         node.next=insertAny(index-1,val,node.next);
        return node;
    }

    public void removeDuplicate( )
    {
        Node node=this.head;
        while(node.next!=null)
        {
            if(node.val==node.next.val)
            {
                node.next=node.next.next;
            }
            else {
                node=node.next;
            }

        }
        tail=node;
        tail.next=null;


    }
    public  static LL merge(LL first, LL second)
    {
        Node f=first.head;
        Node s=second.head;
        LL ans=new LL();
        while(f!=null&&s!=null)
        {
            if(f.val<s.val)
            {
                ans.last(f.val);
                f=f.next;

            }
            else{
                ans.last(s.val);
                s=s.next;
            }
        }
        while(f!=null)
        {
            ans.last(f.val);
            f=f.next;
        }
        while(s!=null)
        {
            ans.last(s.val);
            s=s.next;
        }
        return ans;
    }

    public void display() {
        Node temp = head;

        while (temp != null) {

            System.out.print(temp.val + "-->");
            temp = temp.next;
        }
        System.out.print("END");

    }
    public  void bubblesort()
    {
        bubblesort(size-1,0);
    }
    private void bubblesort(int r,int c)
    {
        if(r==0)
        {
            return;
        }
        else if (c<r) {
            Node first=get(c);
            Node second=get(c+1);
            if(first.val> second.val)
            {
                if(first==head)
                {
                    head=second;
                    first.next=second.next;
                    second.next=first;
                } else if (second==tail) {
                    Node prev=get(c-1);
                    prev.next=second;
                    tail=first;
                    first.next=null;
                    second.next=tail;

                }else {
                    Node prev=get(c-1);
                    prev.next=second;
                    first.next=second.next;
                    second.next=first;
                }
            }
            bubblesort(r,c+1);

        }
        else{
            bubblesort(r-1,0);
        }

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


    private class Node{
       private int val;
       private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
