import java.util.Scanner;

class B1 {
    void pro() {
        System.out.println("Helloooooo...");
    }
}

class B2 extends B1 {
    // method overriding
    void pro() {
        System.out.println("Hiiiiii...");
    }
}

class B3 extends B1 {
    // method overriding
    void pro() {
        System.out.println("Namaskar");
    }
}

class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Press 1 for B2 Child wala method... and 2 for B3 child wala method: ");
        int input = sc.nextInt();
        
        B1 x = null;

        // 
        if(input == 1) {
            x = new B2();
        } else {
            x = new B3();
        }

        // Dynamic Method Dispatch (Runtime Polymorphism)
        x.pro();
    }    
}