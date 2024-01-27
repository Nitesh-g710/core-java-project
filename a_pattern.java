package project_CoreJava;

class a_pattern extends amazon{
    static int n=6;
    static void display(){
        // //box
        // for (int i = 0; i < 1; i++) {
        //     System.out.print("\t\t\t");
        //     for (int j = 0; j < 90 ; j++) {
        //         System.out.print("=");
        //     }
        //     // System.out.println();
        // }
        // System.out.println("\t\t\t");

        //dash
            System.out.print("\t\t\t");
            for (int j = 0; j < 80 ; j++) {
                System.out.print("=");
            }
            System.out.println();

            //amazon
        for (int i = 0; i < n; i++) {

            System.out.print("\t\t\t  ");
            //A
            for (int j = 0; j < n; j++) {
                if (j==0 && i>0 || j==n-1 && i>0|| i==n/2 || i==0 && j>0 && j<n-1) {
                    System.out.print("A ");   
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print(" ");

            //M
            for (int j = 0; j < n; j++) {
                if (j==0 || j==n-1 || i==j && i<n/2 || j==n-1-i && i<n/2 ) {
                    System.out.print("M ");
                    
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print(" ");

            //A
            for (int j = 0; j < n; j++) {
                if (j==0 && i>0 || j==n-1 && i>0|| i==n/2 || i==0 && j>0 && j<n-1) {
                    System.out.print("A ");
                    
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print(" ");

            //Z
            for (int j = 0; j < n; j++) {
                if (i==0 || i==n-1 || j==n-1-i) {
                    System.out.print("Z ");
                    
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print(" ");

            //O
            for (int j = 0; j < n; j++) {
                if (i==0 || i==n-1 || j==0 || j==n-1) {
                    System.out.print("O ");
                    
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print(" ");

            //N
            for (int j = 0; j < n; j++) {
                if (i==j || j==0 || j==n-1) {
                    System.out.print("N ");
                    
                } else {
                    System.out.print("  ");
                }
            }

            System.out.print("\t\t\t\n");
        }
        
            System.out.print("\t\t\t");
            for (int j = 0; j < 80 ; j++) {
                System.out.print("=");
            }
        
        System.out.print("\t\t\t\n");
    }
    static void box(){
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("#");
            }
            System.out.print("");
        }
    }

    static void QR(){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j==0 || j==1 || j==(n-1)/2 ||j==(n-1)/2 || j==(n-1)/2) {
                    box();
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    
}
