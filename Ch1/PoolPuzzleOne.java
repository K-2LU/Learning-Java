class PoolPuzzleOne	{
	public static void main(String [] args)	{
		int x = 0;
		while(x < 4)	{
			if(x<1){
				System.out.print("a");
				System.out.print(" ");
			}

			if(x < 1)
				System.out.print("noise")

			if(x == 1)
				System.out.print("annoys");

			if(x > 1)	{
				System.out.print("an");
				System.out.print(" oyster");
				x += 2;
			}
			
			System.out.println("");
			x += 1;
		}
	}
}