package project_CoreJava;
class WBags {
    //luggage
    //laptop bag
    // casual bag
    //women

    //American Tourister women                        16                              18
    setData abw1 = new setData(2800, "Women Luggage bag ", "American Tourister");
    setData abw2 = new setData(2700, "Women laptop Bag  ", "American Tourister");
    setData abw3 = new setData(1850, "Women Casual bag  ", "American Tourister");
    //safari women
    setData sbw1 = new setData(2800, "Women Luggage bag ", "Safari            ");
    setData sbw2 = new setData(2700, "Women laptop Bag  ", "Safari            ");
    setData sbw3 = new setData(1850, "Women Casual bag  ", "Safari            ");
    //VIP women
    setData vbw1 = new setData(2800, "Women Luggage bag ", "VIP               ");
    setData vbw2 = new setData(2700, "Women laptop Bag  ", "VIP               ");
    setData vbw3 = new setData(1850, "Women Casual bag  ", "VIP               ");


    //American Tourister men                        16                              18
    setData abm1 = new setData(5800, "Men Luggage bag   ", "American Tourister");
    setData abm2 = new setData(7700, "Men laptop Bag    ", "American Tourister");
    setData abm3 = new setData(4850, "Men Casual bag    ", "American Tourister");
    //safari men
    setData sbm1 = new setData(5400, "Men Luggage bag   ", "Safari            ");
    setData sbm2 = new setData(8700, "Men laptop Bag    ", "Safari            ");
    setData sbm3 = new setData(6850, "Men Casual bag    ", "Safari            ");
    //VIP men
    setData vbm1 = new setData(2500, "Men Luggage bag   ", "VIP               ");
    setData vbm2 = new setData(2600, "Men laptop Bag    ", "VIP               ");
    setData vbm3 = new setData(6750, "Men Casual bag    ", "VIP               ");


    void mBag(String option){
        // char a = option.charAt(0);
       // char b = option.charAt(0);
        if (option.charAt(0)=='1') 
        {
            at_menBag(option.charAt(1));
        } 
        else if (option.charAt(0)=='2') 
        {
            s_menBag(option.charAt(1));
        }
        else if (option.charAt(0)=='3') 
        {
            v_menBag(option.charAt(1));
        }
        else
        {
            System.out.println("Invalid Input!!");
            welcome.welcome2();
        }
    }    

