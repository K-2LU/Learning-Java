import java.util.scanner.*;

public class DFS	{
		public static void main(Stirng[] args)	{
			boolean array[5][5], visited[5][5];;
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					array[i][j] = visited[i][j] = false;
				}
			}
			
			Scanner scanner = new Scanner();
			int n, m;
			n = scanner.nextInt();
			scanner.nextLine();
			m = scanner.nextInt();
			scanner.nextLine();
			for (int i = 0, u, v; i < m; i++) {
				u = scanner.nextInt();
				scanner.nextLine();
				v = scanner.nextInt();
				scanner.nextLine();
				array[u-1][v-1] = 1;
			}
			dfs(0, 0, array], visited);
		}
		
		public void dfs (int i, int j, boolean array[][], boolean visited[][])	{
			if (visited[i][j]) return;
			visited[i][j] = true;
			
		}
}