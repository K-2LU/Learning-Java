public class TestExceptions {
    public static void main(String[] args) {
        String test = "no";
        try {
            System.out.println("start try");
            doRisky(test);
        }
    }
}

static void doRisky(String test) throws Exception {
    System.out.println("start risky");
    if("yes".equals(test))  {
        throw new ScaryException("test");
    }
}