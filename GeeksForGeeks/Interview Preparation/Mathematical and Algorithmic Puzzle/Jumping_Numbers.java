import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Jumping_Numbers
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int n = 0, max = -1;
		int arr[] = new int[T];
		for (int i = 0; i < T; i++)
		{
			arr[i] = Integer.parseInt(br.readLine());
			if (arr[i] > max)
				max = arr[i];
		}
		ArrayList<Integer> AllElementLstUptoMax = new ArrayList<Integer>();
		AllElementLstUptoMax.add(0);
		for (int i = 1; i <= 9 && i <= max; i++)
			AllElementLstUptoMax.addAll(findNumbers(max, i));
		Collections.sort(AllElementLstUptoMax);
		StringBuilder sb;
		for (int i = 0; i < T; i++)
		{
			sb = new StringBuilder();
			for (int j = 0; j < AllElementLstUptoMax.size() && AllElementLstUptoMax.get(j) <= arr[i]; j++)
			{
				sb.append(AllElementLstUptoMax.get(j) + " ");
			}
			System.out.println(sb.toString());
		}

	}

	private static ArrayList<Integer> findNumbers(int maxLimit, int startNum)
	{
		ArrayList<Integer> lst = new ArrayList<Integer>();
		ArrayList<Integer> loopLst = new ArrayList<Integer>();
		// lst.add(startNum);
		loopLst.add(startNum);

		while (!loopLst.isEmpty())
		{
			startNum = loopLst.get(0);
			loopLst.remove(0);

			if (startNum <= maxLimit)
			{
				lst.add(startNum);
				int last_dig = startNum % 10;

				// If last digit is 0, append next digit only
				if (last_dig == 0)
					loopLst.add((startNum * 10) + (last_dig + 1));

				// If last digit is 9, append previous digit only
				else if (last_dig == 9)
					loopLst.add((startNum * 10) + (last_dig - 1));

				// If last digit is neighter 0 nor 9, append both
				// previous and next digits
				else
				{
					loopLst.add((startNum * 10) + (last_dig - 1));
					loopLst.add((startNum * 10) + (last_dig + 1));
				}
			}
		}
		return lst;
	}
}