    void at_menBag(char c){
        switch (c) {
            // luggage AT
            case '1':
                System.out.println("Brand Name - " + abm1.getBrand());
                System.out.println("Model Name - " + abm1.getModel());
                System.out.println("Price - " + abm1.getPrice());
                System.out.println("About the Details -"+
                            "\n\u001a 360° Spinner, 8 Wheels - for smooth and effortless sliding\r\n" + //
                            "\u001a 3 YEARS GLOBAL WARRANTY- Travel worry free\r\n" + //
                            "\u001a Impact Resistant, Polypropylene zipped suitcase with fixed Three Digit Combination Lock for added security\r\n" + //
                            "\u001a Fully Lined interiors with tie-down straps");//details

                payment.option("abm1");
                break;

            // Laptop AT
            case '2':
                System.out.println("Brand Name - " + abm2.getBrand());
                System.out.println("Model Name - " + abm2.getModel());
                System.out.println("Price - " + abm2.getPrice());
                System.out.println("About the Details -"+
                            "\n\u001a 360° Spinner, 8 Wheels - for smooth and effortless sliding\r\n" + //
                            "\u001a 3 YEARS GLOBAL WARRANTY- Travel worry free\r\n" + //
                            "\u001a Impact Resistant, Polypropylene zipped suitcase with fixed Three Digit Combination Lock for added security\r\n" + //
                            "\u001a Fully Lined interiors with tie-down straps");//details

                payment.option("abm2");
                break;

            // casual AT
            case '3':
                System.out.println("Brand Name - " + abm3.getBrand());
                System.out.println("Model Name - " + abm3.getModel());
                System.out.println("Price - " + abm3.getPrice());
                System.out.println("About the Details -"+
                            "\n\u001a 360° Spinner, 8 Wheels - for smooth and effortless sliding\r\n" + //
                            "\u001a 3 YEARS GLOBAL WARRANTY- Travel worry free\r\n" + //
                            "\u001a Impact Resistant, Polypropylene zipped suitcase with fixed Three Digit Combination Lock for added security\r\n" + //
                            "\u001a Fully Lined interiors with tie-down straps");//detailsz

                payment.option("abm3");
                break;
            
            case 4:
                welcome.welcome2();
                break;

            default:
                System.out.println("Invalid Input!");
                welcome.welcome2();
                break;
        }
    }
    void v_menBag(char c){
        //VIP
        switch (c) {
            //Vip luggage 
            case '1':
                System.out.println("Brand Name - " + vbm1.getBrand());
                System.out.println("Model Name - " + vbm1.getModel());
                System.out.println("Price - " + vbm1.getPrice());
                System.out.println("About the Details -"+
                            "\n\u001a 360° Spinner, 8 Wheels - for smooth and effortless sliding\r\n" + //
                            "\u001a 3 YEARS GLOBAL WARRANTY- Travel worry free\r\n" + //
                            "\u001a Impact Resistant, Polypropylene zipped suitcase with fixed Three Digit Combination Lock for added security\r\n" + //
                            "\u001a Fully Lined interiors with tie-down straps");//details

                payment.option("vbm1");
                break;

            // vip laptop
            case '2':
                amazon.start();
                System.out.println("Brand Name - " + vbm2.getBrand());
                System.out.println("Model Name - " + vbm2.getModel());
                System.out.println("Price - " + vbm2.getPrice());
                System.out.println("\t\t\t\t\tAbout the Details -"+
                            "\n\t\t\t\t\u001a 360° Spinner, 8 Wheels - for smooth and effortless sliding\r\n" + //
                            "\t\t\t\t\u001a 3 YEARS GLOBAL WARRANTY- Travel worry free\r\n" + //
                            "\t\t\t\t\u001a Impact Resistant, Polypropylene zipped suitcase with fixed Three Digit Combination Lock for added security\r\n" + //
                            "\t\t\t\t\u001a Fully Lined interiors with tie-down straps");//details
                amazon.end();
                payment.option("vbm2");
                break;

            // vip casual
            case '3':
                System.out.println("\t\t\t\t\tBrand Name - " + vbm3.getBrand());
                System.out.println("\t\t\t\t\tModel Name - " + vbm3.getModel());
                System.out.println("\t\t\t\t\tPrice - " + vbm3.getPrice());
                System.out.println("\t\t\t\t\tAbout the Details -"+
                            "\n\t\t\t\t\t\u001a 360° Spinner, 8 Wheels - for smooth and effortless sliding\r\n" + //
                            "\t\t\t\t\t\u001a 3 YEARS GLOBAL WARRANTY- Travel worry free\r\n" + //
                            "\t\t\t\t\t\u001a Impact Resistant, Polypropylene zipped suitcase with fixed Three Digit Combination Lock for added security\r\n" + //
                            "\t\t\t\t\t\u001a Fully Lined interiors with tie-down straps");//details

                payment.option("vbm3");
                break;
            
            case 4:
                welcome.welcome2();
                break;

            default:
                System.out.println("Invalid Input!");
                welcome.welcome2();
                break;
        }    
    }
    
