// arranging the strings in descending order without using inbuilt string functions
import java.util.Scanner;
class exp1b2
{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);	// creating an object to take input

int n;
System.out.println("Enter the number of words:");
n = s.nextInt();

String[] str = new String[n];

for(int i=0; i<n; i++)
	str[i] = s.next();		// taking string inputs

for(int i = 0; i<n; i++)   
{  
for (int j = i+1; j<n; j++)   
{  
  
if(compareStrings(str[i],str[j])<0)   		//comparing two strings
{   
String temp = str[i];  		//swapping the position of the strings which appear first alphabetically
str[i] = str[j];  
str[j] = temp;  
}  
}  
}  

System.out.println("The descending order is:");
for(int i=0; i<n; i++)
	System.out.println(str[i]);		// printing the strings in descending order

}

public static int compareStrings(String str1, String str2)	// class to compare two strings
{  
	int len1 = str1.length();  	
	int len2 = str2.length();  
	int lim = Math.min(len1, len2);     // takes the minimum value of the legth among the two strings
	
	char c1[] = str1.toCharArray();  	// converting string to character array
	char c2[] = str2.toCharArray();  
   
	for(int i=0; i<lim; i++){  
		char ch1 = c1[i];  
		char ch2 = c2[i];  
		
		if (ch1 != ch2) {  
			return ch1 - ch2;  	// returns the difference between their ASCII values
		}   
	}  
	// if the string are same then it returns the difference of their length
	// "abcd" and "abcde" are same string from the above function as it iterates only 4 times
	return len1 - len2;  	
} 
}