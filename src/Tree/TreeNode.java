package Tree;

public class TreeNode {
    int data;
    TreeNode next;

    public TreeNode(int data) {
        this.data = data;
    }
    public TreeNode()
    {

    }
    public static void swap(TreeNode n1,TreeNode n2)
    {
        TreeNode temp=n1;
        n1=n2;
        n2=temp;
    }
    public static void refswap(TreeNode n1,TreeNode n2)
    {
        int  temp=n1.data;
        n1.data=n2.data;
        n2.data=temp;
    }


    @Override
    public String toString() {
        return "TreeNode{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }

    public static void main(String[] args) {
        TreeNode node1=new TreeNode(1);
        TreeNode node2=new TreeNode(2);
        System.out.println(node1);
        System.out.println(node2);
        TreeNode.swap(node1,node2);//this will not  swap;to swap this obj it should be within another obj;
        System.out.println();
        System.out.println(node1);
        System.out.println(node2);
        TreeNode.refswap(node1,node2);//bcz its for i.e (node.data) the part of the object so it will swap;
        System.out.println();
        System.out.println(node1);
        System.out.println(node2);
      //if it is inside object than we can change things but not object it self;




    }

}
