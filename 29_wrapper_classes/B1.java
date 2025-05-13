class B1 {
    public static void main(String[] args) {
        Character x = new Character(65);

        System.out.println(x);
    }    
}

/*B1.java:3: error: incompatible types: possible lossy conversion from int to char
        Character x = new Character(65);
                                    ^
Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
1 error*/