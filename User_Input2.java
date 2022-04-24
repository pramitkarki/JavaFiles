//inputs using scanenr and arranging in descending order

import java.util.Scanner; 

class User_Input2
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);

int a[] = new int[5];		//initializing an array

for(int i=0; i < a.length; i++)
a[i]=obj.nextInt();	//taking input for the array


int temp = 0 ;		//initializing a temp variable for swapping

for(int i = 0; i<a.length-1;i++)	//using selection sort algorithm
{
int max = i;
for(int j = i+1; j<a.length; j++)
{
if(a[j] > a[max])
max = j;
}
if(max != i){
temp = a[i];
a[i]=a[max];
a[max]=temp;
}
}

System.out.println("The descending order is:");
for(int i=0; i < a.length; i++)
System.out.println(a[i]);	//printing in descending order
}
}
