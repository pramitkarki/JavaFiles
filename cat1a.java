import java.util.Random;

class cat1a {
	public static void main(String[] args)
	{
		int arr[][] = new int[4][];

		arr[0] = new int[3];
		arr[1] = new int[2];
		arr[2] = new int[3];
		arr[3] = new int[4];

    int count = 0;
		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr[i].length; j++){
				arr[i][j] = Integer.parseInt(args[count]);
			
			    count++;
			}
	
		System.out.println("Contents of 2D Jagged Array");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
		
		int MatrixA[] = new int[4];
		int MatrixB[] = new int[4];
		int ans[] = new int[4];
		
		Random r=new Random();        
	
	System.out.println();
        System.out.println("Matrix A:");
		for(int i=0 ; i<MatrixA.length; i++){
		    MatrixA[i] = r.nextInt(arr.length);
		    System.out.println(MatrixA[i]);
		}
	
	System.out.println();	
        System.out.println("Matrix B:");
        for(int i=0 ; i<MatrixB.length; i++){
		    MatrixB[i] = r.nextInt(arr.length);
		    System.out.println(MatrixB[i]);
        }

        for(int i=0 ; i<ans.length; i++)
		    ans[i] = MatrixA[i] - MatrixB[i];
        
	System.out.println();
        System.out.println("Matrix difference:");
		for(int i=0 ; i<ans.length; i++)
		    System.out.println(ans[i]);
	
    }
}
