// arranging the strings in ascending order using inbuilt string functions
import java.util.Scanner;
class exp1b
{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);	// creating an object to take input

int n;
System.out.println("Enter the number of words:");
n = s.nextInt();

String[] str = new String[n];	

for(int i=0; i<n; i++)
	str[i] = s.next();	// taking string inputs
	
for(int i = 0; i<n; i++)   
{  
for (int j = i+1; j<n; j++)   
{  
  
if(str[i].compareToIgnoreCase(str[j])>0)   //comparing two strings ignoring the lower and upper cases
{   
String temp = str[i];  	//swapping the position of the strings which appear first alphabetically
str[i] = str[j];  
str[j] = temp;  
}  
}  
}  

System.out.println("The ascending order is:");
for(int i=0; i<n; i++)
	System.out.println(str[i]);	// printing the strings in ascending order

}
}