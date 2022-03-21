class MyOuter {
    private int x; // the outer class has a private instance variable 'x'
    MyInner inner = new MyInner(); // make instance of the inner class

    public void doStuff() {
        inner.go(); // call a method on the inner class
    }

    class MyInner {
        void go() {
            x = 42; // the method in the inner class uses the outer class
                    // instance variable 'x', as if 'x' belonged to
                    // inner class
        }
    }
}
