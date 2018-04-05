import java.util.*;

public class WashSystem{

   static Scanner s = new Scanner(System.in);
   
   private String washOption;
   private String errorMessage;
   private String receipt;
   private static WashCard card1, card2, card3, card4, card5;
   private static Customer[] customer = new Customer[10];
   
   public static void main(String[] args){
   
   card1 = new WashCard("12345", 500.0);
   card2 = new WashCard("28374", 700.0);
   card3 = new WashCard("47583", 1000.0);
   card4 = new WashCard("47859", 200.0);
   card5 = new WashCard("38475", 400.0);
   
  
 
   
   
   customer[0] = new Customer("Tobias", "Ørnevej 33, 3422 NV", "238493274", card1);
   customer[1] = new Customer("Anna", "Rævehøjvej 74, 8354 Gentofte", "238493274", card2);
   customer[2] = new Customer("Lise", "Svanholm Vænge 43, 4596 Stenløse", "238493274", card3);
   customer[3] = new Customer("Claus", "Toftegårsvej 34, 1353 Ølstykke", "238493274", card4);
   customer[4] = new Customer("Jarl", "IT Boulevard 54, 2345", "238493274", card5);

   /*customer[0].getCustomerInfo();
   customer[1].getCustomerInfo();
   customer[2].getCustomerInfo();
   customer[3].getCustomerInfo();
   customer[4].getCustomerInfo(); */
   
   WashOption();
   
   }
   
   public static void WashOption(){
      Scanner s = new Scanner(System.in);
      System.out.println("Welcome to Super Shine");
      menuPromptOption();
      int input = s.nextInt();
      
      if(input == 1){
      menuPromptBuy();
      switchBuy();
      }
      else if(input == 2){
      depositPrompt();
      }
      else{
      System.out.println("Your balance on card ID " + card1.getID() + " is " + card1.getMoney());
      }
      
   }
      
      //Wash car option (menuprompt1)            
  
public static void menuPromptBuy(){
   System.out.println("What type of car wash option would you like to purchase?");
   System.out.println("1: Standard 50 kr.");
   System.out.println("2: Medium 100 kr.");
   System.out.println("3: Luxury 150 kr.");
}
   
public static void menuPromptOption(){
   System.out.println("Would you like to buy a car wash or deposit money on your wash card?");
   System.out.println("1: Car wash");
   System.out.println("2: Deposit money");
   System.out.println("3: Check balance");
   

}

public static void depositPrompt(){
   System.out.println("How much money would you like to deposit on your wash card?");
   int input2 = s.nextInt();
   card1.setMoney(card1.getMoney() + input2);
   System.out.println("You have now deposited " + input2 + " kr. on your wash card. " + "Your new balance is now " + card1.getMoney());   
   System.out.println();
   System.out.println("Would you like to have a receipt? (y/n)");
  
   String input3 = s.next();
   
   if(input3.equals("y")){
      printReceipt();
   }else{
      System.out.println("Thank you for your visit, see you soon!");
   }
  
  
  
   /*String input3 = s.next();
   switch (input3){
      case y:
         printReceipt();
         break;    
      
      case n:
         printReceipt();
         System.out.println("Thank you for your visit, see you soon!");
         break; 
  }  */
}
public static void switchBuy(){ 
   int input = s.nextInt();
   switch (input){
      case 1:
         System.out.println("You have purchased a Standard option!");
         card1.setMoney(card1.getMoney() - 50); 
         
         System.out.println("You have now " + card1.getMoney() + " kr. left on your WashCard");
         break;
           
      case 2:
         System.out.println("You have purchased a Medium option");
         card1.setMoney(card1.getMoney() - 100);
         
         System.out.println("You have now " + card1.getMoney() + " kr. left on your WashCard");
         break;
         
         
      case 3:
         System.out.println("You have purchased a Luxury option");
         card1.setMoney(card1.getMoney() - 150);
         
         System.out.println("You have now " + card1.getMoney() + " kr. left on your WashCard");
         break;         
   } 
}

public static void printReceipt(){
   customer[0].getCustomerInfo();
}

}