    void s_menBag(char c){
        //safari
        switch (c) {
            // safari luggage
            case '1':
                amazon.start();
                System.out.println("Brand Name - " + sbm1.getBrand());
                System.out.println("Model Name - " + sbm1.getModel());
                System.out.println("Price - " + sbm1.getPrice());
                System.out.println("\t\t\t\t\t\tAbout the Details -"+
                            "\n\t\t\t\t\t\u001a 360° Spinner, 8 Wheels - for smooth and effortless sliding\r\n" + //
                            "\t\t\t\t\t\u001a 3 YEARS GLOBAL WARRANTY- Travel worry free\r\n" + //
                            "\t\t\t\t\u001a Impact Resistant, Polypropylene zipped suitcase with fixed Three Digit Combination Lock for added security\r\n" + //
                            "\t\t\t\t\t\u001a Fully Lined interiors with tie-down straps");//details
                amazon.end();
                payment.option("abm1");
                break;

            // safari laptop
            case '2':
                amazon.start();
                System.out.println("\t\t\t\t\tBrand Name - " + sbm2.getBrand());
                System.out.println("\t\t\t\t\tModel Name - " + sbm2.getModel());
                System.out.println("\t\t\t\t\tPrice - " + sbm2.getPrice());
                System.out.println("\t\t\t\t\tAbout the Details -"+
                            "\n\t\t\t\t\t\u001a 360° Spinner, 8 Wheels - for smooth and effortless sliding\r\n" + //
                            "\t\t\t\t\t\u001a 3 YEARS GLOBAL WARRANTY- Travel worry free\r\n" + //
                            "\t\t\t\t\t\u001a Impact Resistant, Polypropylene zipped suitcase with fixed Three Digit Combination Lock for added security\r\n" + //
                            "\t\t\t\t\t\u001a Fully Lined interiors with tie-down straps");//details

                payment.option("sbm2");
                break;

            // safari casual
            case '3':
                amazon.start();
                System.out.println("\t\t\t\t\tBrand Name - " + sbm3.getBrand());
                System.out.println("\t\t\t\t\tModel Name - " + sbm3.getModel());
                System.out.println("\t\t\t\t\tPrice - " + sbm3.getPrice());
                System.out.println("\t\t\t\t\t\tAbout the Details -"+
                            "\n\t\t\t\t\t\u001a 360° Spinner, 8 Wheels - for smooth and effortless sliding\r\n" + //
                            "\t\t\t\t\t\u001a 3 YEARS GLOBAL WARRANTY- Travel worry free\r\n" + //
                            "\t\t\t\t\t\u001a Impact Resistant, Polypropylene zipped suitcase with fixed Three Digit Combination Lock for added security\r\n" + //
                            "\t\t\t\t\t\u001a Fully Lined interiors with tie-down straps");//details
                amazon.end();
                payment.option("sbm3");
                break;
            
            case 4:
                welcome.welcome2();
                break;

            default:
                System.out.println("Invalid Input!");
                welcome.welcome2();
                break;
        }
    }
}

class MBags extends WBags {

