/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class JavaApplication3 {
    public static Scanner input = new Scanner(System.in);
    public static String again;
    public static int choose,quantity=1;
    public static double total=0,pay;
    public static void menu(){
    System.out.println("   !!!     WELCOME TO HUBHUB    !!!   ");
    System.out.println(" ===================================  ");
    System.out.println("              HUBHUB MENU            ");
    System.out.println("   1. Palabok              Php. 45.00 ");
    System.out.println("   2. Burger               Php. 40.00 ");
    System.out.println("   3. Pizza                Php. 95.00 ");
    System.out.println("   4. French Fries         Php  30.00 ");
    System.out.println("   5. Choko meelk          Php. 25.00 ");
    System.out.println(" ==================================== ");
    System.out.println("         LIMITED Hubhub PROMO        ");
    System.out.println(" 6. P1-Pizza with Choko meelk and burger  Php. 120.00 ");
    System.out.println(" 7. P2-Pizza with wings             Php. 90.00  ");
    System.out.println(" 8. Cancel                             ");
    System.out.println(" ====================================  ");
    System.out.println("               DISCOUNTS               ");
    System.out.println(" 1. If total cost is Php 2000+ - 8%         ");
    System.out.println(" 2. If total cost is Php 1000+ - 3%         ");
    System.out.println(" ====================================  ");
    }
   public static void order(){
    System.out.println(" Press 1 for Palabok             ");
    System.out.println(" Press 2 for Burger          ");
    System.out.println(" Press 3 for Pizza              ");
    System.out.println(" Press 4 for French Fries       ");
    System.out.println(" Press 5 for Choko meelk  ");
    System.out.println(" Press 6 for promo 1   ");
    System.out.println(" Press 7 for promo 2   ");
    System.out.println(" Press 8 to cancel     ");
    System.out.println(" Enter your order:        ");
    choose = input.nextInt();
        switch (choose) {
            case 1:
                System.out.println(" You choose Palabok ");
                System.out.print(" How many Donuts you want to Buy? :");
                quantity =input.nextInt();
                total = total +(quantity*45);
                System.out.println(" Total cost: Php " + total);
                System.out.println("  ");
                System.out.println(" You want to buy another order? ");
                
                System.out.println(" Press 1 for Yes and 2 for No : ");
                again = input.next();
                if(again.equalsIgnoreCase("1")){
                    order();
                    }else{
                    System.out.println("   ");
                    System.out.println(" Php "+ total + " is your total cost ");
                    if (total>=2000){
                        System.out.println("  ");
                        System.out.println(" You have 8% discount ");  
                        double discount=total*.92;
                        System.out.println(" Your new total cost is Php " + discount +" *discounted " );
                        System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();{
                    if(pay < discount){
                     do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=discount){
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                           total = pay-discount;
                        System.out.println(" Your change is Php " + total);                      
                        break;  }
                        }while(true);}
                       else if (pay >=discount){
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                        total = pay-discount;
                        System.out.println(" Your change is Php " + total);                        
                        break; } break; }
                    }
                else if (total>=1000 && total<=1999){
                    System.out.println(" You have 3% discount ");
                         double discount=total*.97;
                        System.out.println(" Your new total cost is Php " + discount + " *discounted " );
                        System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();{
                     if(pay <discount){
                        do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=discount){         
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                           total = pay-discount;
                        System.out.println(" Your change is Php " + total);                       
                        break;}
                        }while(true);}
                       else if (pay >=discount){
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                        total = pay-discount;
                        System.out.println(" Your change is Php " + total);        
                        break;}  break; }
                    }
                else if (total<=999){
                    System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();    
                    if(pay < total){
                         do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=total){        
                        System.out.println(" Total price is Php " + total);
                        System.out.println(" I received Php "+pay);
                           total = pay-total;
                        System.out.println(" Your change is Php " + total);         
                        break; }
                        }while(true);  }
                       else if (pay >=total){        
                        System.out.println(" Total price is Php " + total);
                        System.out.println(" I received Php "+pay);
                           total = pay-total;
                        System.out.println(" Your change is Php " + total);
                        break;}break; }
                    }
               case 2:
                System.out.println(" You choose Burger ");
                System.out.print(" How many Ice cream you want to Buy? : ");
                quantity =input.nextInt();
                total = total +(quantity*40);
                System.out.println(" Total cost: Php " + total);
                System.out.println("  ");
                System.out.println(" You want to buy another order? ");
                System.out.println(" Press 1 for Yes and 2 for No : ");
                again = input.next();
                if(again.equalsIgnoreCase("1")){
                    order();
                }else{
                    System.out.println("   ");
                    System.out.println(" Php "+ total + " is your total cost ");
                    if (total>=2000){
                        System.out.println("  ");
                        System.out.println(" You have 8% discount "); 
                        double discount=total*.92;
                        System.out.println(" Your new total cost is Php " + discount + " *discounted ");
                        System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();{
                    if(pay < discount){
                          do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=discount){        
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                           total = pay-discount;
                        System.out.println(" Your change is Php " + total);    
                        break;}
                        }while(true);}
                       else if (pay >=discount){    
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                        total = pay-discount;
                        System.out.println(" Your change is Php " + total);   
                        break; } break;}
                    }
                else if (total>=1000 && total<=1999){
                    System.out.println(" You have 3% discount ");
                        double discount=total*.97;
                        System.out.println(" Your total discounted cost is Php " + discount + " *discounted " );
                        System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();{
                     if(pay <discount){
                          do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=discount){        
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                           total = pay-discount;
                        System.out.println(" Your change is Php " + total);   
                        break; }
                        }while(true); }
                        else if (pay >=discount){
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                        total = pay-discount;
                        System.out.println(" Your change is Php " + total);  
                        break;} break;}
                    }
                 else if (total<=999){
                        System.out.println(" Enter a payment: ");
                        pay = input.nextDouble();
                         if(pay <total){
                        do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=total){        
                        System.out.println(" Total price is Php " + total);
                        System.out.println(" I received Php "+pay);
                           total = pay-total;
                        System.out.println(" Your change is Php " + total);   
                        break;}
                        }while(true);}
                       else if (pay >=total){
                        System.out.println(" Total price is Php " + total);
                        System.out.println(" I received Php "+pay);
                           total = pay-total;
                        System.out.println(" Your change is Php " + total);
                        break;  }break;}
                   }
                
            case 3:
                System.out.println(" You choose Pizza  ");
                System.out.print(" How many Pizza you want to Buy? :");
                quantity =input.nextInt();
                total = total +(quantity*95);
                System.out.println(" Total cost: Php " + total);
                System.out.println("  ");
                System.out.println(" You want to buy another order? ");
                System.out.println(" Press 1 for Yes and 2 for No : ");
                again = input.next();
                if(again.equalsIgnoreCase("1")){
                    order();
                }else{
                    System.out.println("   ");
                    System.out.println(" Php "+ total + " is your total cost ");
                    if (total>=2000){
                        System.out.println("  ");
                        System.out.println(" You have 8% discount ");
                        double discount=total*.92;
                        System.out.println(" Your new total cost is Php " + discount +" *discounted " );
                        System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();{
                    if(pay < discount){
                        do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=discount){        
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                           total = pay-discount;
                        System.out.println(" Your change is Php " + total);  
                        break;}
                       }while(true); }
                       else if (pay >=discount){
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                        total = pay-discount;
                        System.out.println(" Your change is Php " + total); 
                        break;} break; }
                    }
                else if (total>=1000 && total<=1999){
                    System.out.println(" You have 3% discount ");  
                        double discount=total*.97;
                        System.out.println(" Your new total cost is Php " + discount + " *discounted " );
                        System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();{
                     if(pay < discount){ 
                        do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=discount){         
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                           total = pay-discount;
                        System.out.println(" Your change is Php " + total);   
                        break;}
                        }while(true); }
                     else if (pay >=discount){    
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                        total = pay-discount;
                        System.out.println(" Your change is Php " + total); 
                        break;   }  break; }
                    }
                else if (total<=999){
                    System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();   
                    if(pay < total){ 
                        do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=total){         
                        System.out.println(" Total price is Php " + total);
                        System.out.println(" I received Php "+pay);
                           total = pay-total;
                        System.out.println(" Your change is Php " + total);
                        break;}
                        }while(true); }
                       else if (pay >=total){    
                        System.out.println(" Total price is Php " + total);
                        System.out.println(" I received Php "+pay);
                           total = pay-total;
                        System.out.println(" Your change is Php " + total);     
                        break; }break;}
                    }
            case 4:
               System.out.println(" You choose French Fries ");
                System.out.print(" How many French Fries you want to Buy? :");
                quantity =input.nextInt();
                total = total +(quantity*30);
                System.out.println(" Total cost: Php " + total);
                System.out.println("  ");
                System.out.println(" You want to buy another order? "); 
                System.out.println(" Press 1 for Yes and 2 for No : ");
                again = input.next();
                if(again.equalsIgnoreCase("1")){
                    order();
                }else{
                    System.out.println("   ");
                    System.out.println(" Php "+ total + " is your total cost ");
                    if (total>=2000){
                        System.out.println("  ");
                        System.out.println(" You have 8% discount ");
                        double discount=total*.92;
                        System.out.println(" Your new total cost is Php " + discount +" *discounted " );
                        System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();{
                    if(pay < discount){
                        do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=discount){        
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                          total = pay-discount;
                        System.out.println(" Your change is Php " + total); 
                        break; }
                        }while(true);   }
                     else if (pay >=discount){     
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                        total = pay-discount;
                        System.out.println(" Your change is Php " + total);
                        break; }  break; }
                    }
                else if (total>=1000 && total<=1999){
                    System.out.println(" You have 3% discount ");
                        double discount=total*.97;
                        System.out.println(" Your new total cost is Php " + discount + " *discounted " );
                        System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();{
                     if(pay < discount){
                        do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=discount){         
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                           total = pay-discount;
                        System.out.println(" Your change is Php " + total); 
                        break; }
                        }while(true); }
                     else if (pay >=discount){    
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                        total = pay-discount;
                        System.out.println(" Your change is Php " + total);  
                        break;  }  break; }
                    }
                else if (total<=999){ 
                    System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();   
                    if(pay < total){ 
                        do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=total){         
                        System.out.println(" Total price is Php " + total);
                        System.out.println(" I received Php "+pay);
                          total = pay-total;
                        System.out.println(" Your change is Php " + total);    
                        break;  }
                        }while(true);}
                       else if (pay >=total){      
                        System.out.println(" Total price is Php " + total);
                        System.out.println(" I received Php "+pay);
                           total = pay-total;
                        System.out.println(" Your change is Php " + total);  
                        break;  } break; } 
                    }
            case 5:
               System.out.println(" You choose Choko meelk ");
                System.out.print(" How many Chocolate Cookies you want to Buy? :");
                quantity =input.nextInt();
                total = total +(quantity*25);
                System.out.println(" Total cost: Php " + total);
                System.out.println("  ");
                System.out.println(" You want to buy another order? "); 
                System.out.println(" Press 1 for Yes and 2 for No : ");
                again = input.next();
                if(again.equalsIgnoreCase("1")){
                    order();}else{
                    System.out.println("   ");
                    System.out.println(" Php "+ total + " is your total cost ");
                    if (total>=2000){
                        System.out.println("  ");
                        System.out.println(" You have 8% discount ");
                        double discount=total*.92;
                        System.out.println(" Your new total cost is Php " + discount +" *discounted " );
                        System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();{
                    if(pay < discount){
                        do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=discount){        
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                           total = pay-discount;
                        System.out.println(" Your change is Php " + total); 
                        break; }
                        }while(true); }
                     else if (pay >=discount){  
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                        total = pay-discount;
                        System.out.println(" Your change is Php " + total);
                        break;}  break;     } }
                else if (total>=1000 && total<=1999){
                    System.out.println(" You have 3% discount ");
                        double discount=total*.97;
                        System.out.println(" Your new total cost is Php " + discount + " *discounted " );
                        System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();{
                     if(pay < discount){
                        do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=discount){        
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                           total = pay-discount;
                        System.out.println(" Your change is Php " + total); 
                        break; }
                        }while(true); }
                     else if (pay >=discount){      
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                        total = pay-discount;
                        System.out.println(" Your change is Php " + total);
                        break; }  break;   }
                    }
                else if (total<=999){ 
                    System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();  
                    if(pay < total){
                        do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=total){       
                        System.out.println(" Total price is Php " + total);
                        System.out.println(" I received Php "+pay);
                           total = pay-total;
                        System.out.println(" Your change is Php " + total);
                        break;  }
                        }while(true);  }
                       else if (pay >=total){     
                        System.out.println(" Total price is Php " + total);
                        System.out.println(" I received Php "+pay);
                           total = pay-total;
                        System.out.println(" Your change is Php " + total);
                        break;    } break; }
                    }
                case 6:
                System.out.println(" You choose P1-Pizza with Choko meelk and burger ");
                System.out.print(" How many P1-Pizza with Choko meelk and burger you want to Buy? :");
                quantity =input.nextInt();
                total = total +(quantity*120);
                System.out.println(" Total cost: Php " + total);
                System.out.println("  ");
                System.out.println(" You want to buy another order? ");
                System.out.println(" Press 1 for Yes and 2 for No : ");
                again = input.next();
                if(again.equalsIgnoreCase("1")){
                    order();
                }else{
                    System.out.println("   ");
                    System.out.println(" Php "+ total + " is your total cost ");
                    if (total>=2000){
                        System.out.println("  ");
                        System.out.println(" You have 8% discount ");
                        double discount=total*.92;
                        System.out.println(" Your new total cost is Php " + discount +" *discounted " );
                        System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();{
                    if(pay < discount){
                        do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=discount){         
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                           total = pay-discount;
                        System.out.println(" Your change is Php " + total);
                        break; }
                        }while(true);}
                     else if (pay >=discount){   
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                        total = pay-discount;
                        System.out.println(" Your change is Php " + total);
                        break;  }  break; }
                   }
                else if (total>=1000 && total<=1999){
                    System.out.println(" You have 3% discount ");  
                        double discount=total*.97;
                        System.out.println(" Your new total cost is Php " + discount + " *discounted " );
                        System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();{
                     if(pay < discount){  
                        do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=discount){          
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                           total = pay-discount;
                        System.out.println(" Your change is Php " + total);
                        break; }
                        }while(true);  }
                     else if (pay >=discount){    
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                        total = pay-discount;
                        System.out.println(" Your change is Php " + total); 
                        break; } break; }
                    }
                else if (total<=999){
                    System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();   
                    if(pay < total){
                        do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=total){        
                        System.out.println(" Total price is Php " + total);
                        System.out.println(" I received Php "+pay);
                           total = pay-total;
                        System.out.println(" Your change is Php " + total);
                        
                        break;}
                        }while(true); }
                       else if (pay >=total){    
                        System.out.println(" Total price is Php " + total);
                        System.out.println(" I received Php "+pay);
                           total = pay-total;
                        System.out.println(" Your change is Php " + total);
                        
                        break;   } break; }
                }
                case 7:
                System.out.println(" You choose P2-Pizza with wings ");
                System.out.print(" How many P2-Pizza with wings you want to Buy? :");
                quantity =input.nextInt();
                total = total +(quantity*90);
                System.out.println(" Total cost: Php " + total);
                System.out.println("  ");
                System.out.println(" You want to buy another order? ");
                System.out.println(" Press 1 for Yes and 2 for No : ");
                again = input.next();
                if(again.equalsIgnoreCase("1")){
                    order();
                }else{
                    System.out.println("   ");
                    System.out.println(" Php "+ total + " is your total cost ");
                    if (total>=2000){
                        System.out.println("  ");
                        System.out.println(" You have 8% discount "); 
                        double discount=total*.92;
                        System.out.println(" Your new total cost is Php " + discount +" *discounted " );
                        System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();{
                    if(pay < discount){
                        do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=discount){         
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                           total = pay-discount;
                        System.out.println(" Your change is Php " + total);
                        break;     }
                        }while(true);   }                      
                     else if (pay >=discount){   
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                        total = pay-discount;
                        System.out.println(" Your change is Php " + total);  
                        break; } break; }
                    }
                else if (total>=1000 && total<=1999){
                    System.out.println(" You have 3% discount ");
                        double discount=total*.97;
                        System.out.println(" Your new total cost is Php " + discount + " *discounted " );
                        System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();{
                     if(pay < discount){
                        do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=discount){        
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                           total = pay-discount;
                        System.out.println(" Your change is Php " + total); 
                        break; }
                        }while(true); }
                     else if (pay >=discount){   
                        System.out.println(" Total price is Php " + discount);
                        System.out.println(" I received Php "+pay);
                        total = pay-discount;
                        System.out.println(" Your change is Php " + total);
                        break; }   break;}
                    }
                else if (total<=999){
                    System.out.println(" Enter a payment: ");
                    pay = input.nextDouble();    
                    if(pay < total){
                        do{
                        System.out.println(" Not enough payment!!! ");
                        System.out.println(" Enter payment again: ");
                        pay = input.nextDouble();
                        if (pay>=total){        
                        System.out.println(" Total price is Php " + total);
                        System.out.println(" I received Php "+pay);
                           total = pay-total;
                        System.out.println(" Your change is Php " + total);
                        break;}
                        }while(true); }
                       else if (pay >=total){  
                        System.out.println(" Total price is Php " + total);
                        System.out.println(" I received Php "+pay);
                           total = pay-total;
                        System.out.println(" Your change is Php " + total);
                         break; }  break; }
                }
                 case 8:
                    System.exit(0);    
                default:      
            break;         }
       System.out.println(" Transaction complete...");
       System.out.println(" Thankyou for buying! ");
       System.out.println(" ");
       System.out.println(" For next customer press 1: ");
       System.out.println(" To exit press 2: ");
                again = input.next();
                if(again.equalsIgnoreCase("1")){
                    total=total-total;
                    order();    }
                else{
                    System.exit(0);}
   }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menu();
        order();
    }
    
}
