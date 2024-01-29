package project_CoreJava;
import java.util.*;

class welcome extends cart {
    int M_value;
    // Scanner scan = new Scanner(System.in);

    void welcome1() {

        {
            welcome.patten.display();
        }
        System.out.println("\t\t\t\tWelcome to our virtual store!!!");
        System.out.println("\t\t\t\t  we have all kind for stuff! ");
        welcome2();
    }

    static void welcome2() {

        int key = 0;
        // to call the Shoes() class method
        Shoes s = new Shoes();

        // to call the Books class method
        Books book = new Books();


        // to call the WBag class method
        // WBags w = (WBags) m;

        Scanner scan = new Scanner(System.in);
        phones ph = new phones();
        // starting pattern
        amazon.start();
        System.out.println("\t\t\t\t\t\t\tPlease Choose the categry!!");
        System.out.println(
                "\n\t\t\t\t 1. Electronics \t\t\t 2.Shoes \n\n\t\t\t\t 3. Books \t\t\t\t 4. Bags \n\n\t\t\t\t 5.Cart ");
        // bottom pattern
        amazon.end();

        System.out.println("Enter the number - ");
        key = scan.nextInt();
        // to call phoen class methods for features

        if (key == 1) {
            amazon.start();
            System.out.println("\t\t\t\t\t\t    Please Choose the Brand!!");
            System.out.println("\n\t\t\t\t 1. Xiaomi \t\t\t\t 2. OnePlus \n\n\t\t\t\t 3. iPhone \t\t\t\t 4. Oppo \n\n\t\t\t\t 5. back");
            amazon.end();
            System.out.println("\n\t\t\t\t\tEnter the Sr. no - ");
            System.out.print("\t\t\t\t\t\t");
            String Ph_value = scan.next();
            System.out.println();

            switch (Ph_value) {

                case "1":
                    // Mi model
                    amazon.start();
                    System.out.println("\t\t\t\t\t\t\tPlease Choose the Mi Model!!");
                    System.out.println("\n\t\t\t\t 1. Mi 12 \t\t\t 2. Mi 12C \n\n\t\t\t\t 3. Mi 11X \t\t\t 4. Back");
                    amazon.end();
                    System.out.println("\n\t\t\t\tEnter the option - ");
                    System.out.print("\t\t\t\t\t");
                    int a1 = scan.nextInt();
                    System.out.println();
                    ph.miFeat(a1);
                    break;

                case "2":
                    // Oneplus model
                    amazon.start();
                    System.out.println("\t\t\t\t\t\t\tPlease Choose the Oneplus Model!!");
                    System.out.println("\n\t\t\t\t 1. OnePlus 11 5G 12 \t\t\t 2. OnePlus 10 R \n\n\t\t\t\t 3. OnePlus CE 3 \t\t\t 4. Back");
                    amazon.end();
                    System.out.println("\n\t\t\t\tEnter the option - ");
                    int b1 = scan.nextInt();
                    ph.oneplusFeat(b1);
                    break;

                case "3":
                    // iPhone model
                    amazon.start();
                    System.out.println("\t\t\t\t\t\t\tPlease Choose the iPhone Model!!");
                    System.out.println("\n\t\t\t\t 1. iPhone 15 pro \t\t\t 2. iPhone 15 \n\n\t\t\t\t 3. iPhone 13 \t\t\t 4. Back");
                    amazon.end();
                    System.out.println("\n\t\t\t\tEnter the option - ");
                    int c1 = scan.nextInt();
                    ph.iphoneFeat(c1);
                    break;

                case "4":
                    // oppo model
                    amazon.start();
                    System.out.println("\t\t\t\t\t\t\tPlease Choose the Oppo Model!!");
                    System.out.println("\n\t\t\t\t 1. Oppo Reno 10 Pro 5G \t\t\t 2. Oppo F23 5G \n\n\t\t\t\t 3. Oppo F21s Pro \t\t\t 4. Back ");
                    amazon.end();
                    System.out.println("\n\t\t\t\tEnter the option - ");
                    int d1 = scan.nextInt();
                    ph.oppoFeat(d1);
                    break;

                case "5":
                    welcome2();
                    break;

                default:
                    System.out.println("Invalid Input!");
                    welcome2();
                    break;
            }
        } else if (key == 2) {
            amazon.start();
            System.out.println("\t\t\t\t\t\t\tSelect the category - ");
            System.out.println("\n\t\t\t\t1. Men\t\t\t2.Women");
            int Op_shoe = scan.nextInt();
            amazon.end();
            
            amazon.start();
            System.out.println("\t\t\t\t\t\t\tPlease Choose the Brand!!");
            System.out.println("\n\n\t\t\t\t 1. Bata \t\t\t 2. POLO \n\n\t\t\t\t 3. Sparx \t\t\t 4. Puma \n\n\t\t\t\t 5. Back");
            amazon.end();
            System.out.println("\t\t\t\tEnter the Sr. no - ");
            int sh_value = scan.nextInt();

            // if (Op_shoe == 1) {
            // Men
            byte men = 0;
            short women = 0;
            switch (sh_value) {

                case 1:
                    // Bata model
                    amazon.start();
                    System.out.println("\t\t\t\t\t\t\tPlease Choose the Bata Shoe!!");
                    System.out.println("\n\n\t\t\t\t 1. Sport Shoe " + "\t\t\t" + " 2. Formal Shoe \n\n\t\t\t\t 3. canvas \t\t\t 4. Back");
                    amazon.end();
                    System.out.println("\n\t\t\t\tEnter the option - ");
                    short a2 = scan.nextShort();
                    // ph.miFeat(a);
                    if (Op_shoe == 1) {
                        men = (byte) a2;
                        s.bata(men);

                    } else {
                        women = a2;
                        s.bata(women);
                    }
                    break;

                case 2:
                    // Polo model
                    System.out.println("\t\t\t\t\t\t\tPlease Choose the U.S. POLO shoes !!");
                    System.out.println("\n" + //
                            "\t\t\t\t1. Sport Shoe  \t\t\t 2. Formal Shoe \n" + //
                            "\n" + //
                            " \t\t\t\t3. canvas \t\t\t 4. Back");
                    System.out.println("\t\t\t\tEnter the option - ");
                    short b2 = scan.nextShort();

                    if (Op_shoe == 1) {
                        men = (byte) b2;
                        s.polo(men);

                    } else {
                        women = b2;
                        s.polo(women);
                    }

                    break;

                case 3:
                    // sparx model
                    amazon.start();
                    System.out.println("\t\t\t\t\t\t\tPlease Choose the Sparx shoes!!");
                    System.out.println("\n\t\t\t\t 1. Sport Shoe 12 \t\t\t 2. Formal Shoe \n\n\t\t\t\t 3. canvas \t\t\t 4. Back");
                    amazon.end();
                    System.out.println("\n\t\t\t\tEnter the option - ");
                    short c2 = scan.nextShort();

                    if (Op_shoe == 1) {
                        // men
                        men = (byte) c2;
                        s.sparx(men);

                    } else {
                        // women
                        women = c2;
                        s.sparx(women);
                    }
                    break;

                case 4:
                    // Puma model
                    System.out.println("\t\t\t\t\t\t\tPlease Choose the Puma Shoes!!");
                    System.out.println("\n\t\t\t\t 1. Sport Shoe 12 \t\t\t 2. Formal Shoe \n\n\t\t\t\t 3. canvas \t\t\t 4. Back");
                    System.out.println("\t\t\t\tEnter the option - ");
                    short d2 = scan.nextShort();
                    if (Op_shoe == 1) {
                        men = (byte) d2;
                        s.puma(men);

                    } else if (Op_shoe == 2) {
                        women = d2;
                        s.puma(women);
                    } else {
                        System.out.println("\t\t\t------------------------------------------------------");
                        System.out.println("\t\t\t\tInvalid Invalid input!");
                        System.out.println("\t\t\t------------------------------------------------------");
                        welcome2();
                    }
                    break;

                default:
                    System.out.println("\t\t\t------------------------------------------------------");
                    System.out.println("\t\t\t\tInvalid Input!");
                    System.out.println("\t\t\t------------------------------------------------------");
                    welcome2();
                    break;
            }

        } else if (key == 3) {
            //

            amazon.start();
            System.out.println("\t\t\t\t\t\t\tPlease Choose the Brand!!");
            System.out.println("\n\t\t\t\t 1. Comic \t\t\t 2. Kids \n\n\t\t\t\t 3. History \t\t\t 4. Romance \n\n\t\t\t\t 5. Back");
            amazon.end();
            System.out.println("\n\t\t\t\tEnter the Sr. no - ");
            byte B_value = scan.nextByte();

            switch (B_value) {
                case 1:
                    // comic
                    amazon.start();
                    System.out.println("\t\t\t\t\t\t\tPlease Choose the Comic Book -");
                    System.out.println("\n\t\t\t\t 1. A Spider-man 2  \t\t\t 2. X-Men 2 \n\n\t\t\t\t 3. Avenger \t\t\t 4. Back");
                    amazon.end();
                    System.out.println("\n\t\t\t\tEnter the option - ");
                    int a1 = scan.nextInt();
                    book.comic(a1);
                    break;

                case 2:
                    // Kids
                    amazon.start();
                    System.out.println("\t\t\t\t\t\t\tPlease Choose the Kids book -");
                    System.out.println("\n\t\t\t\t 1. Activity Book \t\t\t 2. Story book \n\n\t\t\t\t 3. Colouring Book \t\t\t 4. Back");
                    amazon.end();
                    System.out.println("\n\t\t\t\tEnter the option - ");
                    int d1 = scan.nextInt();
                    book.kids(d1);
                    break;

                case 3:
                    // History
                    amazon.start();
                    System.out.println("\t\t\t\t\tPlease Choose the History Book - ");
                    System.out.println("\n\t\t\t\t 1. World History \t\t\t 2. Greatest Leaders \n\n\t\t\t\t 3. Race Beat \t\t\t 4. Back");
                    amazon.end();
                    System.out.println("\n\t\t\t\tEnter the option - ");
                    int b1 = scan.nextInt();
                    book.history(b1);
                    break;

                case 4:
                    // Romance
                    amazon.start();
                    System.out.println("\t\t\t\t\t\t\tPlease Choose the Romance Book -");
                    System.out.println("\n\t\t\t\t 1. Starts With Us \t\t\t 2. Ends With Us \n\n\t\t\t\t 3. Twisted Hate \t\t\t 4. Back");
                    amazon.end();
                    System.out.println("Enter the option - ");
                    int c1 = scan.nextInt();
                    book.romance(c1);
                    break;

                case 5: 
                        welcome2();
                    break;

                default:
                    break;
            }

        } else if (key == 4) {
            //bag
            //make a men n women category and use overriding if user chose men then it will cast if women chose then it will downcast, use switch n inside switch use if-else inside if else use break

            // to call the Mbag class method
        // WBags w =new WBags();
        // //upcasting
        // WBags m = new MBags();        
        Bags b = new Bags();

        amazon.start();
            System.out.println("\t\t\t\t\t\t\tSelect the category - ");
            System.out.println("\t\t\t\t1. Men \t\t\t 2.Women");
            String opBag = scan.next();
            amazon.end();
            if (opBag.equals("1") || opBag.equals("2")) {
                
                amazon.start();
                System.out.println("\t\t\t\t\t\t\tPlease Choose the Brand!!");
                System.out.println("\n\t\t\t\t 1. American Tourister \t\t\t 2. Safari \n\n\t\t\t\t 3. VIP \t\t\t 4. Back");
                amazon.end();
                System.out.println("\n\t\t\t\tEnter the Sr. no - ");
                int Value = scan.nextInt();
            
                // if (Op_shoe == 1) {
                // Men
                switch (Value) {
                    
                    case 1:
                    //luggage
                    amazon.start();
                    System.out.println("\t\t\t\t\t\t\tPlease Choose the American Tourister Bags -");
                    System.out.println("\n\t\t\t\t 1. Luggage Bag " + "\t\t\t" + " 2. Laptop Bag \n\n\t\t\t\t 3. Causal Bag \t\t\t 4. back");
                    amazon.end();
                    System.out.println("\n\t\t\t\tEnter the option - ");
                    String a2 = scan.next();
                    
                    a2=a2+"1";
                    b.disp(a2, opBag);
                    // if (opBag == 1) {
                        //     //men
                        //     a2=a2+"1";
                    //     m.mBag(a2);
                    
                    // } else if(opBag == 2){
                        //     //upcasting
                    //     a2=a2+"1";
                    //     w.mBag(a2);
                    // }else{
                    //     System.out.println("Invalid Input!!");
                    // }
                    break;

                    case 2:
                    // Safari
                    amazon.start();
                    System.out.println("Please Choose the Safari bags -");
                    System.out.println("\n\t\t\t\t 1. Luggage Bag " + "\t\t\t" + " 2. Laptop Bag \n\n\t\t\t\t 3. Causal Bag \t\t\t 4. Back");
                    amazon.end();
                    System.out.println("\n\t\t\t\tEnter the option - ");
                    String b2 = scan.next();
                    
                    b2=b2+"2";
                    b.disp(b2, opBag);
                    // if (opBag == 1) {
                        //     //men
                        //     b2=b2+"2";
                        //     m.mBag(b2);
                        
                        // } else if(opBag == 2){
                            //     //upcasting
                            //     b2=b2+"2";
                            //     w.mBag(b2);
                    // }else{
                    //     System.out.println("Invalid input!!");
                    // }
                    
                    break;
                    
                    case 3:
                    // VIP
                    amazon.start();
                    System.out.println("\t\t\t\t\t\t\tPlease Choose the VIP bags");
                    System.out.println("\n\t\t\t\t 1. Luggage Bag " + "\t\t\t" + " 2. Laptop Bag \n\n\t\t\t\t 3. Causal Bag \t\t\t 4. Back");
                    System.out.println("Enter the option - ");
                    String c2 = scan.next();
                    
                    c2=c2+"3"; 
                    b.disp(c2, opBag);
                    
                    // if (opBag == 1) {
                    //     // men
                    //     c2=c2+"3";
                    //     m.mBag(c2);
                    
                    // } else if (opBag == 2){
                        //     // women
                    //     //upcasting
                    //     // System.out.println(c2+"3");
                    //     c2=c2+"3";
                    //     w.mBag(c2);
                    // }else{
                        //     System.out.println("Invalid Input!!");
                        // }
                        break;
                        
                        case 4:
                        welcome2();
                        break;
                        
                        default:
                        System.out.println("Wrong Input!!");
                        welcome2();
                        break;
                    
                    }
                    }else{
                        System.out.println("Invalid Input");
                        welcome2();}

        } else if (key == 5) {
            if (cart.cartModel.size() != 0) {
                cart.showCart();

            } else {
                System.out.println("Your Cart is Empty! :(");
                System.out.println("Let's Buy! :)");
                welcome2();
            }
        }

        // String mi_key = scan.next();//submenu select number
        // mi_key =key +""+ mi_key;

    }
}
