public class Mushroom {
    public Mushroom(int size) { } // when you know the size

    public Mushroom()   { }    // when you know nothing

    public Mushroom(boolean isMagic) ()    // when you know if it's magic or not but
                                        // don't know the size

    public Mushroom(boolean isMagic, int size)  {}  // when you know whether or not
    public Mushroom(int size, boolean isMagic)  {}  // it'a magic and the size as
                                                    // well
    
    // the last two constructors have same args, but in different order
    // so it's okay
}
