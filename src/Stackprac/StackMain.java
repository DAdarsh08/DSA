package Stackprac;

public class StackMain {
    public static void main(String[] args) throws CoustomException {


//        CoustumStack st = new CoustumStack(5);
////        System.out.println(st.push(45));
////        System.out.println(st.push(67));
////        System.out.println( st.push(32));
////        System.out.println( st.push(20));
////        System.out.println(st.push(45));
////        System.out.println(st.pop());
//        try {
//            System.out.println(st.pop());
//        }catch (Exception ep)
//        {
//            System.out.println(ep);
//        }
       // System.out.println(st.push(89));
        CoustumStack stack=new DyamicStack(3);

        stack.push(14);
        stack.push(47);
        stack.push(56);
        stack.push(78);
        System.out.println(stack.pop());
    }





}
