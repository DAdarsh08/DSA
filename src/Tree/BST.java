package Tree;

public class BST {

    public class Node {
        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
    private Node root;
    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }
    public boolean isEmpty() {
        return root == null;
    }

    public BST() {

    }
    public void insert(int value)
    {

        root=insert(value,root);
    }

    private Node insert(int value, Node node) {
        if(node==null)
        {
            node=new Node( value);
            return node;
        }
        if(value<node.value)
        {
            node.left=insert(value,node.left);
        }
        if (value > node.value) {
            node.right = insert(value, node.right);
        }
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return node;
    }
    public void displayheight()
    {
        System.out.println(root.height);

    }

    public boolean balanced() {
        return balanced(root);
    }

    private boolean balanced(Node node) {
        if (node == null) {
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }
    public void isDisplay()
    {
        display(this.root, "Root Node: ");
    }

    private void display(Node node, String details) {
        if(node==null)
        {
            return;
        }
        System.out.println(details + node.value);
        display(node.left, "Left child of " + node.value + " : ");
        display(node.right, "Right child of " + node.value + " : ");
    }
    public void prettyDisplay()
    {
        prettyDisplay(this.root,0);
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
            System.out.println("|------->" + node.getValue());
        }else{
            System.out.println(node.getValue());
        }
        prettyDisplay(node.left, level + 1);
    }

    public void populate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }
    public void populatesorted(int []nums)
    {
        populatesorted(nums,0,nums.length);
    }

    private void populatesorted(int[] nums, int s, int e) {
        if(s>=e)
        {
            return;

        }

        int mid = (s + e) / 2;

        this.insert(nums[mid]);
        populatesorted(nums, s, mid);
        populatesorted(nums, mid + 1, e);


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
        System.out.println(node.getValue()+"");
        inorder(node.right);
    }


}
