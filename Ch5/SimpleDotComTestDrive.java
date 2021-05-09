public class SimpleDotComTestDrive  {

    public static void main (String [] args)    {
        int numOfGuesses = 0;

        GameHelper helper = new GameHelper();

        SimpleDotCom theDotCom = new SimpleDotCom();
        int randomNUM = (int) (Math.random() * 5);

        int[] locations = {randomNUM, randomNUM+1, randomNUM+2};
        theDotCom.setLocationsCells(locations);
        boolean isAlive = true;

        while(isAlive == true)  {
            String guess = helper.getUserInpt("Enter a number: ");
            String result = theDotCom.checkYourself(guess);
            numOfGuesses+=1;
            if(result.equals("kill"))    {
                isAlive = false;
                System.out.println("You took " + numOfGuesses +" guesses");
            }
        }
    }
}