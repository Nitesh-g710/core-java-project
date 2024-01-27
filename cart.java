package project_CoreJava;

import java.util.*;

class cart extends amazon {
    // to hold the value from cart method & cart method is static , static can only
    // access static
    static String option;

    // double cartPrice, cartprice2;
    // String cartName, cartname2, cartModel, cartmodel2;

    static LinkedList<String> cartName = new LinkedList<>();
    static LinkedList<String> cartModel = new LinkedList<>();
    static LinkedList<Double> cartPrice = new LinkedList<>();

    // it takes number index to remove cart item
    static List<Integer> userOption = new ArrayList<Integer>();

    static void cart(String op) {
        option = op;
        // replace values
        // cartName = op.getBrand();
        Shoes s = new Shoes();
        Books b = new Books();
        phones p3 = new phones();

        WBags w = new WBags();
        // WBags upBag = new MBags();
        // MBags DownBag = (MBags) upBag;

        if (op == "mi1") {
            cartName.add(p3.mi1.getBrand());
            cartModel.add(p3.mi1.getModel());
            cartPrice.add(p3.mi1.getPrice());
            op = null;
        } else if (op == "mi2") {
            cartName.add(p3.mi2.getBrand());
            cartModel.add(p3.mi2.getModel());
            cartPrice.add(p3.mi2.getPrice());
            op = null;
        } else if (op == "mi3") {
            cartName.add(p3.mi3.getBrand());
            cartModel.add(p3.mi3.getModel());
            cartPrice.add(p3.mi3.getPrice());
            op = null;
        } else if (op == "op1") {
            cartName.add(p3.op1.getBrand());
            cartModel.add(p3.op1.getModel());
            cartPrice.add(p3.op1.getPrice());
            op = null;
        } else if (op == "op2") {
            cartName.add(p3.op2.getBrand());
            cartModel.add(p3.op2.getModel());
            cartPrice.add(p3.op2.getPrice());
            op = null;
        } else if (op == "op3") {
            cartName.add(p3.op3.getBrand());
            cartModel.add(p3.op3.getModel());
            cartPrice.add(p3.op3.getPrice());
            op = null;
        } else if (op == "ip1") {
            cartName.add(p3.ip1.getBrand());
            cartModel.add(p3.ip1.getModel());
            cartPrice.add(p3.ip1.getPrice());
            op = null;
        } else if (op == "ip2") {
            cartName.add(p3.ip2.getBrand());
            cartModel.add(p3.ip2.getModel());
            cartPrice.add(p3.ip2.getPrice());
            op = null;
        } else if (op == "ip3") {
            cartName.add(p3.ip3.getBrand());
            cartModel.add(p3.ip3.getModel());
            cartPrice.add(p3.ip3.getPrice());
            op = null;
        } else if (op == "opp1") {
            cartName.add(p3.opp1.getBrand());
            cartModel.add(p3.opp1.getModel());
            cartPrice.add(p3.opp1.getPrice());
            op = null;
        } else if (op == "opp2") {
            cartName.add(p3.opp2.getBrand());
            cartModel.add(p3.opp2.getModel());
            cartPrice.add(p3.opp2.getPrice());
            op = null;
        } else if (op == "opp3") {
            cartName.add(p3.opp3.getBrand());
            cartModel.add(p3.opp3.getModel());
            cartPrice.add(p3.opp3.getPrice());
            op = null;
        }
        // shoes
        // bata -bm1 ,bw1
        // sparx - sm1, sw1
        // polo - pm1. pw1
        // puma - Pm1 , Pw1
        // men
        else if (op == "bm1") {
            cartName.add(s.bm1.getBrand());
            cartModel.add(s.bm1.getModel());
            cartPrice.add(s.bm1.getPrice());
        } else if (op == "bm2") {
            cartName.add(s.bm2.getBrand());
            cartModel.add(s.bm2.getModel());
            cartPrice.add(s.sm2.getPrice());
        } else if (op == "bm3") {
            cartName.add(s.bm3.getBrand());
            cartModel.add(s.bm3.getModel());
            cartPrice.add(s.bm3.getPrice());
        } else if (op == "Pm1") {
            cartName.add(s.Pm1.getBrand());
            cartModel.add(s.Pm1.getModel());
            cartPrice.add(s.Pm1.getPrice());
        } else if (op == "Pm2") {
            cartName.add(s.Pm2.getBrand());
            cartModel.add(s.Pm2.getModel());
            cartPrice.add(s.Pm2.getPrice());
        } else if (op == "Pm3") {
            cartName.add(s.Pm3.getBrand());
            cartModel.add(s.Pm3.getModel());
            cartPrice.add(s.Pm3.getPrice());
        } else if (op == "pm1") {
            cartName.add(s.pm1.getBrand());
            cartModel.add(s.pm1.getModel());
            cartPrice.add(s.pm1.getPrice());
        } else if (op == "pm2") {
            cartName.add(s.pm2.getBrand());
            cartModel.add(s.pm2.getModel());
            cartPrice.add(s.pm2.getPrice());
        } else if (op == "pm3") {
            cartName.add(s.pm3.getBrand());
            cartModel.add(s.pm3.getModel());
            cartPrice.add(s.pm3.getPrice());
        } else if (op == "sm1") {
            cartName.add(s.sm1.getBrand());
            cartModel.add(s.sm1.getModel());
            cartPrice.add(s.sm1.getPrice());
        } else if (op == "sm2") {
            cartName.add(s.sm2.getBrand());
            cartModel.add(s.sm2.getModel());
            cartPrice.add(s.sm2.getPrice());
        } else if (op == "sm3") {
            cartName.add(s.sm3.getBrand());
            cartModel.add(s.sm3.getModel());
            cartPrice.add(s.sm3.getPrice());
        }
        // women
        else if (op == "bw1") {
            cartName.add(s.bw1.getBrand());
            cartModel.add(s.bw1.getModel());
            cartPrice.add(s.bw1.getPrice());
        } else if (op == "bw2") {
            cartName.add(s.bw2.getBrand());
            cartModel.add(s.bw2.getModel());
            cartPrice.add(s.sw2.getPrice());
        } else if (op == "bw3") {
            cartName.add(s.bw3.getBrand());
            cartModel.add(s.bw3.getModel());
            cartPrice.add(s.bw3.getPrice());
        } else if (op == "Pw1") {
            cartName.add(s.Pw1.getBrand());
            cartModel.add(s.Pw1.getModel());
            cartPrice.add(s.Pw1.getPrice());
        } else if (op == "Pw2") {
            cartName.add(s.Pw2.getBrand());
            cartModel.add(s.Pw2.getModel());
            cartPrice.add(s.Pw2.getPrice());
        } else if (op == "Pw3") {
            cartName.add(s.Pw3.getBrand());
            cartModel.add(s.Pw3.getModel());
            cartPrice.add(s.Pw3.getPrice());
        } else if (op == "pw1") {
            cartName.add(s.pw1.getBrand());
            cartModel.add(s.pw1.getModel());
            cartPrice.add(s.pw1.getPrice());
        } else if (op == "pw2") {
            cartName.add(s.pw2.getBrand());
            cartModel.add(s.pw2.getModel());
            cartPrice.add(s.pw2.getPrice());
        } else if (op == "pw3") {
            cartName.add(s.pw3.getBrand());
            cartModel.add(s.pw3.getModel());
            cartPrice.add(s.pw3.getPrice());
        } else if (op == "sw1") {
            cartName.add(s.sw1.getBrand());
            cartModel.add(s.sw1.getModel());
            cartPrice.add(s.sw1.getPrice());
        } else if (op == "sw2") {
            cartName.add(s.sw2.getBrand());
            cartModel.add(s.sw2.getModel());
            cartPrice.add(s.sw2.getPrice());
        } else if (op == "sw3") {
            cartName.add(s.sw3.getBrand());
            cartModel.add(s.sw3.getModel());
            cartPrice.add(s.sw3.getPrice());
        }
        // books
        else if (op == "c1") {
            cartName.add(b.c1.getBrand());
            cartModel.add(b.c1.getModel());
            cartPrice.add(b.c1.getPrice());
        } else if (op == "c2") {
            cartName.add(b.c2.getBrand());
            cartModel.add(b.c2.getModel());
            cartPrice.add(b.c2.getPrice());
        } else if (op == "c3") {
            cartName.add(b.c3.getBrand());
            cartModel.add(b.c3.getModel());
            cartPrice.add(b.c3.getPrice());
        } else if (op == "r1") {
            cartName.add(b.r1.getBrand());
            cartModel.add(b.r1.getModel());
            cartPrice.add(b.r1.getPrice());
        } else if (op == "r2") {
            cartName.add(b.r2.getBrand());
            cartModel.add(b.r2.getModel());
            cartPrice.add(b.r2.getPrice());
        } else if (op == "r3") {
            cartName.add(b.r3.getBrand());
            cartModel.add(b.r3.getModel());
            cartPrice.add(b.r3.getPrice());
        } else if (op == "h1") {
            cartName.add(b.h1.getBrand());
            cartModel.add(b.h1.getModel());
            cartPrice.add(b.h1.getPrice());
        } else if (op == "h2") {
            cartName.add(b.h2.getBrand());
            cartModel.add(b.h2.getModel());
            cartPrice.add(b.h2.getPrice());
        } else if (op == "h3") {
            cartName.add(b.h3.getBrand());
            cartModel.add(b.h3.getModel());
            cartPrice.add(b.h3.getPrice());
        } else if (op == "k1") {
            cartName.add(b.k1.getBrand());
            cartModel.add(b.k1.getModel());
            cartPrice.add(b.k1.getPrice());
        } else if (op == "k2") {
            cartName.add(b.k2.getBrand());
            cartModel.add(b.k2.getModel());
            cartPrice.add(b.k2.getPrice());
        } else if (op == "k3") {
            cartName.add(b.k3.getBrand());
            cartModel.add(b.k3.getModel());
            cartPrice.add(b.k3.getPrice());
        }
        // bag
        // women
        else if (op == "abw1") {
            cartName.add(w.abw1.getBrand());
            cartModel.add(w.abw1.getModel());
            cartPrice.add(w.abw1.getPrice());
        } else if (op == "abw2") {
            cartName.add(w.abw2.getBrand());
            cartModel.add(w.abw2.getModel());
            cartPrice.add(w.abw2.getPrice());
        } else if (op == "abw3") {
            cartName.add(w.abw3.getBrand());
            cartModel.add(w.abw3.getModel());
            cartPrice.add(w.abw3.getPrice());
        } else if (op == "vbw1") {
            cartName.add(w.vbw1.getBrand());
            cartModel.add(w.vbw1.getModel());
            cartPrice.add(w.vbw1.getPrice());
        } else if (op == "vbw2") {
            cartName.add(w.vbw2.getBrand());
            cartModel.add(w.vbw2.getModel());
            cartPrice.add(w.vbw2.getPrice());
        } else if (op == "vbw3") {
            cartName.add(w.vbw3.getBrand());
            cartModel.add(w.vbw3.getModel());
            cartPrice.add(w.vbw3.getPrice());
        } else if (op == "sbw1") {
            cartName.add(w.sbw1.getBrand());
            cartModel.add(w.sbw1.getModel());
            cartPrice.add(w.sbw1.getPrice());
        } else if (op == "sbw2") {
            cartName.add(w.sbw2.getBrand());
            cartModel.add(w.sbw2.getModel());
            cartPrice.add(w.sbw2.getPrice());
        } else if (op == "sbw3") {
            cartName.add(w.sbw3.getBrand());
            cartModel.add(w.sbw3.getModel());
            cartPrice.add(w.sbw3.getPrice());
        }
        // men
        else if (op == "abm1") {
            cartName.add(w.abm1.getBrand());
            cartModel.add(w.abm1.getModel());
            cartPrice.add(w.abm1.getPrice());
        } else if (op == "abm2") {
            cartName.add(w.abm2.getBrand());
            cartModel.add(w.abm2.getModel());
            cartPrice.add(w.abm2.getPrice());
        } else if (op == "abm3") {
            cartName.add(w.abm3.getBrand());
            cartModel.add(w.abm3.getModel());
            cartPrice.add(w.abm3.getPrice());
        } else if (op == "vbm1") {
            cartName.add(w.vbm1.getBrand());
            cartModel.add(w.vbm1.getModel());
            cartPrice.add(w.vbm1.getPrice());
        } else if (op == "vbm2") {
            cartName.add(w.vbm2.getBrand());
            cartModel.add(w.vbm2.getModel());
            cartPrice.add(w.vbm2.getPrice());
        } else if (op == "vbm3") {
            cartName.add(w.vbm3.getBrand());
            cartModel.add(w.vbm3.getModel());
            cartPrice.add(w.vbm3.getPrice());
        } else if (op == "sbm1") {
            cartName.add(w.sbm1.getBrand());
            cartModel.add(w.sbm1.getModel());
            cartPrice.add(w.sbm1.getPrice());
        } else if (op == "sbm2") {
            cartName.add(w.sbm2.getBrand());
            cartModel.add(w.sbm2.getModel());
            cartPrice.add(w.sbm2.getPrice());
        } else if (op == "sbm3") {
            cartName.add(w.sbm3.getBrand());
            cartModel.add(w.sbm3.getModel());
            cartPrice.add(w.sbm3.getPrice());
        } else {
            System.out.println("Invalid Input");
            welcome.welcome2();
        }

    }

