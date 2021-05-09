class MixFor5 {
    public static void main(String [] args) {
        int x = 0;
        int y = 30;
        for (int outer = 0; outer < 3; outer++) {
            for (int inner = 4; inner > 1; inner --)    {
                // candidate for 45 6: x+=2
                // candidate for 36 6: x++
                // candidate for 54 6: x += 3
                // candidate for 60 10: x += 6
                // candidate for  18 6: x--;
                // candidate for 6 14: x += 0;

                y -= 2;
                if(x == 6)  break;

                x += 3;
            }
            y -= 2;
        }
        System.out.println(x + " " + y);
    }
}
