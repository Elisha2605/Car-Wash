import java.util.*;

public class WashSystem{

   Scanner s = new Scanner(System.in);
   
   private String washOption;
   private String errorMessage;
   private String receipt;

   public static void main(String[] args){
   
   WashCard Card1 = new WashCard("12345", 500.0);
   
   Customer[] customer = new Customer[10];
   
   customer[0] = new Customer("Tobias", "Svanholm V", "238493274", card);
   customer[1] = new Customer("Obias", "Svanholm V", "238493274", card);
   customer[2] = new Customer("Bias", "Svanholm V", "238493274", card);

   customer[0].getCustomerInfo();
   customer[1].getCustomerInfo();
   customer[2].getCustomerInfo();
   
   WashOption();
  
   
   }
   
   public static void WashOption(){
      Scanner s = new Scanner(System.in);
      System.out.println("Welcome to Super Shine");
      System.out.println("What type of car wash option would you like to purchase?");
      menuPrompt();
      int input = s.nextInt();
      
      switch (input){
      
      case 1:
         System.out.println("You have purchased a Standard option!");
         //Card1.getMoney() - 5
         break;
           
      case 2:
         System.out.println("You have purchased a Medium option");
         break;
         
      case 3:
         System.out.println("You have purchased a Luxury option");
         break;         
      } 
            
   }


public static void menuPrompt(){
   System.out.println("1: Standard 5$");
   System.out.println("2: Medium 10$");
   System.out.println("3: Luxury 15$");
   }
}