    static void addCart() {
        payment pay = new payment();
        Scanner sc = new Scanner(System.in);
        System.out.println("Sucessfully Added to the Cart!");
        System.out.println("1. show cart \t\t 2. Back\t\t3.Home");
        int a = sc.nextInt();

        if (a == 1) {
            // same class method to print all cart data
            showCart();

        } else if (a == 2) {
            // pay is ref of payment
            welcome.welcome2();
        } else {
            System.out.println("Please Enter Valid Input!!");
            welcome.welcome2();
        }
        // sc.close();
    }

    static void showCart() {
        if (cartName.size() == 0) {
            System.out.println("Cart is Empty!");
            System.out.println("Lets purchase !");
            welcome.welcome2();
        }
        Scanner sc = new Scanner(System.in);
        // Print the all cart values
        System.out.println("\t\t\t\tSr.No.\t    Brand \t  \t   Product\t  \t   Price");
        System.out.print("\t\t\t\t");
        for (int i = 0; i < 70; i++) {
            System.out.print("-");
        }
        System.out.println();
        for (int i = 0; i < cartName.size(); i++) {
            System.out.print("\t\t\t\t");

            System.out.println(
                    i + 1 + ".\t " + cartName.get(i) + "\t   " + cartModel.get(i) + "\t   " + cartPrice.get(i) + "/-");
        }
        // if (bill.p_bill) {
        //     System.out.print("\t\t\t\t");
        //     for (int i = 0; i < 70; i++) {
        //         System.out.print("-");
        //     }
        //     System.out.println("\n\t\t\t1\t\t\t\t\t\t\t\t   " + bill.getTotal() + "/-");
        // }

        System.out.println("1. Remove item\n2. Back\n3. Exit");
        int chose = sc.nextInt();
        switch (chose) {
            case 1:
                removeCart();
                break;
            case 2:
                welcome.welcome2();
                break;
            case 3:
                payment.exit();
                break;
            default:
                System.out.println("Invalid Input!");
                welcome.welcome2();
                break;
        }

        // System.out.println("\n\t\t\t\t1. Back");
        // System.out.println("\n\t\t\t\t\t\tenter the Option -");
        // amazon.end();
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // if (bill.p_bill) {

        //     cartModel.clear();
        //     cartName.clear();
        //     cartPrice.clear();
        //     userOption.clear();
        //     //bill.p_bill = false;
        //     bill b = new bill();
        //     b.setTotal(0.0);
        //     welcome.welcome2();

        // }
        welcome.welcome2();
    }