    //men
    //pasiing two digit num to mbag() 1st digit is brand and other is type of bag
    void mBag(String option){
        if (option.charAt(0)=='1') {
            //if checks the brand
            //switch checks the item 
            switch (option.charAt(1)) {
                // luggage AT
                case '1':
                    amazon.start();
                    System.out.println("\t\t\t\t\tBrand Name - " + abm1.getBrand());
                    System.out.println("\t\t\t\t\tModel Name - " + abm1.getModel());
                    System.out.println("\t\t\t\t\tPrice - " + abm1.getPrice());
                    System.out.println("\t\t\t\t\t\tAbout the Details -"+
                            "\n\t\t\t\t\t\u001a 360° Spinner, 8 Wheels - for smooth and effortless sliding\r\n" + //
                            "\t\t\t\t\t\u001a 3 YEARS GLOBAL WARRANTY- Travel worry free\r\n" + //
                            "\t\t\t\t\t\u001a Impact Resistant, Polypropylene zipped suitcase with fixed Three Digit Combination Lock for added security\r\n" + //
                            "\t\t\t\t\t\u001a Fully Lined interiors with tie-down straps");//details
                    amazon.end();
                    payment.option("abm1");
                    break;
    
                // Laptop AT
                case '2':
                    amazon.start();
                    System.out.println("\t\t\t\t\tBrand Name - " + abm2.getBrand());
                    System.out.println("\t\t\t\t\tModel Name - " + abm2.getModel());
                    System.out.println("\t\t\t\t\tPrice - " + abm2.getPrice());
                    System.out.println("\t\t\t\t\t\tAbout the Details -"+
                            "\n\t\t\t\t\t\u001a 360° Spinner, 8 Wheels - for smooth and effortless sliding\r\n" + //
                            "\t\t\t\t\t\u001a 3 YEARS GLOBAL WARRANTY- Travel worry free\r\n" + //
                            "\t\t\t\t\t\u001a Impact Resistant, Polypropylene zipped suitcase with fixed Three Digit Combination Lock for added security\r\n" + //
                            "\t\t\t\t\t\u001a Fully Lined interiors with tie-down straps");//details
                    amazon.end();
                    payment.option("abm2");
                    break;
    
                // casual AT
                case '3':
                    amazon.start();
                    System.out.println("\t\t\t\t\tBrand Name - " + abm3.getBrand());
                    System.out.println("\t\t\t\t\tModel Name - " + abm3.getModel());
                    System.out.println("\t\t\t\t\tPrice - " + abm3.getPrice());
                    System.out.println("\t\t\t\t\t\t\tAbout the Details -"+
                            "\n\t\t\t\t\u001a 360° Spinner, 8 Wheels - for smooth and effortless sliding\r\n" + //
                            "\t\t\t\t\t\u001a 3 YEARS GLOBAL WARRANTY- Travel worry free\r\n" + //
                            "\t\t\t\t\t\u001a Impact Resistant, Polypropylene zipped suitcase with fixed Three Digit Combination Lock for added security\r\n" + //
                            "\t\t\t\t\t\u001a Fully Lined interiors with tie-down straps");//details
                    amazon.end();
                    payment.option("abm3");
                    break;
                case '4':
                    welcome.welcome2();
                    break;
                default:
                    System.out.println("Invalid Input!");
                    welcome.welcome2();
                    break;
            }    
        } else if (option.charAt(0)=='2') {
            //safari
            switch (option.charAt(1)) {
                // safari luggage
                case '1':
                    amazon.start();
                    System.out.println("\t\t\t\t\tBrand Name - " + sbm1.getBrand());
                    System.out.println("\t\t\t\t\tModel Name - " + sbm1.getModel());
                    System.out.println("\t\t\t\t\tPrice - " + sbm1.getPrice());
                    System.out.println("\n\t\t\t\t\t\tAbout the Details -"+
                            "\n\t\t\t\t\t\u001a 360° Spinner, 8 Wheels - for smooth and effortless sliding\r\n" + //
                            "\t\t\t\t\t\u001a 3 YEARS GLOBAL WARRANTY- Travel worry free\r\n" + //
                            "\t\t\t\t\t\u001a Impact Resistant, Polypropylene zipped suitcase with fixed Three Digit Combination Lock for added security\r\n" + //
                            "\t\t\t\t\t\u001a Fully Lined interiors with tie-down straps");//details
                    amazon.end();
                    payment.option("abm1");
                    break;
    
                // safari laptop
                case '2':
                    amazon.start();
                    System.out.println("\t\t\t\t\tBrand Name - " + sbm2.getBrand());
                    System.out.println("\t\t\t\t\tModel Name - " + sbm2.getModel());
                    System.out.println("\t\t\t\t\tPrice - " + sbm2.getPrice());
                    System.out.println("\t\t\t\t\t\tAbout the Details -"+
                            "\n\t\t\t\t\t\u001a360° Spinner, 8 Wheels - for smooth and effortless sliding\r\n" + //
                            "\t\t\t\t\t\u001a3 YEARS GLOBAL WARRANTY- Travel worry free\r\n" + //
                            "\t\t\t\t\t\u001aImpact Resistant, Polypropylene zipped suitcase with fixed Three Digit Combination Lock for added security\r\n" + //
                            "\t\t\t\t\t\u001aFully Lined interiors with tie-down straps");//details
                    amazon.end();
                    payment.option("sbm2");
                    break;
    
                // safari casual
                case '3':
                    amazon.start();
                    System.out.println("\t\t\t\t\tBrand Name - " + sbm3.getBrand());
                    System.out.println("\t\t\t\t\tModel Name - " + sbm3.getModel());
                    System.out.println("\t\t\t\t\tPrice - " + sbm3.getPrice());
                    System.out.println("\t\t\t\t\t\tAbout the Details -"+
                            "\n\t\t\t\t\t\u001a360° Spinner, 8 Wheels - for smooth and effortless sliding\r\n" + //
                            "\t\t\t\t\t\u001a3 YEARS GLOBAL WARRANTY- Travel worry free\r\n" + //
                            "\t\t\t\t\t\u001aImpact Resistant, Polypropylene zipped suitcase with fixed Three Digit Combination Lock for added security\r\n" + //
                            "\t\t\t\t\t\u001aFully Lined interiors with tie-down straps");//details
                    amazon.end();
                    payment.option("sbm3");
                    break;
                case '4':
                    welcome.welcome2();
                    break;
                default:
                    System.out.println("Invalid Input!");
                    welcome.welcome2();
                    break;
            }    
        }else if (option.charAt(0)=='3') {
            //VIP
            switch (option.charAt(1)) {
                //Vip luggage 
                case '1':
                    amazon.start();
                    System.out.println("\t\t\t\t\tBrand Name - " + vbm1.getBrand());
                    System.out.println("\t\t\t\t\tModel Name - " + vbm1.getModel());
                    System.out.println("\t\t\t\t\tPrice - " + vbm1.getPrice());
                    System.out.println("\n\t\t\t\t\t\tAbout the Details -"+
                            "\n\t\t\t\t\t\u001a360° Spinner, 8 Wheels - for smooth and effortless sliding\r\n" + //
                            "\t\t\t\t\t\u001a3 YEARS GLOBAL WARRANTY- Travel worry free\r\n" + //
                            "\t\t\t\t\t\u001aImpact Resistant, Polypropylene zipped suitcase with fixed Three Digit Combination Lock for added security\r\n" + //
                            "\t\t\t\t\t\u001aFully Lined interiors with tie-down straps");//details
                    amazon.end();
                    payment.option("vbm1");
                    break;
    
                // vip laptop
                case '2':
                    amazon.start();
                    System.out.println("\t\t\t\t\tBrand Name - " + vbm2.getBrand());
                    System.out.println("\t\t\t\t\tModel Name - " + vbm2.getModel());
                    System.out.println("\t\t\t\t\tPrice - " + vbm2.getPrice());
                    System.out.println("\t\t\t\t\t\tAbout the Details -"+
                            "\n\t\t\t\t\t\u001a360° Spinner, 8 Wheels - for smooth and effortless sliding\r\n" + //
                            "\t\t\t\t\t\u001a3 YEARS GLOBAL WARRANTY- Travel worry free\r\n" + //
                            "\t\t\t\t\t\u001aImpact Resistant, Polypropylene zipped suitcase with fixed Three Digit Combination Lock for added security\r\n" + //
                            "\t\t\t\t\t\u001aFully Lined interiors with tie-down straps");//details
                    amazon.end();
                    payment.option("vbm2");
                    break;
    
                // vip casual
                case '3':
                    amazon.start();
                    System.out.println("\t\t\t\t\tBrand Name - " + vbm3.getBrand());
                    System.out.println("\t\t\t\t\tModel Name - " + vbm3.getModel());
                    System.out.println("\t\t\t\t\tPrice - " + vbm3.getPrice());
                    System.out.println("\n\t\t\t\t\t\tAbout the Details -"+
                            "\n\t\t\t\t\t\u001a 360° Spinner, 8 Wheels - for smooth and effortless sliding\r\n" + //
                            "\t\t\t\t\t\u001a 3 YEARS GLOBAL WARRANTY- Travel worry free\r\n" + //
                            "\t\t\t\t\t\u001a Impact Resistant, Polypropylene zipped suitcase with fixed Three Digit Combination Lock for added security\r\n" + //
                            "\t\t\t\t\t\u001a Fully Lined interiors with tie-down straps");//details
                    amazon.end();
                    payment.option("vbm3");
                    break;

                case '4':
                    welcome.welcome2();
                    break;

                default:
                    System.out.println("Invalid Input!");
                    welcome.welcome2();
                    break;
            }    
        }

        
    }
}


class Bags{
    void disp(String op, String mw){
        // to call the Mbag class method
        WBags w =new WBags();
        //upcasting
        WBags m = new MBags();        
        
        if (mw.equals("1")) 
        {
            //men
            
            m.mBag(op);

         } else if(mw.equals("2"))
        {
            //women
            w.mBag(op);
        } else{
            System.out.println("Invalid Input");
            welcome.welcome2();
        }
    }
}