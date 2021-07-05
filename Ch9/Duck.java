// Duck constructor
public class Duck   {
    int size;

    public Duck(int duckSize)   {   // constructor
        System.out.println("Quack");

        size = duckSize;
        System.out.println("size is" + size);
    }
/*
    public void setSize(int newSize)    {   // setter method
        size = newSize;
    }*/
}

// methods must have a return type 
// constructors however, cannon have a return type