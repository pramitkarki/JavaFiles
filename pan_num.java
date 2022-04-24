import java.util.Scanner;

class pan_exep extends Exception{
    public String message;

    public pan_exep(String message){
        super(message);
        this.message = message;
    }

    public String getMessage(){
        return this.message;
    }

}

class pan_num {

    public static boolean pan_chk(String str, String hold) throws pan_exep{
        if(str.length() != 10){
            throw new pan_exep("PAN number should be of length 10");
        }

        for (int i = 0; i < 3; i++) {
            if( !(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') ){
                throw new pan_exep("First three number should be alphabets");
            }
        }

        char acpt[] = {'A', 'B', 'C', 'F', 'G', 'H', 'I', 'J', 'L', 'P'};
        boolean third_chk = false;
        
        for (int i = 0; i < acpt.length; i++) {
            if(str.charAt(3) == acpt[i]){
                third_chk = true;
                break;
            }
        }
        
        if(!third_chk){
            throw new pan_exep("4th character should be A, B, C, F, G, H, I, J, L, P");
        }

        String[] Names = hold.split("\\s+");

        if(Names.length != 2)
            throw new pan_exep("Wrong name format");
        
        boolean Ind = false;

        if(str.charAt(4) == Character.toUpperCase(Names[0].charAt(0)) ){}
        
        else if (str.charAt(4) == Character.toUpperCase(Names[1].charAt(0)) )
            Ind = true;
        
	else
            throw new pan_exep("Name initial does not match with fifth character");

        return Ind;
    }   

    public static void main(String[] args) throws pan_exep{

        Scanner sc = new Scanner(System.in);       
        System.out.print("PAN number : ");
        String Pan_inp = sc.next();
        Pan_inp = Pan_inp.toUpperCase(); 
        sc.nextLine(); 
        System.out.print("Person Name : ");
        String hold = sc.nextLine();
        boolean Ind;

        sc.close();

        try{    
            Ind = pan_chk(Pan_inp, hold);

            System.out.println("\nThis might be a valid PAN number");
                
            if(Ind)
                System.out.println("\nIt belongs to an indivisual");
            else
                System.out.println("\nIt belongs to a non-indivisual");
            
        }
	catch(pan_exep e){
            System.out.println(e.getMessage());
        }

    }
}