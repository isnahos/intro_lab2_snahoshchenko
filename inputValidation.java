package EECS1030;

import java.util.InputMismatchException;
import java.util.Scanner;
public class inputValidation {
    public static String username,password,phoneNumber;
    public static Scanner input = new Scanner(System.in);
    public static int IDNumber,choice;
    public static short amountPurchased;
    public static String [] choices = new String[] {"Chocolate Chip Cookie","Potato Chips","Gatorade",
                                                    "Chocolate Bar","Peanut Butter Sandwich", "Granola Bar",
                                                    "Bottled Water", "Soda Pop"};
    public static double [] price = new double[] {2.00, 1.50, 1.00, 1.35, 4.50, 0.75, 1.25, 6.00};



    //-------------DO EDIT BETWEEN EXCEPT FOR DELETING COMMENTS------
    public static void main(String args[])
    {
        Menu();
        System.out.println("---------Welcome to the School Cafeteria!----------");
        
        //UsernameCheck();
       
       
        	System.out.print("Please enter your username: ");
        	username = input.next();
        	
        while ((!username.matches("[a-zA-Z]*"))||(username.equals(""))){
        	System.out.print("Please enter a valid username: ");
        	username = input.next();
        	
        }

        
         
        System.out.print("Please enter your password: ");
        password = input.next();
        
        while ((!password.matches("[a-zA-Z-0-9]*"))||(password.equals(""))){
        	System.out.print("Please enter a valid password: ");
        	password= input.next();
        	
        }
        
        PasswordCheck();
        
        System.out.print("Please enter your 9 digit ID number: ");
        
        	do {
        		try {
        			IDNumber = input.nextInt();
        			if (String.valueOf(IDNumber).length() !=9) {
        				System.out.print("Please enter a valid ID number : ");
        				
        			}
        			
        		} catch(InputMismatchException e) {
        			System.out.print("Please enter a valid ID number : ");
        			input.next();
        			
        		}
        		
        	} while(String.valueOf(IDNumber).length() !=9);
        		
        
        PhoneNumberCheck();
        
        System.out.print("Please enter your phone number as XXX-XXX-XXXX : " );
        phoneNumber = input.next();
        while ((!phoneNumber.matches("\\d{3}-\\d{3}-\\d{4}"))||phoneNumber.equals("")) {
        	System.out.print("Please enter a valid phone number as XXX-XXX-XXXX : ");
        	phoneNumber = input.next();
        	
        }
        
        


       
        DisplayInfo();
        Menu();
        SelectionChoice();
       /* System.out.println("Please select your choices : ");
        choice = input.nextInt();
        
        
        while ((!(choice>=0 &&choice<=8))){
        	System.out.print("Please enter a valid choice: ");
        	choice= input.nextInt();
        	
        }*/
        System.out.println("Please select your choices : ");
      do {
    		try {
    			choice= input.nextInt();
    			if (!(choice>=1) &&(choice<=8)) {
    				System.out.print("Please make an appropiate selection : ");
    				
    			}
    			
    		} catch (InputMismatchException e) {
    			System.out.print("Please make an appropiate selection : ");
    			input.next();
    			
    		}
    		
    	} while(!(choice>=0) && (choice<=8));
        
        
     if ((choice>=0) && (choice<=8)) {System.out.println("Your selection was : "+choice+") "+ choices[choice-1]);
      System.out.println("Each "+choices[choice-1]+" costs : $"+price[choice-1]);
        
     }
        
        
        
       /* if (!(choice>=0 &&choice<=8)) {
        	System.out.print("Please make an appropriate selection: ");
        	choice = input.nextInt();
        	
        }
        
        else if (choice >=0 &&choice<=8) {

            System.out.println("Your selection was : "+choice+") "+ choices[choice-1]);
            System.out.println("Each "+choices[choice-1]+" costs : $"+price[choice-1]);
            
        	
        }*/
        
      PurchaseChoice();
        System.out.println("");
        
        System.out.print("How many would you like to purchase: ");
        
        do {
    		try {
    			amountPurchased = input.nextShort();
    			if (!(amountPurchased>0 &&amountPurchased<=20)||amountPurchased==0) {
    				System.out.print("Please enter an appropriate amount of items : ");
    				
    			}
    			
    		} catch (InputMismatchException e) {
    			System.out.print("Please enter an appropriate amount of items : ");
    			input.next();
    			
    		}
    		
    	} while(!(amountPurchased>0 &&amountPurchased<=20)||amountPurchased==0);
        
        

                System.out.println("You want to purchase : " +amountPurchased);
                System.out.println("");
                System.out.println("Your total will be: $"+amountPurchased*price[choice-1]);
        		
        	}
        	
        

       
       /* System.out.println("");
        
        System.out.print("How many would you like to purchase: ");
        PurchaseChoice();

        System.out.println("You want to purchase : " +amountPurchased);
        System.out.println("");
        System.out.println("Your total will be: $"+amountPurchased*price[choice-1]);*/
        
  // }

    //-------DO EDIT BETWEEN EXCEPT FOR DELETING COMMENTS-------

    public static void UsernameCheck()
    {
    }

    public static void PasswordCheck()
    {
    }

    public static void IDNumberCheck()
    {
    }

    public static void PhoneNumberCheck()
    {
    }

    public static void SelectionChoice()
    {
    }

    public static void PurchaseChoice ()
    {
    }

    public static void DisplayInfo()
    {
        System.out.println("Your valid username is : " + username);
        System.out.println("Your valid password is : " + password);
        System.out.println("Your valid ID number is : "+IDNumber);
        System.out.println("Your valid PhoneNumber is : "+phoneNumber);

    }

    public static void Menu()
    {
        System.out.println("------Please make a selection!------");
        System.out.println("1) Chocolate Chip Cookie    5) Peanut Butter Sandwich");
        System.out.println("2) Potato Chips             6) Granola Bar");
        System.out.println("3) Gatorade	            7) Bottled Water");
        System.out.println("4) Chocolate Bar            8) Soda Pop");
        System.out.print("Selection: ");
    }
}