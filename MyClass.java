import java.util.Scanner;
class Company{
    public int getProfit(){
        return 0;
    }
}
class CompanyA extends Company{
    public int getProfit(){
        return 10000;
    }
}

class CompanyB extends Company{
    
    CompanyB(){
    System.out.println("Child constructor");	
}
    public int getProfit(){
        return 90000;
    }
}

class MyClass {
    public static void main(String args[]) {
        CompanyA obA = new CompanyA();
        System.out.println("The profit of CompanyA is "+obA.getProfit());
        
        CompanyB obB = new CompanyB();
        System.out.println("The profit of CompanyB is "+obB.getProfit());
        
    }
}