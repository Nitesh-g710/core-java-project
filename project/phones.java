package project_CoreJava;
import java.util.*;
import java.util.ArrayList;;

class phones extends welcome {

    // all classes with data
    // mi
    setData mi1 = new setData(19000, "Mi 12           ", "Xioami            ");
    setData mi2 = new setData(15000, "Mi 12 C         ", "Xioami            ");
    setData mi3 = new setData(25000, "Mi 11X          ", "Xioami            ");

    // oneplus
    setData op1 = new setData(28000, "OnePlus 11      ", "OnePlus           ");
    setData op2 = new setData(27000, "OnePlus 10R     ", "OnePlus           ");
    setData op3 = new setData(18500, "OnePlus CE 2    ", "OnePlus           ");

    // iphone
    setData ip1 = new setData(190000, "iPhone 15 Pro   ", "iPhone           ");
    setData ip2 = new setData(130000, "iPhone 15       ", "iPhone           ");
    setData ip3 = new setData(95000, "iPhone 13       ", "iPhone           ");

    // oppo
    setData opp1 = new setData(17000, "Oppo F23        ", "Oppo             ");
    setData opp2 = new setData(13000, "Oppo Reno 10 Pro", "Oppo             ");
    setData opp3 = new setData(9500, "Oppo F21s       ", "Oppo             ");

    // ArrayList<setData> oppo = new ArrayList<setData>();
    // oppo.add(opp1);

    String cartOption1 = null;
    // int cartOption2 = 0;

    payment p = new payment();

    void miFeat(int key) {
        switch (key) {
            case 1:
                // mi 12
                amazon.start();
                System.out.println("\t\t\t\tThe Brand name :" + mi1.getBrand());
                System.out.println("\t\t\t\tThe Model name :" + mi1.getModel());
                System.out.println("The Price :" + mi1.getPrice() + "/-");
                System.out.println(
                        "\t\t\t\t\tAbout this item\n\t\t\t\t\u001aDisplay - 6.28, 2400 x 1080\n\t\t\t\t\u001a Front Camera - 32 Megapixel\n\t\t\t\t\u001a Main Camera - 50 Megapixel\n\t\t\t\t\u001a Operating System - Android 12\n\t\t\t\t\u001a Storage - 256 GB\n\u001a RAM - 8 GB\n\t\t\t\t\u001a Processor - Qualcomm Snapdragon 8 Gen 1\n\t\t\t\t\u001a Battery - 4500 mAh");
                        amazon.end();
                cartOption1 = "mi1";
                // cartOption2 =1;
                p.option(cartOption1);
                break;
            case 2:
                // mi 12 c
                System.out.println("The Brand name :" + mi2.getBrand());
                System.out.println("The Model name :" + mi2.getModel());
                System.out.println("The Price :" + mi2.getPrice() + "/-");

                System.out.println("About this item\n" + //
                        "\u001a Display - 6.71, 720 x 1650 pixels\n" + //
                        "\u001a Front Camera - 5 Megapixel\n" + //
                        "\u001a Main Camera - 50 Megapixel\n" + //
                        "\u001a Operating System - Android 12\n" + //
                        "\u001a Storage - 128 GB | 256 GB\n" + //
                        "\u001a RAM -6 GB | 8 GB\n" + //
                        "\u001a Processor - Mediatek Helio G85\n" + //
                        "\u001a Battery - 5000 mAh\n");
                cartOption1 = "mi2";
                // cartOption2 =2;
                p.option(cartOption1);
                break;
            case 3:
                // 11 X
                System.out.println("The Brand name :" + mi3.getBrand());
                System.out.println("The Model name :" + mi3.getModel());
                System.out.println("The Price :" + mi3.getPrice() + "/-");

                System.out.println("About this item\n>Display - 6.67\", 1080 x 2400 pixels\n" + //
                        "\u001a Front Camera - 20 Megapixel\n" + //
                        "\u001a Main Camera - 48 Megapixel\n" + //
                        "\u001a Operating System - Android 11\n" + //
                        "\u001a Storage - 128 GB | 256 GB\n" + //
                        "\u001a RAM -6 GB | 8 GB\n" + //
                        "\u001a Processor - Qualcomm Snapdragon 870 5G\n" + //
                        "\u001a Battery - 4520 mAh\n");
                cartOption1 = "mi3";
                // cartOption2 = 3;
                p.option(cartOption1);
                break;
            case 4:
                welcome2();
                break;
            default:
                System.out.println("The Product is Not Found");
                break;
        }
    }

