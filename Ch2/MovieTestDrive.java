class Movie	{
	String title;
	String genre;
	int rating;

	void playIt()	{
		System.out.println("Playing the Movie");
	}
}

public class MovieTestDrive	{
	public static void main(String [] args)	{
		Movie one = new Movie();
		one.title  = "The Shawshank Redemption";
		one.genre = "Thriller";
		one.rating = 5;

		Movie two = new Movie();
		two.title = "Forest Gump";
		two.genre = "Adventure";
		two.rating = 5;
		two.playIt();

		Movie three = new Movie();
		three.title = "Captain Marvel";
		three.genre = "Action";
		three.rating = 2;
	}
}