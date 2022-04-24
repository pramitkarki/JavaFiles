import java.io.*;
import java.util.*;


class lab4{
    public static void main(String args[]){

 

        try{
            FileInputStream fis = new FileInputStream("JPL.txt");
            Scanner sc = new Scanner(fis);
            String team[] = new String[100];
            int won_team[] = new int[10];
            int tie_team[] = new int[10];
            int points[] = new int[10];
            
            int j = 1;

            while(sc.hasNextLine()){
                String line = sc.nextLine();
                String arr[] = line.split(" +");
                //String no_matches = arr[1];
                String no_won = arr[2];
                //String no_lost = arr[3];
                String no_tie = arr[4];
                
                if( j % 8 == 1 ){
                    team[1] = arr[0];
                    won_team[1] += Integer.parseInt(no_won);
                    tie_team[1] += Integer.parseInt(no_tie);
                }

                if( j % 8 == 2 ){
                    team[2] = arr[0];
                    won_team[2] += Integer.parseInt(no_won);
                    tie_team[2] += Integer.parseInt(no_tie);
                }

                if( j % 8 == 3 ){
                    team[3] = arr[0];
                    won_team[3] += Integer.parseInt(no_won);
                    tie_team[3] += Integer.parseInt(no_tie);
                }

                if( j % 8 == 4 ){
                    team[4] = arr[0];
                    won_team[4] += Integer.parseInt(no_won);
                    tie_team[4] += Integer.parseInt(no_tie);
                }

                if( j % 8 == 5 ){
                    team[5] = arr[0];
                    won_team[5] += Integer.parseInt(no_won);
                    tie_team[5] += Integer.parseInt(no_tie);
                }

                if( j % 8 == 6 ){
                    team[6] = arr[0];
                    won_team[6] += Integer.parseInt(no_won);
                    tie_team[6] += Integer.parseInt(no_tie);
                }

                if( j % 8 == 7 ){
                    team[7] = arr[0];
                    won_team[7] += Integer.parseInt(no_won);
                    tie_team[7] += Integer.parseInt(no_tie);
                }

                if( j % 8 == 0 ){
                    team[8] = arr[0];
                    won_team[8] += Integer.parseInt(no_won);
                    tie_team[8] += Integer.parseInt(no_tie);
                }
                j++;
            }
            int max = 9999;
            int wins = 0;

             for(int z = 1 ; z<=9; z++){
                 points[z] = won_team[z]*2 + tie_team[z];
                
                 if(won_team[z] < max){
                max = won_team[z];
                wins = z;
             }
             }

            System.out.println("The team with minimum wins is: "+ team[wins]+"\nThe number of wins is "+ won_team[wins]);
            System.out.println("The total points of minimum winner is: " + points[wins]);
            

            for(int z = 1 ; z<=9; z++){
                if( points[z] == 45 ){
                    System.out.println("\nThe team with 45 points in two years is: "+ team[z]+" with points "+ points[z] );
                }
            }
        }catch(FileNotFoundException e){System.out.println(e);}
    }
}