public class Duck2 {
    int size;
    
    public Duck2()  {
        // default size
        size = 27;
        System.out.println("Quack! size: default(27)");
    }

    public Duck2(int duckSize)  {
        // useing duckSize parameter
        size = duckSize;
        System.out.println("Quack! size: " + size );
    }
    // Overloaded constructors: more than one constuctor in a class
}
