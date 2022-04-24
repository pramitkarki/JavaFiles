/*
//Method overloading 
class Add
{
//float val1,val2,val3;



//method overloading type-1
void addition()
{
System.out.println(val1+val2);
}



void addition(float a)
{
val1=a;
System.out.println(val1+val2);
}
void addition(float a,float b)
{
val1=a;
val2=b;
System.out.println(val1+val2);
}
void addition(float a,float b,float c)
{
val1=a;
val2=b;
val3=c;
System.out.println(val1+val2+val3);
}
//method overloading type-2
void addition(int a)
{
val1=a;
System.out.println(val1+val2);
}
void addition(int a,int b)
{
val1=a;
val2=b;
System.out.println(val1+val2);
}

public static void main(String args[])
{
Add obj=new Add();
obj.addition();
obj.addition(1.0f);
obj.addition(1.0f,2.0f);
obj.addition(1.0f,2.0f,3.0f);
obj.addition(1);
obj.addition(1,2);
}
}

*/
///////////////////////////////////////////////////////////////////////////////////////

//main method overloading 
class Add
{
float val1,val2,val3;



//method overloading type-1
void addition()
{
System.out.println(val1+val2);
}



void addition(float a)
{
val1=a;
System.out.println(val1+val2);
}
void addition(float a,float b)
{
val1=a;
val2=b;
System.out.println(val1+val2);
}
void addition(float a,float b,float c)
{
val1=a;
val2=b;
val3=c;
System.out.println(val1+val2+val3);
}
//method overloading type-2
void addition(int a)
{
val1=a;
System.out.println(val1+val2);
}
void addition(int a,int b)
{
val1=a;
val2=b;
System.out.println(val1+val2);
}



public static void main(String args[])
{
Add obj=new Add();
obj.addition();
obj.addition(1.0f);
obj.addition(1.0f,2.0f);
obj.addition(1.0f,2.0f,3.0f);
obj.addition(1);
obj.addition(1,2);
obj.main();
obj.main(10);
}
void main()
{
System.out.println("This is the main method with zero arguments");
}
void main(int x)
{
System.out.println("This is the main method with one arguments, its value is "+x);
}
}