    // int sizeList() {
    // ListIterator l = cartName.listIterator();
    // int count = 0;
    // while (l.hasNext()) {
    // count++;
    // }
    // return count;
    // }


    static void bill() {
        System.out.println("\t\t\t\tSr.No.\t    Brand \t  \t   Product\t  \t   Price");
        System.out.print("\t\t\t\t");
        for (int i = 0; i < 70; i++) {
            System.out.print("-");
        }
        System.out.println();
        for (int i = 0; i < cartName.size(); i++) {
            System.out.print("\t\t\t\t");
            System.out.println(
                    i + 1 + ".\t " + cartName.get(i) + "\t   " + cartModel.get(i) + "\t   " + cartPrice.get(i) + "/-");
        }
        System.out.print("\t\t\t\t");
        for (int i = 0; i < 70; i++) {
            System.out.print("-");
        }
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t   " + bill.getTotal() + "/-");

        cartModel.clear();
        cartName.clear();
        cartPrice.clear();
        userOption.clear();
        // bill.p_bill = false;
        bill b = new bill();
        b.setTotal(0.0);

        System.out.println("\n\t\t\t\t1. Back");
        System.out.println("\n\t\t\t\t\t\tenter the Option -");
        amazon.end();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a == 1) {
            welcome.welcome2();

        } else {
            System.out.println("Invalid Input!");
            welcome.welcome2();
        }
    }

    static void removeCart() {
        // showCart();
        if (cartName.size() == 0) {
            System.out.println("Cart is Empty!");
            System.out.println("Lets purchase !");
            welcome.welcome2();
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("How many item you want to remove ?");
        int ab = sc.nextInt();
        if (ab > 0) {

            System.out.println("Enter the option - ");
            for (int i = 0; i < ab; i++) {
                userOption.add(sc.nextInt() - 1);
            }

            for (int obj : userOption) {
                cartName.remove(obj);
                cartModel.remove(obj);
                cartPrice.remove(obj);
            }
            System.out.println("Items removed!!");
            // sc.close();
            userOption.clear();
            welcome.welcome2();
        } else {
            System.out.println("Invalid Input!");
            welcome.welcome2();
        }
    }
}