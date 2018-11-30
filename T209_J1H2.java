import java.util.*;

public class T209_J1H2 {

public static void main (String[]agrs){
	
	Scanner scan = new Scanner(System.in);
	
	int input = 0;
	int input2 = 0;
	int regis = 0;
	int qty = 0;
	
	String name = new String();
	String user = new String();
	String pass= new String();
	String address = new String();
	String type = new String();
	String size = new String();
	String topping = new String();
	
	Vector<String>vecName=new Vector<String>();
	Vector<String>vecUser=new Vector<String>();
	Vector<String>vecPass=new Vector<String>();
	Vector<String>vecAddress=new Vector<String>();
	Vector<String>vecType=new Vector<String>();
	Vector<String>vecSize=new Vector<String>();
	Vector<Integer>vecQty=new Vector<Integer>();
	
		//System.out.println("   _____ _           _    _");
		//System.out.println("  // ____| |         | |  (_)");
		//System.out.println(" | |    | |__   ___ | | ___");
		//System.out.println(" | |    | '_ \ // _ \| |// // |");
		//System.out.println(" | |____| | | | (_) |   <| |");
		//System.out.println("  \_____|_| |_|\___//|_|\_\_|____ _");
		//System.out.println(" |  __ \     | (_)        // ____| |");
		//System.out.println(" | |  | | ___| |___   __ | (___ | |__   ___  _ __");
		//System.out.println(" | |  | |// _ \ | \ \ // //  \___ \| '_ \ // _ \| '_ \");
		//System.out.println(" | |__| |  __// | |\ V //   ____) | | | | (_) | |_) |");
		//System.out.println(" |_____// \___|_|_| \_//   |_____//|_| |_|\___//| .__//");
		//System.out.println("                                            | |");
		//System.out.println("                                            |_|");
		//System.out.println("1. Login");
		//System.out.println("2. Register");
		//System.out.println("3. Exit");

	do{
	System.out.println("Choose: ");
	input=scan.nextInt(); scan.nextLine();
	} while(input<1 || input > 3);
		
	switch (input){
		case 1:
		do{
			System.out.println("1. Add New Item");
			System.out.println("2. View Item(s)");
			System.out.println("3. Update Item(s)");
			System.out.println("4. Checkout");
			System.out.println("5. Exit");
			System.out.println("Choose: ");
			input2=scan.nextInt();
		}while (input2 < 1 && input2 > 5);
		
		if (input2 == 1){
			do{
				System.out.println("Input type of chocolate[White|Plain|Dark]: ");
			type = scan.nextLine();
		}while(!type.equals("White") && !type.equals("Plain") && !type.equals("Dark"));
			
			do{
				System.out.println("Input size of chocolate[Small|Medium|Large]: ");
			size = scan.nextLine();
		}while(!type.equals("Small") && !type.equals("Medium") && !type.equals("Large"));
			
			do{
				System.out.println("Input topping[Oreo|Cheese|Peanut|Jam]: ");
			topping = scan.nextLine();
		}while(!type.equals("Oreo") && !type.equals("Cheese") && !type.equals("Peanut")&& !type.equals("Jam"));
		
		do{
		System.out.println("How many quantity[must be greater than 0]: ");
		qty = scan.nectInt();
		}while(qty <0);
		
		System.out.println("System Transaction Success!");
		
		vecType.add(type);
		vecSize.add(size);
		vecTopping.add(topping);
		
		
		}else if (input2 == 2){
			if(vecName.size()<=0)
				{
					System.out.println("No data");
				}
				else{
					for(int i=0;i<vecName.size();i++){
						System.out.println("Hello, A A");
						System.out.println("===============================================================");
						System.out.println("Transaction No. "+(i+1));
						System.out.println("===============================================================");
						System.out.println("Type of chocolate               : "+vecType.get(i));
						System.out.println("Price of chocolate              : "+vecPrice.get(i));
						System.out.println("Size of chocolate               : "+vecSize.get(i));
						System.out.println("Topping                         : "+vecTopping.get(i));
						System.out.println("Price of topping                : "+vecPriceTopping.get(i));
						System.out.println("Quantity                        : "+vecQty.get(i));
						System.out.println("===============================================================");
					}
				}
			
			
		}
		
		break;
		
		case 2:
		if (regis==0){
		//System.out.println("   _____ _           _    _");
		//System.out.println("  // ____| |         | |  (_)");
		//System.out.println(" | |    | |__   ___ | | ___");
		//System.out.println(" | |    | '_ \ // _ \| |// // |");
		//System.out.println(" | |____| | | | (_) |   <| |");
		//System.out.println("  \_____|_| |_|\___//|_|\_\_|____ _");
		//System.out.println(" |  __ \     | (_)        // ____| |");
		//System.out.println(" | |  | | ___| |___   __ | (___ | |__   ___  _ __");
		//System.out.println(" | |  | |// _ \ | \ \ // //  \___ \| '_ \ // _ \| '_ \");
		//System.out.println(" | |__| |  __// | |\ V //   ____) | | | | (_) | |_) |");
		//System.out.println(" |_____// \___|_|_| \_//   |_____//|_| |_|\___//| .__//");
		//System.out.println("                                            | |");
		//System.out.println("                                            |_|");
		
		
		System.out.print("Input your name[must be 2 words]: ");
		name=scan.nextLine();
		
		do{
		System.out.print("Input Username[must be between 5..15 characters]: ");
		user=scan.nextLine();
		}
		while(user.size() < 5 || user.size() > 15);
		
		System.out.print("Input Password[must be alphanumeric, exp: ryan@123  or ryan123]:");
		pass=scan.nextLine();
		
		do{
		System.out.print("Input Address[must be ended with Street]:");
		address=scan.nextLine();
		}while(address.substring(0, 6).equals("Street"));
		
		System.out.println("Register Success!!");
		
		vecName.add(name);
		vecUser.add(user);
		vecPass.add(pass);
		vecAddress.add(address);
		
		regis == 1;
		}
		else{
			System.out.println("You Already Registered!");
			
		}
		break;
		
		case 3:
		break;
	}
	


}
}