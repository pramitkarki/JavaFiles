//Inputs using CLA and arranging in ascending order

class User_input1
{
public static void main(String args[])
{
	int a[] = new int[5];	//creating an array

	for(int i=0; i < a.length; i++)
		a[i]=Integer.parseInt(args[i]); 	//converting into integer

	int temp = 0 ;		//initializing a temp variable for swapping

	for(int i = 0; i<a.length-1;i++)
	{
		int min = i;
		for(int j = i+1; j<a.length; j++)
		{
			if(a[j] < a[min])
				min = j;
		}
		if(min != i){
			temp = a[i];
			a[i]=a[min];
			a[min]=temp;
		}
	}

	System.out.println("The ascending order is:");
	for(int i=0; i < a.length; i++)
	System.out.println(a[i]);	//printing in ascending order
}
}