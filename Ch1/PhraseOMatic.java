public class PhraseOMatic	{
	public static void main(String[] args)	{
		String[] wordListOne = {
			"Hit the Lights", "Blackened", "Fight Fire With Fire", "Battery",
			"Enter Sandman", "Ain't My Bitch", "Feul", "Frantic",
			"That Was Just Your Life", "Hardwired"
		};

		String[] wordListTwo = {
			"No Remorse", "Damage Inc", "The Call of Ktulu", "The Shortest Straw",
			"The God That Failed", "Outlaw Torn", "Carpe Diem Baby","The Unnamed Feeling",
			"Suicide and Redemption", "Spit Out The Bone"
		};

		String[] wordListThree = {
			"Orion", "To Live is To Die", "Seek and Destroy", "Ride the Lightning",
			"2x4", "Fixxxer", "Sweet Amber", "All Nightmare Long",
			"Halo On Fire"
		};

		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;

		int x = 10;
		while(x>0){
				int rand1 = (int) (Math.random() * oneLength);
				int rand2 = (int) (Math.random() * twoLength);
				int rand3 = (int) (Math.random() * threeLength);
		
				String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] +
				" " + wordListThree[rand3];
		
				System.out.println("What we need is a " + phrase);
				x -= 1;
			}

	}
}