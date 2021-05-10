import java.util.*;
public class DotComBust {
    // declare and initialise all the variables we'll need    
    private GameHelper helper = new GameHelper();
    private ArraryList <DotCom> dotComsList = new ArrayList<DotCom>();
    private int numberOfGuesses = 0;

    private void setUpGame ()   {
        // first make some dot coms and give them locations
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");

        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        // print brief instructions for user
        System.out.println("Your goal is to sink three dot coms.");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Try to sink them all in the fewest number of guesses");

        for (DotCom dotComToSet: dotComsList)   {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);  // call the setter method on this 
                                                        // DotCom to give it the location 
                                                        // you just got from the helper
        }
    }

    private void startPlaying() {
        while(!dotComsList.isEmpty())   {   // as long as the DotCom is NOT empty
            String userGuess = helper.getUserInpt("Enter a guess"); // get user input
            checkUserGuess(userGuess);  // call out own checkUserGUess method
        }
        finishGame();   // call our own finishGame method
    }

private void checkUserGUess(String userGuess)    {
    numberOfGuesses += 1;   // increment the number of guesses he has made
    String result = "miss"; // assume it's a "miss", unless told otherwise

    for (DotCom dotComToTest : dotComsList) {   
        result = dotComToTest.checkYourself(userGuess); // ask the DotCom to check the
                                            // user guess, looking for a hit or kill
        if (result.equals("hit"))   break;  // get out of the loop early no point in testing the others
        if (result.equals("kill")){
            dotComsList.remove(dotComToTest);   // the guy's dead, so take him out of
                                                // the DotComs list then get out of
                                                // the loop
            break;
        }
    }
    System.out.println(result);
}

private void finishGame()   {
    // print a message telling the user how he did in the game
    System.out.println("All the Dot Coms are dead! Your stock is now worthless");
    if (numberOfGuesses <= 18)  {
        System.out.println("It only took you " + numberOfGuesses + " guesses.");
        System.out.println("You got out before your options sank.");
    }   else    {
        System.out.println("Took you long enough. " + numberOfGuesses + " guesses.");
        System.out.println("Fish are dancing with your options.");
    }
}

public static void main (String [] args)    {
    DotComBust game = new DotComBust(); // create a game object
    game.setUpGame();   // tell the game object to set up the game
    game.startPlaying();    // tell the game object to star the main game loop
}