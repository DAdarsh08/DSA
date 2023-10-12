package Stackprac;

public class CoustomMain {
    public static void main(String[] args) throws Exception {
//        Coustomqueue queue=new Coustomqueue();
//        queue.insert(1);
//        queue.insert(2);
//        queue.insert(7);
//        queue.insert(90);
//        queue.display();
//        System.out.println(  queue.remove());
//        queue.display();
//        DynamicQueue queue=new DynamicQueue(1);
//        queue.insert(1);
//        queue.insert(2);
//        queue.insert(7);
//        queue.insert(90);
//        queue.display();
//        System.out.println(  queue.remove());
//        queue.display();
        CircularQueue queue=new CircularQueue(5);
        queue.insert(24);
        queue.insert(2);
        queue.insert(12);
        queue.insert(25);
        queue.insert(100);

        queue.isDisplay();
        System.out.println( queue.remove());
        queue.isDisplay();

    }
}
