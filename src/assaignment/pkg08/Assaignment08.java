
package assaignment.pkg08;

public class Assaignment08 {

  
    public static void main(String[] args) {
 
//        int arr[][] ={ 
//                                 {5 ,2, 3, 4},
//                                 { 6, 2, -5, 7},
//                                 {19, 14, 25, 2},
//                                 { 1, 5, 13, 19},
//                                 { 8, 5, 7, -4 },
//                                 {-10, 9, -50, 88 }
//                         };


int arr[][]=new int[6][4];
for(int i=0 ; i<arr.length; i++)
        {
            for(int j=0 ; j<arr[i].length ; j++)
            {
                arr[i][j]=(int )(-100+Math.random()*201);
            }
        }
        double []avg=avg(arr);
        int [][]min_max=min_max(arr);
        for(int i=0 ; i<avg.length ; i++)
        {
            System.out.print(avg[i]+ "\t");
        }
        System.out.println();
        for(int i=0 ; i<2 ; i++)
        {
            for(int j=0 ; j<2 ; j++)
            {
                System.out.print(min_max[i][j]+ "\t");
            }
            System.out.println();
        }
        
    }
    
    public static double[] avg(int arr[][])
    {
        double []avg=new double[arr[0].length];
        
        for(int i=0 ; i<arr[i].length ; i++)
        {
            for(int j=0 ; j<arr.length ; j++)
            {
                avg[i]+=arr[j][i];
            }
        }
        for(int i=0 ; i<avg.length ; i++)
        {
            avg[i]=avg[i]/arr.length;
        }
        return avg;
    }
    
    public static int[][] min_max(int [][]arr)
    {
        int [][]min_max = new int [2][2];
        int max=0, min=0;
        for(int i=0 ; i<arr.length ; i++)
        {
            for(int j=0 ; j<arr[i].length ; j++)
            {
            if(max < arr[i][j] )
                max=arr[i][j];
            if(min >arr[i][j])
                min= arr[i][j];
            }
        }
     //   System.out.println(min +"  "+ max);
        int max2=0 , min2=0;
        int minindx=0 , maxindx=0;
        for(int i=0 ; i<arr.length ; i++)
        {
            for(int j=0 ; j<arr[i].length ; j++)
            {
            if(max2 < arr[i][j] && max != arr[i][j])
                  {max2=arr[i][j];  maxindx=i;}
            if(min2 >arr[i][j] && min != arr[i][j])
                  {min2=arr[i][j];   minindx =j;}
            }
        }
  //      System.out.println(max2+ "   "+min2);
        min_max[0][0]=max;
        min_max[0][1]=maxindx;
        min_max[1][0]=min;
        min_max[1][1]=minindx;
        return min_max;
    }
}
