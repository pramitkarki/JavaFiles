class Strings
{
public static void main(String args[])
{
String s="Java";
String str=new String("Program"); //forcing the JVM to create the new reference in heap memory
String s1="Java";
String str1=new String("Program");
String s2="java";
String str2=new String("Java");
System.out.println(s==s1); //check value & reference of s and s1
System.out.println(str==str1); //check value & reference of str and str1
System.out.println(s==str2); //check value & reference of s and str2
/*s1=s1+"Programming";
System.out.println(s==s1); //check value & reference of s and s1 */
s1.concat("Programming"); //String is immutable
System.out.println("S1 Value "+ s1);
System.out.println(s==s1);
s1=s1.concat("Programming");
System.out.println("S1 Value "+ s1);
System.out.println(s==s1);
}
}