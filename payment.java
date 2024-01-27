package project_CoreJava;
import java.util.*;

class payment  {
    //if user purchase then it get true and genrate the bill and empty the cart after purchase
    boolean buy =false;
    //to store cart size 
    int countCart =0;
    // Credential1 credential = new Credential1();
    welcome w = new welcome();
    //class cart object to inherit the methods
    cart cart1 = new cart();
    // int cartsize = cart1.cartName.size();
    
    
    static String c_option ;
    static void option(String C_option){
        //if the user direct go to buy with add to cart then this will hold the current option which user has been choose
        //used in thankyou() method
        c_option = C_option;

        //class cart object to inherit the methods
        // phones p3 = new phones(); 

        //create the variable to store card values and to campare with stored values
        String cardName ;
        String eDate;
        long cardNo;

        //passing the values to set the card values (predefine)
        Credential1 c = new Credential1("CBI", 1234, "071024");

        //subIndex
        System.out.println("1. Purchase");
        System.out.println("2. Add to Cart");
        System.out.println("3. Show Cart");
        System.out.println("4. Back");
        System.out.println("5. Exit");

        // take input for process
        Scanner scan = new Scanner(System.in);
        int S_op = scan.nextInt();

        //comparing with above options
        if (S_op == 1) 
        {
            System.out.println("please select the Payment method");
            System.out.println("1. Cash");
            System.out.println("2. Gpay");
            System.out.println("3. Debit Card / Credit card ");
            System.out.println("Choose the payment mode - ");
            int pay = scan.nextInt();
            switch (pay) {
                case 1:
                    thankyou();
                    
                    welcome.welcome2();
                    break;
                case 2:
                    System.out.println("Please pay on below bank details.");
                    System.out.println("Company Name: ICICIC Bank");
                    System.out.println("Account Number: 3628364734");
                    System.out.println("IFSC: ICICIC3747787"); 
                    System.out.println("\t\t 1. Done Payment\t\t 2. Payment Failed");
                    int a = scan.nextInt();
                    if (a==1) {
                        thankyou();
                    } else if(a==2){
                        System.out.println("Payment Failed!!!!");
                        System.out.println("Please enter the details correctly!!!");
                        option(null);
                    }
                    break;
                case 3:
                    System.out.println("Please enter the cards details to proceed further!!");
                    System.out.println("(Note: Date format is DDMMYY.)");
                    System.out.println("(E.g.  CardName - CBI ,CardNo -  1234 ,E-Date - 071024 )");
                    
                    //make a card credentials to compare with user card details
        
                    System.out.println("Enter Card Name : ");
                    cardName = scan.next();                    
                    c.setcardName("CBI");
                    System.out.println("Enter Card Number : ");
                    c.setcardNo(1234);
                    cardNo = scan.nextLong();
                    c.setDate("071024");
                    System.out.println("Enter Expiry Date : ");
                    eDate = scan.next();
                    

                    if ((c.getcardName()).equals(cardName) && c.getcardNo() == cardNo && c.getcardDate().equals(eDate)) {
                        thankyou();
                    }else{
                        System.out.println("Wrong Credentionals\n");
                        System.out.println("Payment Process Cancelled");
                        welcome.welcome2();
                    }
                    break;            
                default:
                    System.out.println("please choose the right option!...");
                    welcome.welcome2();
                    break;
            }
        }
         else if(S_op == 2) 
        {
            // add to cart 
            // if (countCart == 0) {
                //     System.out.println("Cart is Empty!");
                //     w.welcome2();
                // }
                // else
                // cartsize = cart1.sizeList();
                // if (cartsize >= 0) {
                    
                    // adding to cart
                    //System.out.println(C_option);
                    cart.cart(c_option);
                    cart.addCart();
                
            // }else{
                //alrady change the cart to dyanamic so i can add mant item as i want neeed to delete this section
            //     System.out.println("You can only add two phones to card");
            //     w.welcome2();
            // }
        } else if(S_op == 3) 
        {
            cart.showCart();
            //Show Cart

            // if (countCart ==0) {
            //     System.out.println("Cart is Empty!");
            //     System.out.println("Lets purchase !");
            //     w.welcome2();
            // } else 
            // cart cart1 = new cart();

            //all the cart size must be same so storing the one cart length in var and comparing with other list to check whether so also have the same size of list or not if it the same size then it will enter 

            // cart.cartName.size();

            
            // else if(cart.cartName.size()==cartsize && cart.cartModel.size()==cartsize && cart.cartPrice.size()==cartsize){
                
            //     //print entire cart
            //     cart.showCart();

            //     System.out.println("1. Back");
            //     int a = scan.nextInt();
            //     if (a==1) {
            //         // option(C_option);
            //         welcome.welcome2();
            //     }else{
            //         System.out.println("Invalid option!\nPlease choose the right option!!");
            //         welcome.welcome2();
            //     }
            // }

            //ingore below code this login changed 
            // if(countCart ==1){
            //     System.out.println("Product 1 :");
            //     System.out.println(cart1.cartmodel+"\n"+cart1.cartname1+"\n"+cart1.cartprice1);
                
            //     System.out.println("1. Back");
            //     int a = scan.nextInt();
            //     if (a==1) {
            //         option();
            //     }else{
            //         System.out.println("Wrong option!");
            //         w.welcome2();
            //     }

            // }
            // else if(countCart ==2){
            //     System.out.println(cart1.cartmodel2+"\n"+cart1.cartname2+"\n"+cart1.cartprice2);

            //     System.out.println("1. Back");
            //     int a = scan.nextInt();
            //     if (a==1) {
            //         option();
            //     }else{
            //         System.out.println("Wrong option!");
            //         w.welcome2();
            //     }
            // }
        }
        else if(S_op == 4) 
        {
            //remove cart methods
            //welcome class obj is already created
            welcome.welcome2();
        }  
         else if(S_op == 5) 
        {
            exit();
        }
        // scan.close();
    }

    
    static void thankyou(){
        System.out.println("Thank you for purchase!!");
        System.out.println("Your Packet will get delivered in 3-4 days.");
        System.out.println("Payment Mode is Cash & it will get recevied on Delivery. ");
        amazon.start();
        System.out.println("\n\t\t\t\t\t\t  Computer Generated Bill: ");
        // bill.p_bill=true;
        bill.receipt(c_option);
        exit();
        
    }
    static void failed(){
        System.out.println("Payment Failed!!!!");
        System.out.println("Please enter the details correctly!!!");
        welcome.welcome2();
    }

    static void exit(){
        System.exit(0);
    }

    // void removeCart(){

    // }

    // void showCart(){
    //     //Print the all cart values
    //             for (int i = 0; i <= cart1.sizeList(); i++) {
    //                 System.out.println(i+". "+cart1.cartName.get(i)+"\n\t"+cart1.cartModel.get(i)+"\n\t"+cart1.cartPrice.get(i));
    //             }
    // }


}
