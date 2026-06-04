public class DiagonalSum
{
	public int sum(int[][] mat)
	{
		int s=0;
		for(int i=0;i<=mat.length;i++)
		{
			for(int j=0;j<mat.length;j++)
			{
				if(i==j)
					s+=mat[i][j];
				if((i+j==mat.length-1)&&(i+j!=(2*i)))
					s+=mat[i][j];
			}
		}
		return s;
	}
        public static void main(String[] args)
        {
        	DiagonalSum d=new DiagonalSum();
           int mat[][]= {{1,2,3},{4,5,6},{7,8,9}};
           int y=d.sum(mat);
           System.out.println(y);
        }
    }