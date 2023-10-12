package Stackprac;

public class CoustumStack {
    int []data;
    private final static int DEFAULT_SIZE=10;
    int ptr=-1;

    public CoustumStack(int size) {
        this.data = new int[size];
    }

    public CoustumStack() {
       this(DEFAULT_SIZE);
    }
    public boolean push(int item)
    {
        if(isFull())
        {
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;


    }
    public int pop() throws CoustomException {
        if(isEmpty())
        {
            throw new CoustomException("statck is empty");
        }
//        int removed=data[ptr];
//        ptr=ptr-1;
//        return removed;
        return data[ptr--];

    }

    public boolean isFull() {
        return ptr==data.length-1;//ptr is at last index;

    }
    public boolean isEmpty()
    {
        return ptr==-1;
    }


}
