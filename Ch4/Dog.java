public class Dog {
    String name;
    int size;

    void bark(int numofBarks){
        while (numofBarks > 0){
            if (size > 60) System.out.println("Woof! Woof!");
            else if (size > 14)    System.out.println("Ruff! Ruff!");
            else System.out.println("Yip!Yip!");

            numofBarks -= 1;
        }
    }
}
