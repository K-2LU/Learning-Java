public class TestBoats {
    public static void main (String [] args)    {
        Boat b1 = new Boat();
        SailBoat b2 = new SailBoat();
        Rowboat b3= new Rowboat();

        b2.setLength(32);
        b1.drift();
        b3.drift();
        .move();
    }
}
