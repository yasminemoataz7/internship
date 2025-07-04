
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yasmi
 */
public class cart {
    ArrayList<itemsincart> items=new ArrayList<>();
    void add(product product,int quantity){
    if(quantity<=product.quantity){
    items.add(new itemsincart(product,quantity));
    product.quantity-=quantity; //hshel mn al stock al f class product
    System.out.print ("added into cart successfully");
    }
    else{
    System.out.print("not available in stock");
    }
    }
    void checkout(customer customer){
    if(items.isEmpty()){
    System.out.print("no items in the cart the cart is empty");
    
    }
    double ordersubtotal= 0;//sum of all items bs mngher shipping
    double shippingfee=60;
   for(itemsincart item:items){
       product product = null;
       if(item.quantity>product.quantity){ //check item item lw hwa out of stock
       System.out.print(product.name +"is out of stock");
       }
      ordersubtotal+=product.price * item.quantity; 
   }
   double paidamount=ordersubtotal+shippingfee;
   if(customer.balance<paidamount){
       System.out.println("customer's balance insuffient");
   }else{
   customer.balance-=paidamount;
   }
   System.out.println("**checkout reciept**");
     System.out.println();
      System.out.println("-------------------------------------");
       System.out.println("subtotal:   "+ordersubtotal);
        System.out.println("shipping:   "+shippingfee);
         System.out.println("amount:    "+paidamount);
    }
    
    
    
    
    
}
