import java.util.Scanner;
import java.lang.*;

public class java_lab1{

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    public void odd(){
        for(int i= 1 ; i < n ; i++){
            if(i%2==1)
            {
            System.out.println("The odd number between 1 to "+n+" is "+i);
            }
        }
    }

    public void even(){
        for(int i= 1 ; i < n ; i++){
            if(i%2==0)
            {
            System.out.println("The even number between 1 to "+n+" is "+i);
            }
        }
    }

    public void armstrong(){
        for(int i =1 ; i < n ; i ++){
            int temp = i;
            int temp2 = i;
            int dig = 0;

            while(temp >0){
                temp /=10;
                dig++;
            }

            int sum = 0;
            while(temp2 > 0){
                int rem = temp2 %10;
                sum += Math.pow(rem,dig);
                temp2 /= 10;
            }

            if(sum == i) System.out.println("The armstrong number between 1 to "+n+" is "+sum);

        }
    }

public static void main(String args[]){

    java_lab1 inp = new java_lab1();

    Thread Odd = new Thread(new Runnable(){
    public void run(){
        inp.odd();
    }
    });

    Thread Even = new Thread(new Runnable(){
        public void run(){
            inp.even();
        }
        });

    Thread Armstrong = new Thread(new Runnable(){
        public void run(){
            inp.armstrong();
        }
        });

    Odd.start();
    Even.start();
    Armstrong.start();
}
}
