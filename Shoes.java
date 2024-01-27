package project_CoreJava;

import java.util.Scanner;

public class Shoes extends amazon {

    // 1. Bata \t\t 2. POLO \n\n 3. Sparx \t\t 4. Puma
    // 1. Sport Shoe \t\t 2. Formal Shoe \n\n 3. canvas
    // bata
    // 16 7
    setData bm1 = new setData(5900, "Men Sport shoe  ", "Bata              ");
    setData bm2 = new setData(2500, "Men formal shoe ", "Bata              ");
    setData bm3 = new setData(2100, "Men Canvas      ", "Bata              ");

    // polo
    setData pm1 = new setData(3800, "Men Sport shoe  ", "US POLO           ");
    setData pm2 = new setData(2700, "Men formal shoe ", "US POLO           ");
    setData pm3 = new setData(1850, "Men Canvas      ", "US POLO           ");

    // sparx
    setData sm1 = new setData(9000, "Men Sport shoe  ", "Sparx             ");
    setData sm2 = new setData(3100, "Men formal shoe ", "Sparx             ");
    setData sm3 = new setData(3500, "Men Canvas      ", "Sparx             ");

    // puma
    setData Pm1 = new setData(2700, "Men Sport shoe  ", "PUMA              ");
    setData Pm2 = new setData(4300, "Men formal shoe ", "PUMA              ");
    setData Pm3 = new setData(3500, "Men Canvas      ", "PUMA              ");

    // women
    // bata
    // 16 7
    setData bw1 = new setData(3900, "Women Sport shoe  ", "Bata            ");
    setData bw2 = new setData(2500, "Women formal shoe ", "Bata            ");
    setData bw3 = new setData(4500, "Women Canvas      ", "Bata            ");

    // polo
    setData pw1 = new setData(2800, "Women Sport shoe  ", "US POLO         ");
    setData pw2 = new setData(2700, "Women formal shoe ", "US POLO         ");
    setData pw3 = new setData(1850, "Women Canvas      ", "US POLO         ");

    // sparx
    setData sw1 = new setData(1900, "Women Sport shoe  ", "Sparx           ");
    setData sw2 = new setData(2200, "Women formal shoe ", "Sparx           ");
    setData sw3 = new setData(1350, "Women Canvas      ", "Sparx           ");

    // puma
    setData Pw1 = new setData(1900, "Women Sport shoe  ", "PUMA            ");
    setData Pw2 = new setData(3300, "Women formal shoe ", "PUMA            ");
    setData Pw3 = new setData(4500, "Women Canvas      ", "PUMA            ");

