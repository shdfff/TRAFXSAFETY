package simple;

public class twodimensionarray 
{

	public static void main(String[] args)
	{
		int a[][]= {{1,2,3,7}, {4,5,6,8}, {8,9,11,10}};
		int row=a.length;
		System.out.println("rows" +row);
		int column=a[0].length;
		System.out.println("column" +column);
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.println(a[i][j]+ "");
			}
			System.out.println();
		}
	}

}
