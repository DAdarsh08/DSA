package Stackprac;

public class Coustomqueue {
    int []data;
    private final static int DEFAULT_SIZE=10;
    int end=0;

    public Coustomqueue(int size) {
        this.data = new int[size];
    }
    public Coustomqueue() {
        this(DEFAULT_SIZE);
    }
    public boolean isFull() {
        return end == data.length; // ptr is at last index
    }
    public boolean isEmpty() {
        return end == 0;
    }
    public boolean insert(int item)
    {
        if(isFull())
        {
            return false;
        }
       data[end++]=item;
        return true;
    }
    public int remove()throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("stack is empty");
        }
        int removed=data[0];
        for (int i=1;i<end;i++)
        {
            data[i-i]=data[i];

        }
        end--;
        return removed;
    }
    public int front() throws Exception{
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        return data[0];
    }

    public void display() {
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " <- ");
        }
        System.out.println("END");
    }
}
