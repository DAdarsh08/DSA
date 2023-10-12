package List;

public class Main {
    public static void main(String[] args) {
//        LL list=new LL();
//        list.addfirst(1);
//        list.addfirst(1);
//        list.addfirst(2);
//        list.addfirst(4);
//        list.addfirst(4);
//
//        list.display();
//        list.removeDuplicate();
//
//        list.display();
//        LL first=new LL();
//        first.last(1);
//        first.last(3);
//        first.last(5);
//
//        LL second=new LL();
//        second.last(1);
//        second.last(2);
//        second.last(9);
//        second.last(14);
//
//        LL ans=LL.merge(first,second);
//        ans.display();
        LL list=new LL();
        for(int i=7;i>=1;i--)
        {
            list.last(i);
        }
        list.display();
        System.out.println();
      //  list.bubblesort();
        list.reverselist();
        list.display();
    }
}
