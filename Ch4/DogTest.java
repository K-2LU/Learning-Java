public class DogTest {
    public static void main(String [] args){
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        Dog d3 = new Dog();

        d1.name = "Kevin";
        d1.size = 65;

        d2.name = "Lee";
        d2.size = 18;

        d3.name = "Jones";
        d3.size = 8;

        d1.bark(2);
        d2.bark(1);
        d3.bark(0);
    }
}
