# Difference between a Static and a non-Static method #

 When there is a special case, i.e. a utility method, where there is no need to have and instance class, the keyword __static__ lets a method run withouf any instance of the class. 
 
 A static method means "behaviour not dependent on an instance variable", so no instance/object is required. Just the class."

 __regular (non-static) method__

 ----------------------

 ``` Java
    public class Song   {
        String title;
        public Song(String t)  {
            title = t;
        }
        public void play()  {
            SoundPlayer player = new SoundPlayer();
            player.playSound(title);
        }
    };

    // invocation:
    object.playSound(title);

 ```

 __static method__
 ---------------------

``` Java
    public static int min(int a, int b) {
        // returns the lesser of a nad b
    }

    //invocation
    min(3, 4);  // no object
```

_static <u>final</u> variables_
A variable marked __final__ means that, once instantiated, it can never change. As long as the class is laoded, the final variable will stay the same. 
```Java
    public static final double PI = 3.1416.....;
```

__Initialize a _final_ static variable__

``` Java
    public class Foo    {
        public static final int FOO_x = 25;
    }
```

or

``` Java
    public class Bar    {
        public static final double BAR_SIGN;
        
        static  {
            BAR_SIGN = (double) Math.random();
        }
    }
```