package text;

import java.util.ArrayList;
import java.util.List;


public class Folyd_text {
	private int[][] dist;
	private int[][] path;
	public List result = new ArrayList();
	int m = Integer.MAX_VALUE;
	public void findCheapestPath(int begin, int end, int[][] matrix) {
		Floyd(matrix);
		result.add(begin);
		findPath(begin, end);
		result.add(end);
	}

	public void findPath(int i, int j) {
		int k = path[i][j];
		if (k == -1)
			return;
		findPath(i, k);
		result.add(k);
		findPath(k, j);
	}

	public void Floyd(int[][] matrix) {
		int size = matrix.length;
		for (int i = 0; i < size; i++) 
		{
			for (int j = 0; j < size; j++) 
			{
				path[i][j] = -1;
				dist[i][j] = matrix[i][j];
			}
		}
		
		for (int k = 0; k < size; k++) 
		{
			for (int i = 0; i < size; i++) 
			{
				for (int j = 0; j < size; j++) 
				{
					if (dist[i][k] != m && dist[k][j] != m
							&& dist[i][k] + dist[k][j] < dist[i][j]) 
					{
						dist[i][j] = dist[i][k] + dist[k][j];
						path[i][j] = k;      //ÖÐ×ª¶¥µã
					}
				}
			}
		}
	
	}
	public Folyd_text(int size)
	{
		this.path = new int[size][size];
		this.dist = new int[size][size];
	}
}
