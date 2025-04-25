class O1 {
    void pro() {
        int e;  //uninitialized variable
        int w = 9;

        System.out.println(e);
        System.out.println(w);
    }  

    public static void main(String[] args) {
        O1 a = new O1();

        a.pro();
    }
}

// O1.java:6: error: variable e might not have been initialized
//         System.out.println(e);
//                            ^
// 1 error

/*yha pe yeh ho rha h ki :- local variable ko Uninitialized varibale to rkh skte hai but jab usko access karne jayenghe jese yha pe kiya h s.o.p(e); to uske phele usko value assign karni padeghi uske baad hi access kar paynghe warna uske andr koi value hi nhi h to usko access karne jaoghe to error ajayghi isliye access karne se phele value assign karni padeghi.