    void oneplusFeat(int key) {
        // int key = 0;
        switch (key) {
            case 1:
                // oneplus 11 5G
                System.out.println("The Brand name :" + op1.getBrand());
                System.out.println("The Model name :" + op1.getModel());
                System.out.println("The Price :" + op1.getPrice() + "/-");
                System.out.println("About this item\n" + //
                        "\u001a Display - 6.7inch, 1440 x 3216 pixels\n" + //
                        "\u001a Front Camera - 16 Megapixel\n" + //
                        "\u001a Main Camera - 50 Megapixel\n" + //
                        "\u001a Operating System - Android 13\n" + //
                        "\u001a Storage - 256 GB | 512 GB\n" + //
                        "\u001a RAM - 8 GB | 12 GB\n" + //
                        "\u001a Processor - Snapdragon 8 Gen 2 \n" + //
                        "\u001a Battery - 5000 mAh\n");
                cartOption1 = "op1";
                // cartOption2 =1;
                p.option(cartOption1);
                break;

            case 2:
                // 10 R
                System.out.println("The Brand name :" + op2.getBrand());
                System.out.println("The Model name :" + op2.getModel());
                System.out.println("The Price :" + op2.getPrice() + "/-");
                System.out.println("About this item\n" + //
                        "\u001a Display - 6.7inch, 1080 x 2412 pixels\n" + //
                        "\u001a Front Camera - 16 Megapixel\n" + //
                        "\u001a Main Camera - 50 Megapixel\n" + //
                        "\u001a Operating System - Android 12\n" + //
                        "\u001a Storage - 128 GB | 256 GB\n" + //
                        "\u001a RAM - 8 GB | 12 GB\n" + //
                        "\u001a Processor - Mediatek Dimensity 8100 Max \n" + //
                        "\u001a Battery - 5000 mAh\n");
                cartOption1 = "op2";
                // cartOption2 =2;
                payment.option(cartOption1);
                break;

            case 3:

                // CE3
                System.out.println("The Brand name :" + op3.getBrand());
                System.out.println("The Model name :" + op3.getModel());
                System.out.println("The Price :" + op3.getPrice() + "/-");
                System.out.println("About this item\n" + //
                        "\u001a Display - 6.7inch, 1080 x 2412 pixels\n" + //
                        "\u001a Camera - 16 Megapixel\n" + //
                        "\u001a Main Camera - 50 Megapixel\n" + //
                        "\u001a Operating System - Android 12\n" + //
                        "\u001a Storage - 128 GB | 256 GB\n" + //
                        "\u001a RAM - 8 GB | 12 GB\n" + //
                        "\u001a Processor - Qualcomm Snapdragon 782G \n" + //
                        "\u001a Battery - 5000 mAh\n");
                cartOption1 = "op3";
                // cartOption2 =3;
                p.option(cartOption1);
                break;

            case 4:
                welcome2();
                break;

            default:
                System.out.println("The Product is Not Found");
                break;
        }
    }

