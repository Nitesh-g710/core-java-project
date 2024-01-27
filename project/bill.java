package project_CoreJava;
class bill {
    private static double totalSum=0;
    //if user go purchase and buy then it will generate the invoice for i created ifelse condition for that , if user choose purchase then it will get true and called the recipt() method frpm thankyou() method and generate the total amount 
    // static Boolean p_bill = false;

    void setTotal(double totalSum){
        this.totalSum = totalSum;
    }
    static double getTotal(){
        return totalSum;
    }

    //showcart() is calling
    static void receipt(String option){
        //if user directly try to go in purchase without adding to cart the product it will add the current product into the cart
        if (cart.cartName.size() >= 0 ) {
            //bill.p_bill = true;
            cart.cart(option);
        }
        
        //this get total addition of product from cart
        for (Object obj : cart.cartPrice) {
            totalSum = totalSum + (double)obj;
        }

        //invoice
        System.out.println("\t\t\t\t\t\t\t  Invoice\n");
        cart.bill();
    }
}