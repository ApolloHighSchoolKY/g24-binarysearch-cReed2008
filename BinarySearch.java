import java.util.Arrays;

public class BinarySearch
{
	public static int binarySearch(int[] ray, int item)
	{
		int top = ray.length - 1;
		int low = 0;
		Arrays.sort(ray); 

		int pos = -1; 
		while (top >= low)
		{
			int mid = (low + top) / 2;

			if (ray[mid] < item)
			{
				low = mid + 1;
			}
			else if (ray[mid] > item)
			{
				top = mid - 1;
			}
			else if (ray[mid] == item)
			{
				pos = mid;
				break; 
			}
		}

		return pos;
	}
}
