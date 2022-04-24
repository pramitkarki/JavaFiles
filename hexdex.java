//package com.company;
import java.util.Scanner;

public class hexdec {
    public static void main(String args[])
    {
        Scanner scan= new Scanner(System.in);
        int d,i=0;
        System.out.println("Enter the decimal number:");
        d=scan.nextInt();
        //b=scan.nextInt();
        int [] decimal= new int[20];
        int [] octal= new int[20];
        String [] hexa= new String[20];



        int b=d;

        while(b>0)
        {
          decimal[i]=b%2;
           // System.out.println(dummy[i]);
            b=b/2;
            i++;

           // System.out.println("value of a is"+i);

        }
        //System.out.println("Binary equivalent is: ");
//        for(int s=0;s<i;s++)
//        {
//            first[s]=decimal[i-s-1];
//            //System.out.print(dummy[s]);
//        }
        System.out.println("Binary equivalent is :");
        for(int s=i-1;s>=0;s--)
        {

            System.out.print(decimal[s]);
        }
        System.out.println("\n");

        int o=d,j=0;
        while(o>0)
        {
            octal[j]=o%8;
            o=o/8;
            j++;

        }
        System.out.println("Octal equivalent is :");
        for(int s=j-1;s>=0;s--)
        {

            System.out.print(octal[s]);
        }
        System.out.println("\n");


        int h=d,k=0;
        while(h>0)
        {
            int r=h%16;
            //System.out.println("The remainder is:"+r);

            if(r>=10)
            {
                switch (r)
                {
                    case 10:
                        hexa[k]="A";
                        break;
                    case 11:
                        hexa[k]="B";
                        break;
                    case 12:
                        hexa[k]="C";
                        break;
                    case 13:
                        hexa[k]="D";
                        break;
                    case 14:
                        hexa[k]="E";
                        break;
                    case 15:
                        hexa[k]="F";
                        break;
                }

            }
            else
            {
            hexa[k]=Integer.toString(r);
            }
            h=h/16;
            k++;

        }
        System.out.println("Hexadecimal equivalent is :");
        for(int s=k-1;s>=0;s--)
        {

            System.out.print(hexa[s]);
        }
        System.out.println("\n");

    }
}