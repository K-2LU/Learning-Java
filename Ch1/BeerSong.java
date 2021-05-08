public class BeerSong	{
	public static void main(String[] args)	{
		int beerNm = 99;
		String word = "bottles";

		while(beerNm > 0)	{

			if(beerNm == 1)
				word = "bottle";

			System.out.println(beerNm + " " + word + " of beer on the wall");
			System.out.println(beerNm + " " + word + " of beer.");
			System.out.println("Take on down.");
			System.out.println("Pass it around.");

			beerNm -= 1;

			if(beerNm > 0)
				System.out.println(beerNm + " " + word + " of beer on the wall");
			else
				System.out.println("No more bottles of " + word + " on the wall");
		}
	}
}