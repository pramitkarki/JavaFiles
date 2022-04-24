import java.util.Scanner;

class Shop{
    String shop_address, shop_name, shop_id;
    int shop_square_feet, rent_amount;
    
	//setter of shop details
	public void get_shop_details(String sa, String sn, String sid, int sst, int ra){
        this.shop_address=sa;
        this.shop_name=sn;
        this.shop_id = sid;
        this.shop_square_feet = sst;
        this.rent_amount = ra;
    }

    //getter of shop details
    public void show_shop(){
	System.out.println();
	System.out.println("Shop details::");
        System.out.println("Address is "+this.shop_address);
        System.out.println("name is "+this.shop_name);
        System.out.println("Shop id is "+this.shop_id);
        System.out.println("Shop area is "+this.shop_square_feet);
        System.out.println("Shop rent is "+this.rent_amount);
    }
}

// class Owner is inherited from class Shop
class Owner extends Shop{
    String name, address, phone_number;
    
    //setter of owner details
    public void get_owner(String name, String address, String phone_number){
        this.name = name;
        this.address = address;
        this.phone_number= phone_number;
    }

    //getter of owner details
    public void show_owner(){
	System.out.println();
	System.out.println("Owner details::");
        System.out.println("Owner's name is "+this.name);
        System.out.println("Owner's address is "+this.address);
        System.out.println("Owner's phone number is "+this.phone_number);

    }
}

// class customer is inherited from class owner making multilevel inheritance
public class customer extends Owner {
        public static void main(String args[]){

            Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the customer's interested location:");
            String cust_loc = sc.next();
            
	    Shop objs = new Shop();
            Owner objo = new Owner();
	    objs.get_shop_details("Kathmandu", "A2Z", "S01", 400, 15000);
            objo.get_owner("Pramit", "Bhaktapur", "+977-9860799297");

	    Shop objs1 = new Shop();
            Owner objo1 = new Owner();

	    objs1.get_shop_details("Kathmandu", "A3Z", "S02", 500, 18000);
            objo1.get_owner("Arpan", "Bhaktapur", "+977-9000000000");

	    Shop objs2 = new Shop();
            Owner objo2 = new Owner();

	    objs2.get_shop_details("Mumbai", "Game store", "S03", 350, 12000);
            objo2.get_owner("Mukesh", "Mumbai", "+91-9999999999");
          
            if (cust_loc.equals(objs.shop_address)){
                objs.show_shop();
                objo.show_owner();
            }
            if (cust_loc.equals(objs1.shop_address)){
                objs.show_shop();
                objo.show_owner();
            }
            if (cust_loc.equals(objs2.shop_address)){
                objs.show_shop();
                objo.show_owner();
            }

        }
        
    }
    

