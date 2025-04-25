class F {
    public static void main(String[] args) {
        SpiderMan a = new SpiderMan();
        ShaktiMan b = new ShaktiMan();

        inviteForLunch(a);
        inviteForLunch(b);
    }   
    
    static void inviteForLunch(SpiderMan x) {
        System.out.println("Welcome");
        System.out.println("Serve Food");
    }
}

/*F.java:7: error: incompatible types: ShaktiMan cannot be converted to SpiderMan
        inviteForLunch(b);
                       ^
Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
1 error*/