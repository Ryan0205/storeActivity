 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package store.activity;

import java.util.Scanner;


public class StoreActivity {
// NFT PRICES
   int MutantApe = 15;
   int MarketDucks = 12;
   int Punks = 50;
   int Hape = 13;
   int BoredApe = 78;
   int Doodles = 10;
   int ch;
   int quantity;
   static int total;
   String again;
   Scanner sc = new Scanner(System.in);
   
  
    public static void main(String[] args) 
    {
        System.out.println("*****************WELCOME TO OUR NFT MARKETPLACE*****************");
        System.out.println("================================================================");
        System.out.println("                 1.MutantApe         15/-");
        System.out.println("                 2.MarketDucks       12/-");
        System.out.println("                 3.Punks             50/-");
        System.out.println("                 4.Hape              13/-");
        System.out.println("                 5.BoredApe          78/-");
        System.out.println("                 6.Doodles           10/-");
        System.out.println("                 7.Exit                  ");
        System.out.println("================================================================");
        System.out.println("               What Do You Want to Order Today??");
}// OUR NFT MARKET IS READY
   public void generateBill()
   {
       System.out.println();
       System.out.println("*****************Thankyou for ordering*****************");
       System.out.println("****************Your Bill is:" + total+"*****************");
   }
    
    public void order(){
        while (true) {
        System.out.println("Enter Your Choice: ");
        ch = sc.nextInt();
        switch(ch) {
          
            case 1://MutantApe
            System.out.println("You have selected MutantApe");
            System.out.println();
            System.out.println("Enter the desired quantity");
            quantity = sc.nextInt();
            total = total + quantity * MutantApe;

                break;
                
                case 2://MarketDucks
            System.out.println("You have selected MarketDucks");
            System.out.println();
            System.out.println("Enter the desired quantity");
            quantity = sc.nextInt();
            total = total + quantity * MarketDucks;

                break;
                
                case 3://Punks
            System.out.println("You have selected Punks");
            System.out.println();
            System.out.println("Enter the desired quantity");
            quantity = sc.nextInt();
            total = total + quantity * Punks;

                break;
                
                case 4://Hape
            System.out.println("You have selected Hape");
            System.out.println();
            System.out.println("Enter the desired Quantity");
            quantity = sc.nextInt();
            total = total + quantity * Hape;

                break;
                
                case 5://BoredApe
            System.out.println("You have selected BoredApe");
            System.out.println();
            System.out.println("Enter the desired quantity");
            quantity = sc.nextInt();
            total = total + quantity * BoredApe;

                break;
                
                case 6://Doodles
            System.out.println("You have selected Doodles");
            System.out.println();
            System.out.println("Enter the desired quantity");
            quantity = sc.nextInt();
            total = total + quantity * Doodles;

                break;
                case 7://Exit
                    System.exit(1);
                    break;
                    
            default:
                break;
            
        }
        
        System.out.println();
        System.out.println("Do you want to order anything else (Y/N) : ");
        again = sc.next();
        if(again.equalsIgnoreCase("Y"))
        {order();}
        else if (again.equalsIgnoreCase("N"))
        {generateBill();
        System.exit(1);}
        else{System.out.println("invalid Choice");} 
        }

    }
    }


