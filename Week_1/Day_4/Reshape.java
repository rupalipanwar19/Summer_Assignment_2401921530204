import java.util.Arrays;
public class Reshape
{
	public int[][] reshaping(int[][] mat,int r,int c)
	{
		int m=mat.length;
		int n=mat[0].length;
		if((r*c)!=(m*n))
			return mat;
		if(r==m&&c==n)
			return mat;
		int[][] newmat=new int[r][c];
		int x=0,y=0;
		while(x<r*c && y<m*n)
		{
			newmat[x/c][y%c]=mat[x/n][y%n];
			x++;
			y++;
		}
		return newmat;
	}
        public static void main(String[] args)
        {
        	Reshape d=new Reshape();
           int mat[][]= {{1,2},{3,4}};
           int r=1,c=4;
           int[][] y=d.reshaping(mat,r,c);
           System.out.println(Arrays.deepToString(y));
        }
    }