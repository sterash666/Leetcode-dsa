class Solution {
public void setZeroes(int[][] matrix) {
 int m=matrix.length;
 int t = matrix[0].length;
 boolean row[]=new boolean [m];
 boolean col[]=new boolean [t];
 for(int i=0;i<matrix.length;i++)
{
    for(int j=0;j<t;j++)
    {
        if(matrix[i][j]==0)
        {
            col[j]=true;
            row[i]=true;
        }
          
    }
}
    for(int i=0;i<matrix.length;i++)
{     
    if(row[i])
    {
    for(int j=0;j<t;j++)
    {
        
          matrix[i][j]=0;
    
    }
    }
}
for(int i=0;i<m;i++)
{     
   
    for(int j=0;j<t;j++)
    {   if(col[j])
    {
          matrix[i][j]=0;
        }
    }
}
    

}
}