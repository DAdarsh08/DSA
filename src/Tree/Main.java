package Tree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        BinaryTree bt=new BinaryTree();
//        bt.populate( scanner);
//        bt.display();
//        bt.prettyDisplay();

//      Avl tree = new Avl();
//        int[] nums = {1,2,3,4,5,6,7,8,9,10};
//
//       tree.populatesorted(nums);
//       tree.populate(nums);
//      tree.insert(5);
////        tree.insert(8);
////        tree.insert(7);
//        tree.isDisplay();
//        tree.prettyDisplay();
//        tree.displayheight();
//        tree.inorder();
//        System.out.println(tree.balanced());
//        for(int i=0;i<10;i++)
//        {
//            tree.insert(i);
//        }
//
//        System.out.println(tree.height());
//        System.out.println();
//        tree.prettyDisplay();
        int[] arr = {3, 8, 6, 7, -2, -8, 4, 9};
        SegmentTree tree = new SegmentTree(arr);
        // tree.display();

        System.out.println(tree.query(2, 6));

    }



}
