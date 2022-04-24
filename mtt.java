import java.io.*;
import java.util.*;

// class ParseData extends Thread {
//     Thread t1;

//     public Thread1(String name) {
//         t1 = new Thread(this, name);
//         t1.start();
//     }
// }

class DataFormat{
    private String name;
    private Integer played;
    private Integer won;
    private Integer lost;
    private Integer drawn;

    // getters
    public String getName(){ return name; }

    public Integer getPlayed(){ return played; }
    
    public Integer getWon(){ return won; }
    
    public Integer getLost(){ return lost; }
    
    public Integer getDrawn(){ return lost; }
    
    //setters
    public void setName(String name){
        this.name = name;
    }

    public void setPlayed(Integer played){
        this.played = played;
    }

    public void setWon(Integer won){
        this.won = won;
    }

    public void setLost(Integer lost){
        this.lost = lost;
    }
    public void setDrawn(Integer drawn){
        this.drawn = drawn;
    }

    // constructor

    public DataFormat() {}

    public DataFormat(String name, Integer played, Integer won, 
            Integer lost, Integer drawn){
        
        this.name = name;
        this.played = played;
        this.won = won;
        this.lost = lost;
        this.drawn = drawn;
    }

    public DataFormat(String str){
        int start = 0;

        if( Character.isAlphabetic(str.charAt(2)) ){
            start = 3;
            this.name = str.substring(0, start);

        }else if (Character.isAlphabetic(str.charAt(1)) ){
            start = 3;
            this.name = str.substring(0, start - 1);
        }
        
        Integer vals[] = new Integer[4];
        int counter = 0;

        for(int i = start; i < str.length(); i += 2){
            if(i + 3 <= str.length()){
                vals[counter] = Integer.parseInt(str.substring(i, i + 2) );
            }else{
                vals[counter] = Integer.parseInt(str.substring(i) );
                break;
            }
            counter++;
        }

        this.played = vals[0];
        this.won = vals[1];
        this.lost = vals[2];
        this.drawn = vals[3];
    }

    @Override
    public String toString() {
        return "DataFormat [name = " + name + ", played = " + played + 
            ", won = " + won + ", lost = " + lost + ", drawn ="
                + drawn + "]";
    }
    
}

class MultiThread extends Thread{
    ArrayList<DataFormat> data;

    public MultiThread(){
        data = null;
    }

    public MultiThread(ArrayList<DataFormat> data){
        this.data = data;
    }


    synchronized public void showMin(){
        int minWon = (int) 1e9;

        for(DataFormat d : data){
            if(d.getWon() < minWon){
                minWon = d.getWon();
            }
        }

        // teams with minimum won is
        System.out.println("\nTeams with minimum number of wins : ");

        for(DataFormat d : data){
            if(d.getWon() == minWon){
                System.out.println(d.toString());
            }
        }

    }

    synchronized public void show45Point(){
        int minWon = (int) 1e9;

        System.out.println("\nTeams who got 45 points are ");

        for(DataFormat d : data){
            if(d.getWon()*2 + d.getDrawn() == 45){
                System.out.println(d.toString());
            }
        }
    }

}

public class mtt {

    public static ArrayList<DataFormat> parseData(String fileName){
        ArrayList<DataFormat> data = new ArrayList<>();

        try(
            DataInputStream dis = new DataInputStream(new FileInputStream(fileName));
        ){
            int ch;
            char prev = 0;
            char now;
            
            StringBuilder sb = new StringBuilder();

            while( (ch = dis.read()) != -1){
                now = (char) ch;

                if(prev != 0){
                    if(prev >= '0' && prev <= '9'){
                        if(now >= 'A' && now <= 'Z'){
                            data.add( new DataFormat(sb.toString()) );
                            
                            sb.setLength(0);
                        }
                    }
                }

                sb.append(now);

                prev = (char)ch;
            }
        }catch(IOException e){
            e.printStackTrace();
        }

        return data;
    }

    public static void main(String args[]) {
    
        ArrayList<DataFormat> data = parseData("JPL.txt");

        data.forEach(System.out::println);

        MultiThread thObj = new MultiThread(data);

        Thread t1 = new Thread(new Runnable() {
            
            public void run(){
                thObj.showMin();
            }
        });

        Thread t2 = new Thread(new Runnable(){

            public void run(){
                thObj.show45Point();
            }
        });

        t1.start();

        t2.start();

        try{
            t1.join();
            t2.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}