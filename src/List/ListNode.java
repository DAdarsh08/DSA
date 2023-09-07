package List;

public class ListNode {
    int val;
      ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
   ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public static void main(String[] args) {
        ListNode list=new ListNode(34);
        ListNode tail=list;
      list= list.insert(32,list);

        System.out.println(list.val);
        System.out.println(list.next.val);

    }
    public ListNode insert(int val,ListNode list)
    {
        ListNode node=new ListNode(val);
        node.next=list;
        list=node;
        System.out.println(list.val);
        return  list;
    }
}

