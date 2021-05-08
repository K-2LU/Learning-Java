class test {
	public static void main(String[] args)	{
		int x = 0;
		int y = 0;

		while(x < 5)	{
			x += 1;
			y += x;
			y += y;

			y += 2;
			if(y > 4)
				y -= 1;

			if(y < 5)	{
				x += 1;
				if( y < 3)	{
					x -= 1;
				}
			}
			y = y + 2;

			System.out.print(x + " " + y + " ");
			x += 1;
		}
	}
}