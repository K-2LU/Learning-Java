__Risky exception-throwing code:__
------------------------------

``` Java 

    // this method must tell the world that it throws a 
    // BadException
    public void takeRisk()  throws BadException {
        if  (abandonAllHope)    {
            throw new BadException();
            // create a new Exception object and throw
            // it 
        }
    }
```

__Code that calls the risky method:__
--------------------------------

```Java
    public void crissFingers()  {
        try {
            anObject.takeRisk();
        }   catch   (BadException ex)   {
            System.out.println("Aaargh!");
            ex.printStackTrace();
        }
    }
```