    void iphoneFeat(int key) {
        // int key = 0;
        switch (key) {
            case 1:
                // iphone 15 pro
                System.out.println("The Brand name :" + ip1.getBrand());
                System.out.println("The Model name :" + ip1.getModel());
                System.out.println("The Price :" + ip1.getPrice() + "/-");
                System.out.println("About this item\n" + //
                        "\u001a Display - 6.1inch, 1179 x 2556 pixels\n" + //
                        "\u001a Front Camera - 12 Megapixel\n" + //
                        "\u001a Main Camera - 50 Megapixel\n" + //
                        "\u001a Operating System - Android 12\n" + //
                        "\u001a Storage - 128 GB | 256 GB\n" + //
                        "\u001a RAM - 8 GB | 12 GB\n" + //
                        "\u001a Processor - Apple A17 Pro \n" + //
                        "\u001a Battery - 3274 mAh\n");
                cartOption1 = "ip1";
                // cartOption2 =1;
                p.option(cartOption1);
                break;
            case 2:
                // iphone 15
                System.out.println("The Brand name :" + ip2.getBrand());
                System.out.println("The Model name :" + ip2.getModel());
                System.out.println("The Price :" + ip2.getPrice() + "/-");
                System.out.println("About this item\n" + //
                        "\u001a Display - 6.1inch, 1179 x 2556 pixels\n" + //
                        "\u001a Front Camera - 12 Megapixel\n" + //
                        "\u001a Main Camera - 50 Megapixel\n" + //
                        "\u001a Operating System - iOS 15\n" + //
                        "\u001a Storage - 128 GB | 256 GB\n" + //
                        "\u001a RAM - 8 GB | 12 GB\n" + //
                        "\u001a Processor - Apple A17 Pro\n " + //
                        "\u001a Battery - 3274 mAh\n");
                cartOption1 = "ip2";
                // cartOption2 =2;
                p.option(cartOption1);
                break;

            case 3:
                // 13
                System.out.println("The Brand name :" + ip3.getBrand());
                System.out.println("The Model name :" + ip3.getModel());
                System.out.println("The Price :" + ip3.getPrice() + "/-");
                System.out.println("About this item\n" + //
                        "\u001a Display - 6.1inch, 1170 x 2532 pixels\n" + //
                        "\u001a Front Camera - 12 Megapixel\n" + //
                        "\u001a Main Camera - 12 Megapixel\n" + //
                        "\u001a Operating System - iOS 15\n" + //
                        "\u001a Storage - 128 GB | 256 GB\n" + //
                        "\u001a RAM - 8 GB | 12 GB\n" + //
                        "\u001a Processor - Apple A15 Bionic \n" + //
                        "\u001a Battery - 3240 mAh\n");
                cartOption1 = "ip3";
                // cartOption2 =3;
                p.option(cartOption1);
                break;
            case 4:
                welcome2();
                break;
            default:
                System.out.println("The Product is Not Found");
                break;
        }
    }

    void oppoFeat(int key) {
        // int key = 0;

        switch (key) {
            case 1:
                // oppo f23 5g
                System.out.println("The Brand name :" + opp1.getBrand());
                System.out.println("The Model name :" + opp1.getModel());
                System.out.println("The Price :" + opp1.getPrice() + "/-");
                System.out.println("About this item\n" + //
                        "\u001a Display - 6.1inch, 1080 x 2400 pixels\n" + //
                        "\u001a Front Camera - 32 Megapixel\n" + //
                        "\u001a Main Camera - 64 Megapixel\n" + //
                        "\u001a Operating System - Android 12\n" + //
                        "\u001a Storage - 128 GB | 256 GB\n" + //
                        "\u001a RAM - 8 GB | 12 GB\n" + //
                        "\u001a Processor - Snapdragon 695 5G \n" + //
                        "\u001a Battery - 5000 mAh\n");
                cartOption1 = "opp1";
                // cartOption2 =1;
                p.option(cartOption1);
                break;
            case 2:
                // reno 10 pro 5g
                System.out.println("The Brand name :" + opp2.getBrand());
                System.out.println("The Model name :" + opp2.getModel());
                System.out.println("The Price :" + opp2.getPrice() + "/-");
                System.out.println("About this item\n" + //
                        "\u001a Display - 6.7inch, 1080 x 2412 pixels\n" + //
                        "\u001a Front Camera - 32 Megapixel\n" + //
                        "\u001a Main Camera - 50 Megapixel\n" + //
                        "\u001a Operating System - Android 12\n" + //
                        "\u001a Storage - 128 GB | 256 GB\n" + //
                        "\u001a RAM - 8 GB | 12 GB\n" + //
                        "\u001a Processor - Snapdragon 778G 5G \n" + //
                        "\u001a Battery - 4600 mAh\n");
                cartOption1 = "opp2";
                // cartOption2 =2;
                p.option(cartOption1);
                break;
            case 3:
                // oppo f21s pro
                System.out.println("The Brand name :" + opp3.getBrand());
                System.out.println("The Model name :" + opp3.getModel());
                System.out.println("The Price :" + opp3.getPrice() + "/-");
                System.out.println("About this item\n" + //
                        "> Display - 6.7inch, 1080 x 2400 pixels\n" + //
                        "> Front Camera - 32 Megapixel\n" + //
                        "> Main Camera - 64 Megapixel\n" + //
                        "> Operating System - Android 12\n" + //
                        "> Storage - 128 GB \n" + //
                        "> RAM - 8 GB \n" + //
                        "> Processor - Snapdragon 680 4G  \n" + //
                        "> Battery - 4500 mAh\n");
                cartOption1 = "op3";
                // cartOption2 =3;
                p.option(cartOption1);
                break;
            case 4:
                welcome2();
                break;
            default:
                System.out.println("The Product is Not Found");
                break;
        }
    }
}
