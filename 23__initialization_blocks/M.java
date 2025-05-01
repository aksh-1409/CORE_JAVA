class M {
    int x = 9;
    
    {
        System.out.println(x);
    }

    public static void main(String[] args) {
        M x = new M();
    }
}

/* YHA PE INITIALIZATION BLOCK ME INTANCE LEVEL VARIABLE KO ACCESS KAR RHE H JO KI H "x" TO USKE LIYE US CONDTION ME INSTANCE VARIABLE KO PHELE LIKHNA PADEGHA INITIALIZATION BLOCK KE