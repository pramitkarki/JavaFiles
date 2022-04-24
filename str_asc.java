import java.util.Scanner;

class str_asc {
    public static void main(String args[]){

    String []a=new String[3];

     for(int i=0;i<3;i++)
     {
         a[i] = args[i];

     }

        char f1=a[0].charAt(0);
        char f2=a[1].charAt(0);
        char f3=a[2].charAt(0);
//        System.out.println(f1);
//        System.out.println(f2);
//        System.out.println(f3);
        System.out.println("The input in the alphabetical order is:");

        if(f1<f2 && f1<f3)
        {
            System.out.println(a[0]);
            if(f2<f3)
            {
                System.out.println(a[1]);
                System.out.println(a[2]);
            }
            else
            {
                System.out.println(a[2]);
                System.out.println(a[1]);
            }
        }
        else if(f2<f1 && f2<f3)
        {
            System.out.println(a[1]);
            if(f1<f3)
            {
                System.out.println(a[0]);
                System.out.println(a[2]);
            }
            else
            {
                System.out.println(a[2]);
                System.out.println(a[0]);
            }
        }
        else
        {
            System.out.println(a[2]);
            if(f1<f2)
            {
                System.out.println(a[0]);
                System.out.println(a[1]);
            }
            else
            {
                System.out.println(a[1]);
                System.out.println(a[0]);
            }
        }

}
}