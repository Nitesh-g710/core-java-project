package project_CoreJava;
public class Books {

    // comic
                                                    // 16                      7
    setData c1 = new setData(800, "A Spider-man 2  ", "Marvel            ");
    setData c2 = new setData(700, "X-Men 2         ", "DC                ");
    setData c3 = new setData(185, "Avenger         ", "Marvel            ");

    // history
    setData h1 = new setData(300, "World History   ", "HG Well           ");
    setData h2 = new setData(270, "Greatest Leaders", "H book            ");
    setData h3 = new setData(185, "Race Beat       ", "Robert            ");

    // romance
    setData r1 = new setData(380, "Starts With Us  ", "Hoover            ");
    setData r2 = new setData(270, "Ends With Us    ", "Hoover            ");
    setData r3 = new setData(185, "Twisted Hate    ", "Huang             ");

    // kids
    setData k1 = new setData(380, "Activity Book   ", "Y Press           ");
    setData k2 = new setData(270, "Story book      ", "M Press           ");
    setData k3 = new setData(200, "Colouring Book  ", "SHNMN             ");

    void comic(int option){
        switch (option) {
            //a spider man 2
            case 1:
                System.out.println("Book Name - "+c1.getBrand());
                System.out.println("Model Name - "+c1.getModel());
                System.out.println("Price - "+c1.getPrice());
                System.out.println("About this item -\n\u001a Publisher : Piatkus (5 May 2022)\r\n" + //
                        "\u001a Language : English\r\n" + //
                        "\u001a Author - Ana Huang\r\n" + //
                        "\u001a Rating - 4.2 /5 \n");
                
                payment.option("c1");
                break;

            //comic
            case 2:
                System.out.println("Book Name - "+c2.getBrand());
                // System.out.println("Model Name - "+c2.getModel());
                System.out.println("Price - "+c2.getPrice());
                System.out.println("About this item - \n\u001a Author : "+c2.getModel()+
                "\nPublisher Name - XYZ"+
                "\nEdition - Xth edition");
                
                payment.option("c2");
                break;

            //comic
            case 3:
                System.out.println("Book Name - "+c3.getBrand());
                // System.out.println("Model Name - "+c3.getModel());
                System.out.println("Price - "+c3.getPrice());
                System.out.println("About this item - \n\u001a Author : "+c3.getModel()+
                "\nPublisher Name - XYZ"+
                "\nEdition - Xth edition");
                
                payment.option("c3");
                break;

            default:
                System.out.println("Invalid Input!");
                welcome.welcome2();
                break;
        }
    }

    void kids(int option){
        switch (option) {
            //activity book
            case 1:
                System.out.println("Book Name - "+k1.getBrand());
                // System.out.println("Model Name - "+k1.getModel());
                System.out.println("Price     - "+k1.getPrice());
                System.out.println("About this item - \n\u001a Author : "+k1.getModel()+
                "\nPublisher Name - XYZ"+
                "\nEdition - Xth edition");
                
                payment.option("k1");
                break;

            //story book
            case 2:
                System.out.println("Book Name - "+k2.getBrand());
                // System.out.println("Model Name - "+k2.getModel());
                System.out.println("Price - "+k2.getPrice());
                System.out.println("About this item - \n\u001a Author : "+k2.getModel()+
                "\nPublisher Name - XYZ"+
                "\nEdition - Xth edition");
                
                payment.option("k2");
                break;

            //colouring book
            case 3:
                System.out.println("Book Name - "+k3.getBrand());
                // System.out.println("Model Name - "+k3.getModel());
                System.out.println("Price - "+k3.getPrice());
                System.out.println("About this item - \n\u001a Author : "+k3.getModel()+
                "\nPublisher Name - XYZ"+
                "\nEdition - Xth edition");
                
                payment.option("k3");
                break;

            default:
                System.out.println("Invalid Input!");
                welcome.welcome2();
                break;
        }
    }

    void history(int option){
        switch (option) {
            //greatest history
            case 1:
                System.out.println("Book Name - "+h1.getBrand());
                // System.out.println("Model Name - "+h1.getModel());
                System.out.println("Price - "+h1.getPrice());
                System.out.println("About this item - \n\u001a Author : "+h1.getModel()+
                "\nPublisher Name - XYZ"+
                "\nEdition - Xth edition");
                
                payment.option("h1");
                break;

            //world leader
            case 2:
                System.out.println("Book Name - "+h2.getBrand());
                // System.out.println("Model Name - "+h2.getModel());
                System.out.println("Price - "+h2.getPrice());
                System.out.println("About this item - \n\u001a Author : "+h2.getModel()+
                "\nPublisher Name - XYZ"+
                "\nEdition - Xth edition");
                
                payment.option("h2");
                break;

            //rat beat
            case 3:
                System.out.println("Book Name - "+h3.getBrand());
                // System.out.println("Model Name - "+h3.getModel());
                System.out.println("Price - "+h3.getPrice());
                System.out.println("About this item - \n\u001a Author : "+h3.getModel()+
                "\nPublisher Name - XYZ"+
                "\nEdition - Xth edition");
                
                payment.option("h3");
                break;

            default:
                System.out.println("Invalid Input!");
                welcome.welcome2();
                break;
        }
    }

    void romance(int option){
        switch (option) {
            //ends with us
            case 1:
                System.out.println("Book Name - "+r1.getBrand());
                // System.out.println("Model Name - "+r1.getModel());
                System.out.println("Price - "+r1.getPrice());
                System.out.println("About this item - \n\u001a Author : "+r1.getModel()+
                "\nPublisher Name - XYZ"+
                "\nEdition - Xth edition");
                
                payment.option("r1");
                break;

            //starts with us
            case 2:
                System.out.println("Brand Name - "+r2.getBrand());
                // System.out.println("Model Name - "+r2.getModel());
                System.out.println("Price - "+r2.getPrice());
                System.out.println("About this item - \n\u001a Author : "+r2.getModel()+
                "\nPublisher Name - XYZ"+
                "\nEdition - Xth edition");
                
                payment.option("r2");
                break;

            //hate lover 
            case 3:
                System.out.println("Book Name - "+r3.getBrand());
                // System.out.println("Auther Name - "+r3.getModel());
                System.out.println("Price - "+r3.getPrice());
                System.out.println("About this item - \n\u001a Author : "+r3.getModel()+
                "\nPublisher Name - XYZ"+
                "\nEdition - 7th edition");
                
                payment.option("r3");
                break;

            default:
                System.out.println("Invalid Input!");
                welcome.welcome2();
                break;
        }
    }
}