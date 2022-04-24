//static variable, member function and block
import java.util.Scanner;
class update
{
int counter;
static int counter_with_static;
static int static_block_count;
update()
{
counter=-1;
counter_with_static=-1;
System.out.println("in constructor counter value is"+counter);
System.out.println("in constructor counter with static value is "+counter_with_static);
}
static //alw
{
Scanner s=new Scanner(System.in);
//counter_with_static=1; //no issue
//counter_with_static=Integer.parseInt(args[0]); //error
counter_with_static=Integer.parseInt(s.next());
System.out.println("in static block, counter with static value is "+counter_with_static);
static_block_count++;
System.out.println(static_block_count+" static block");
}
static
{
counter_with_static=100;
System.out.println("in static block, counter with static value is "+counter_with_static);
static_block_count++;
System.out.println(static_block_count+" static block");
}
void increment_puls1()
{
counter++; //no issues to execute this stmt
counter_with_static++;
}
static
{
counter_with_static=100;
System.out.println("in static block, counter with static value is "+counter_with_static);
static_block_count++;
System.out.println(static_block_count+" static block");
}
static void increment_puls1_static()
{
//counter++; //error
counter_with_static++;
}
//public static void main(String args[])
static public void main(String args[])
{
update obj=new update();
obj.counter=10;
obj.counter_with_static=10;
System.out.println("Obj counter value is "+obj.counter);
obj.increment_puls1();
System.out.println("Obj counter with static value is "+obj.counter_with_static);
obj.increment_puls1_static();
increment_puls1_static();//will this show the error?--no issues to execute this stmt
System.out.println("Obj counter value is "+obj.counter);
System.out.println("Obj counter with static value is "+counter_with_static);
update obj1=new update();
obj1.counter=20;
obj1.counter_with_static=20;
System.out.println("Obj1 counter value is "+obj1.counter);
System.out.println("Obj counter with static value is "+obj1.counter_with_static);
update obj2=new update();
obj2.counter=30;
obj2.counter_with_static=30;
System.out.println("Obj2 counter value is "+obj2.counter);
System.out.println("Obj counter with static value is "+obj2.counter_with_static);
//System.out.println(counter); //error non-static, without the help of object you can;t access-->
System.out.println(counter_with_static); //since its static, this can accessed, don't required object to refer the variable
System.out.println(obj.counter_with_static);
System.out.println(obj1.counter_with_static);
obj1.increment_puls1_static();
System.out.println(obj2.counter_with_static);
}
static
{
counter_with_static=100;
System.out.println("in static block, counter with static value is "+counter_with_static);
static_block_count++;
System.out.println(static_block_count+" static block");
}
}