    // men
    void bata(byte a) {
        switch (a) {
            // bata sport
            case 1:
                System.out.println("Brand Name - " + bm1.getBrand());
                System.out.println("Model Name - " + bm1.getModel());
                System.out.println("Price - " + bm1.getPrice());
                System.out.println("> Material type - Ethylene Vinyl Acetate, Rubber\r\n" + //
                        "> Closure type - Lace-Up\r\n" + //
                        "> Heel type - Flat\r\n" + //
                        "> Water resistance level - Not Water Resistant\n");

                payment.option("bm1");
                break;

            // bata formal
            case 2:
                System.out.println("Brand Name - " + bm2.getBrand());
                System.out.println("Model Name - " + bm2.getModel());
                System.out.println("Price - " + bm2.getPrice());
                System.out.println("> Closure type - Lace-Up\r\n" + //
                        "> Heel type - No Heel\r\n" + //
                        "> Water resistance level - Not Water Resistant\r\n" + //
                        "> Style - Boat Shoes\n");

                payment.option("bm2");
                break;

            // bata canvas
            case 3:
                System.out.println("Brand Name - " + bm3.getBrand());
                System.out.println("Model Name - " + bm3.getModel());
                System.out.println("Price - " + bm3.getPrice());
                System.out.println("> Closure type - Lace-Up\r\n" + //
                        "> Heel type - Flat\r\n" + //
                        "> Water resistance level - Not Water Resistant\r\n" + //
                        "> Sole material - Rubber\r\n" + //
                        "> Style - Sneaker");

                payment.option("bm3");
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

    // women
    void bata(short a) {
        switch (a) {
            // bata sport
            case 1:
                System.out.println("Brand Name - " + bw1.getBrand());
                System.out.println("Model Name - " + bw1.getModel());
                System.out.println("Price - " + bw1.getPrice());
                System.out.println("> Material type - Ethylene Vinyl Acetate, Rubber\r\n" + //
                        "> Closure type - Lace-Up\r\n" + //
                        "> Heel type - Flat\r\n" + //
                        "> Water resistance level - Not Water Resistant\n");
                payment.option("bw1");
                break;

            // bata formal
            case 2:
                System.out.println("Brand Name - " + bw2.getBrand());
                System.out.println("Model Name - " + bw2.getModel());
                System.out.println("Price - " + bw2.getPrice());
                System.out.println("> Closure type - Lace-Up\r\n" + //
                        "> Heel type - No Heel\r\n" + //
                        "> Water resistance level - Not Water Resistant\r\n" + //
                        "> Style - Boat Shoes\n");
                payment.option("bw2");
                break;

            // bata canvas
            case 3:
                System.out.println("Brand Name - " + bw3.getBrand());
                System.out.println("Model Name - " + bw3.getModel());
                System.out.println("Price - " + bw3.getPrice());
                System.out.println("> Closure type - Lace-Up\r\n" + //
                        "> Heel type - Flat\r\n" + //
                        "> Water resistance level - Not Water Resistant\r\n" + //
                        "> Sole material - Rubber\r\n" + //
                        "> Style - Sneaker");
                payment.option("bw3");
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

    // men
    void sparx(byte a) {
        switch (a) {
            // sparx sport
            case 1:
                System.out.println("Brand Name - " + sm1.getBrand());
                System.out.println("Model Name - " + sm1.getModel());
                System.out.println("Price - " + sm1.getPrice());
                System.out.println("> Material type - Ethylene Vinyl Acetate, Rubber\r\n" + //
                        "> Closure type - Lace-Up\r\n" + //
                        "> Heel type - Flat\r\n" + //
                        "> Water resistance level - Not Water Resistant\n");
                payment.option("sm1");
                break;

            // sparx formal
            case 2:
                System.out.println("Brand Name - " + sm2.getBrand());
                System.out.println("Model Name - " + sm2.getModel());
                System.out.println("Price - " + sm2.getPrice());
                System.out.println("> Closure type - Lace-Up\r\n" + //
                        "> Heel type - No Heel\r\n" + //
                        "> Water resistance level - Not Water Resistant\r\n" + //
                        "> Style - Boat Shoes\n");
                payment.option("sm2");
                break;

            // sparx canvas
            case 3:
                System.out.println("Brand Name - " + sm3.getBrand());
                System.out.println("Model Name - " + sm3.getModel());
                System.out.println("Price - " + sm3.getPrice());
                System.out.println("> Closure type - Lace-Up\r\n" + //
                        "> Heel type - Flat\r\n" + //
                        "> Water resistance level - Not Water Resistant\r\n" + //
                        "> Sole material - Rubber\r\n" + //
                        "> Style - Sneaker");
                payment.option("sm3");
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

    // women
    void sparx(short a) {
        switch (a) {
            // sparx sport
            case 1:
                System.out.println("Brand Name - " + sw1.getBrand());
                System.out.println("Model Name - " + sw1.getModel());
                System.out.println("Price - " + sw1.getPrice());
                System.out.println("> Material type - Ethylene Vinyl Acetate, Rubber\r\n" + //
                        "> Closure type - Lace-Up\r\n" + //
                        "> Heel type - Flat\r\n" + //
                        "> Water resistance level - Not Water Resistant\n");
                payment.option("sw1");
                break;

            // sparx formal
            case 2:
                System.out.println("Brand Name - " + sw2.getBrand());
                System.out.println("Model Name - " + sw2.getModel());
                System.out.println("Price - " + sw2.getPrice());
                System.out.println("> Closure type - Lace-Up\r\n" + //
                        "> Heel type - No Heel\r\n" + //
                        "> Water resistance level - Not Water Resistant\r\n" + //
                        "> Style - Boat Shoes\n");
                payment.option("sw2");
                break;

            // sparx canvas
            case 3:
                System.out.println("Brand Name - " + sw3.getBrand());
                System.out.println("Model Name - " + sw3.getModel());
                System.out.println("Price - " + sw3.getPrice());
                System.out.println("> Closure type - Lace-Up\r\n" + //
                        "> Heel type - Flat\r\n" + //
                        "> Water resistance level - Not Water Resistant\r\n" + //
                        "> Sole material - Rubber\r\n" + //
                        "> Style - Sneaker");
                payment.option("sw3");
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

    // men
    void puma(byte a) {
        switch (a) {
            // puma sport
            case 1:
                System.out.println("Brand Name - " + Pm1.getBrand());
                System.out.println("Model Name - " + Pm1.getModel());
                System.out.println("Price - " + Pm1.getPrice());
                System.out.println("> Material type - Ethylene Vinyl Acetate, Rubber\r\n" + //
                        "> Closure type - Lace-Up\r\n" + //
                        "> Heel type - Flat\r\n" + //
                        "> Water resistance level - Not Water Resistant\n");
                payment.option("Pm1");
                break;

            // puma formal
            case 2:
                System.out.println("Brand Name - " + Pm2.getBrand());
                System.out.println("Model Name - " + Pm2.getModel());
                System.out.println("Price - " + Pm2.getPrice());
                System.out.println("> Closure type - Lace-Up\r\n" + //
                        "> Heel type - No Heel\r\n" + //
                        "> Water resistance level - Not Water Resistant\r\n" + //
                        "> Style - Boat Shoes\n");
                payment.option("Pm2");
                break;

            // puma canvas
            case 3:
                System.out.println("Brand Name - " + Pm3.getBrand());
                System.out.println("Model Name - " + Pm3.getModel());
                System.out.println("Price - " + Pm3.getPrice());
                System.out.println("> Closure type - Lace-Up\r\n" + //
                        "> Heel type - Flat\r\n" + //
                        "> Water resistance level - Not Water Resistant\r\n" + //
                        "> Sole material - Rubber\r\n" + //
                        "> Style - Sneaker");
                payment.option("Pm3");
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

    // women
    void puma(short a) {
        switch (a) {
            // puma sport
            case 1:
                System.out.println("Brand Name - " + Pw1.getBrand());
                System.out.println("Model Name - " + Pw1.getModel());
                System.out.println("Price - " + Pw1.getPrice());
                System.out.println("> Material type - Ethylene Vinyl Acetate, Rubber\r\n" + //
                        "> Closure type - Lace-Up\r\n" + //
                        "> Heel type - Flat\r\n" + //
                        "> Water resistance level - Not Water Resistant\n");
                payment.option("Pw1");
                break;

            // puma formal
            case 2:
                System.out.println("Brand Name - " + Pw2.getBrand());
                System.out.println("Model Name - " + Pw2.getModel());
                System.out.println("Price - " + Pw2.getPrice());
                System.out.println("> Closure type - Lace-Up\r\n" + //
                        "> Heel type - No Heel\r\n" + //
                        "> Water resistance level - Not Water Resistant\r\n" + //
                        "> Style - Boat Shoes\n");
                payment.option("Pw2");
                break;

            // puma canvas
            case 3:
                System.out.println("Brand Name - " + Pw3.getBrand());
                System.out.println("Model Name - " + Pw3.getModel());
                System.out.println("Price - " + Pw3.getPrice());
                System.out.println("> Closure type - Lace-Up\r\n" + //
                        "> Heel type - Flat\r\n" + //
                        "> Water resistance level - Not Water Resistant\r\n" + //
                        "> Sole material - Rubber\r\n" + //
                        "> Style - Sneaker");
                payment.option("Pw3");
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

    // men
    void polo(byte a) {
        switch (a) {
            // polo sport
            case 1:
                System.out.println("Brand Name - " + pm1.getBrand());
                System.out.println("Model Name - " + pm1.getModel());
                System.out.println("Price - " + pm1.getPrice());
                System.out.println("> Material type - Ethylene Vinyl Acetate, Rubber\r\n" + //
                        "> Closure type - Lace-Up\r\n" + //
                        "> Heel type - Flat\r\n" + //
                        "> Water resistance level - Not Water Resistant\n");
                payment.option("pm1");
                break;

            // bata formal
            case 2:
                System.out.println("Brand Name - " + pm2.getBrand());
                System.out.println("Model Name - " + pm2.getModel());
                System.out.println("Price - " + pm2.getPrice());
                System.out.println("> Closure type - Lace-Up\r\n" + //
                        "> Heel type - No Heel\r\n" + //
                        "> Water resistance level - Not Water Resistant\r\n" + //
                        "> Style - Boat Shoes\n");
                payment.option("pm2");
                break;

            // polo canvas
            case 3:
                System.out.println("Brand Name - " + pm3.getBrand());
                System.out.println("Model Name - " + pm3.getModel());
                System.out.println("Price - " + pm3.getPrice());
                System.out.println("> Closure type - Lace-Up\r\n" + //
                        "> Heel type - Flat\r\n" + //
                        "> Water resistance level - Not Water Resistant\r\n" + //
                        "> Sole material - Rubber\r\n" + //
                        "> Style - Sneaker");
                payment.option("pm3");
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

    // women
    void polo(short a) {
        switch (a) {
            // polo sport
            case 1:
                System.out.println("Brand Name - " + pw1.getBrand());
                System.out.println("Model Name - " + pw1.getModel());
                System.out.println("Price - " + pw1.getPrice());
                System.out.println("> Material type - Ethylene Vinyl Acetate, Rubber\r\n" + //
                        "> Closure type - Lace-Up\r\n" + //
                        "> Heel type - Flat\r\n" + //
                        "> Water resistance level - Not Water Resistant\n");
                payment.option("pw1");
                break;

            // polo formal
            case 2:
                System.out.println("Brand Name - " + pw2.getBrand());
                System.out.println("Model Name - " + pw2.getModel());
                System.out.println("Price - " + pw2.getPrice());
                System.out.println("> Closure type - Lace-Up\r\n" + //
                        "> Heel type - No Heel\r\n" + //
                        "> Water resistance level - Not Water Resistant\r\n" + //
                        "> Style - Boat Shoes\n");
                payment.option("pw2");
                break;

            // polo canvas
            case 3:
                System.out.println("Brand Name - " + pw3.getBrand());
                System.out.println("Model Name - " + pw3.getModel());
                System.out.println("Price - " + pw3.getPrice());
                System.out.println("> Closure type - Lace-Up\r\n" + //
                        "> Heel type - Flat\r\n" + //
                        "> Water resistance level - Not Water Resistant\r\n" + //
                        "> Sole material - Rubber\r\n" + //
                        "> Style - Sneaker");
                payment.option("pw3");
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