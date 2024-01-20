import java.util.Scanner;

public class Mytel
{
    public static void main(String args[] )
    { 
    	
        Scanner s = new Scanner(System.in);
        while(true)
        {
        	System.out.println("Welcome To Mytel");
        	   System.out.println("____________________________________________________________________________________________________________________________________");
        	System.out.println("Enter 1 For Mobile Recharge");
        	System.out.println("Enter option 2 for pay bills ");
        	System.out.println("Enter option 3 to convert prepaid to postpaid / postpaid to prepaid");
        	System.out.println("Enter option 4 to know the balance ");
        	System.out.println("Enter option 5 for profile details");
        	System.out.println("Enter 0 to exit");

            int n = s.nextInt();
            switch (n)
            {
                case 1:
                	 System.out.println("Welcome To Mobile Recharge :");
                     
                	    
                	    Scanner myObj2 = new Scanner(System.in);  // Create a Scanner object
                	    System.out.println("Enter Prepaid number:");
                	    String enter2 = myObj2.nextLine();  // Read user input
//                	    System.out.println("You Have Enterred1 : " + enter2); 
                	    System.out.println("Choose One Package : ");
                	    
                	    System.out.println("Package 1");
                	    System.out.println("Amount 200 ");
                	    System.out.println("Validity 30 days");
                	    System.out.println("Data 3GB/day ");
                	    
                	    System.out.println("____________________________________________________________________________________________________________________________________");
                	    System.out.println("Package 2");
                	    System.out.println("Amount 300 ");
                	    System.out.println("Validity 30 days");
                	    System.out.println("Data 6GB/day ");
                	    
                	    Scanner packno = new Scanner(System.in);  // Create a Scanner object
                	    System.out.println("Enter the appropriate package number to proceed further");
                	    int pack = packno.nextInt();  // Read user input
                	    
                	    
                	    System.out.println("Enter Payment Details");
                	    System.out.println("____________________________________________________________________________________________________________________________________");
                	    Scanner packno1 = new Scanner(System.in);  // Create a Scanner object
                	    System.out.println("Enter debit card/credit card number: ");
                	    String pack1 = packno1.nextLine();  // Read user input

                	    Scanner packno3 = new Scanner(System.in);  // Create a Scanner object
                	    System.out.println("Enter Expiry date: ");
                	    String pack3 = packno3.nextLine();  // Read user input

                	    Scanner packno4 = new Scanner(System.in);  // Create a Scanner object
                	    System.out.println("Enter CVV number: ");
                	    String pack4 = packno4.nextLine();  // Read user input
                	    
                	    System.out.println("Congratulations...your recharge is successfully... ");
                	    
                	    System.out.println("____________________________________________________________________________________________________________________________________");

                		
                	    
                	    Scanner myObjj = new Scanner(System.in);  // Create a Scanner object
                	    System.out.println("Enter option 9 to go back to main options Enter 0 to exit");
                	    int enterr = myObjj.nextInt();  // Read user input
                	    if(enterr==0)
                 	    {
                 	    	 System.exit(0);
                 	    }
                	    
//                	    if(enterr==9 || enterr==0) //conditional statement
//                	    {
//                	    System.out.println("You Have Choosed Option : " + enterr); 
//                	    }
//                	    else {
//                	    	System.out.println("Invalid Option");
//                	    }
                	    break;
                	    
                case 2:
                    System.out.println("Welcome To Bill Pay:");
                    Scanner myObj0 = new Scanner(System.in);  // Create a Scanner object
                    System.out.println("Enter Post paid number: ");
                    String enter0 = myObj0.nextLine();  // Read user input
                    System.out.println("You Have Enterred1 : " + enter0); 
                    System.out.println("Bill due amount is 600 INR");
                    
                    System.out.println("Enter payment details: ");
                    Scanner myObj00 = new Scanner(System.in);  // Create a Scanner object
                    System.out.println("Enter debit card/credit card number:");
                    String enter00 = myObj00.nextLine();  // Read user input
                    System.out.println("You Have Enterred1 : " + enter00); 
                    
                    Scanner packno010 = new Scanner(System.in);  // Create a Scanner object
                    System.out.println("Enter Expiry date: ");
                    String pack010 = packno010.nextLine();  // Read user input
                    System.out.println("You Have Enterred : " + pack010); 
                    
                    Scanner packno012 = new Scanner(System.in);  // Create a Scanner object
                    System.out.println("Enter CVV number: ");
                    String pack012 = packno012.nextLine();  // Read user input
                    System.out.println("You Have Enterred : " + pack012);  
                    
                    System.out.println("Congratulations...your bill amount is paid successfully..  ");
                    
                    System.out.println("____________________________________________________________________________________________________________________________________");

            		
            	    
            	    Scanner myObjj1 = new Scanner(System.in);  // Create a Scanner object
            	    System.out.println("Enter option 9 to go back to main options Enter 0 to exit");
            	    int enterr1 = myObjj1.nextInt();  // Read user input
            	    if(enterr1==0)
             	    {
             	    	 System.exit(0);
             	    }
            	    break;
 
                case 3:
                    System.out.println("Welcome To Convertion (prepaid to postpaid / postpaid to prepaid) ");
                    

                  Scanner myOb = new Scanner(System.in);  // Create a Scanner object
                  System.out.println("Enter mobile number: ");
                  String enter01 = myOb.nextLine();  // Read user input
                  System.out.println("You Have Enterred : " + enter01); 
                 

                
                  Scanner myObj001 = new Scanner(System.in);  // Create a Scanner object
                  System.out.println("Enter option 6 to convert prepaid to post ");
                  System.out.println("Enter option 7 to convert post to prepaid ");
                  int ent = myObj001.nextInt();  // Read user input
              	   System.out.println("Congrats!!your request is received. Your new SIM will be delivered within 2 days to your address"); 	 

              	   
              	 System.out.println("____________________________________________________________________________________________________________________________________");

         		
         	    
         	    Scanner myObjj11 = new Scanner(System.in);  // Create a Scanner object
         	    System.out.println("Enter option 9 to go back to main options Enter 0 to exit");
         	    int enterr11 = myObjj11.nextInt();  // Read user input
         	   if(enterr11==0)
        	    {
        	    	 System.exit(0);
        	    }   
         	    break;
 
                
                case 4:
                    System.out.println("Welcome To Balance: ");
                    

                  Scanner myOb1 = new Scanner(System.in);  // Create a Scanner object
                  System.out.println("Enter mobile number: ");
                  String enter011 = myOb1.nextLine();  // Read user input
                  System.out.println("You Have Enterred : " + enter011); 
                  
                  Scanner myObb = new Scanner(System.in);  // Create a Scanner object
                  System.out.println("Balance: ");
                  String enter001 = myObb.nextLine();  // Read user input
                  System.out.println("SMS : 30" ); 
                  System.out.println("Talktime : unlimited " ); 
                  System.out.println("Data : 1.GB " ); 
                  
                  System.out.println("____________________________________________________________________________________________________________________________________");

           		
           	    
           	    Scanner myObjj111 = new Scanner(System.in);  // Create a Scanner object
           	    System.out.println("Enter option 9 to go back to main options Enter 0 to exit");
           	    int enterr111 = myObjj111.nextInt();  // Read user input
           	 if(enterr111==0)
      	    {
      	    	 System.exit(0);
      	    }
                  break;

                case 5:
          	      System.out.println("Profile Details");
          	      

          	    Scanner myOb11 = new Scanner(System.in);  // Create a Scanner object
          	    System.out.println("Enter mobile number: ");
          	    String enter0111 = myOb11.nextLine();  // Read user input
          	    System.out.println("Name :  Rahul "); 
          	    System.out.println("Address: Ameerpet, Hyderabad"); 
          	    
          	  System.out.println("____________________________________________________________________________________________________________________________________");

         		
         	    
         	    Scanner myObjj1111 = new Scanner(System.in);  // Create a Scanner object
         	    System.out.println("Enter option 9 to go back to main options Enter 0 to exit");
         	    int enterr1111 = myObjj1111.nextInt();  // Read user input
         	    if(enterr1111==0)
         	    {
         	    	 System.exit(0);
         	    }
                break;
                  
                case 0:
                System.exit(0);
                break;
            }
        }
    }
}