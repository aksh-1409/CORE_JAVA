class Z {
    public static void main(String[] args) {
        Short x = pro();

        System.out.println(x);
    }   
    
    static Short pro() {
        short a = 56;

        // autoboxing: boxing
        return a;
    }
}

/*

yha pe humne dkeha ki yha pe

hum local variable ko access kr pe rhe h to access karne ke tareeke

1. direct access
2. method call karke access karna jo value return karega
3. wrapper class ke andar access karna


*/