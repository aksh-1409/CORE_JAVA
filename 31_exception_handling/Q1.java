class Q1{

    public static void main(String[] args) {
 
        System.out.println("start");

        int i ;

        try{
            System.out.println(i);
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("end");
 }
}
// compilation error:

/*Q1.java:10: error: variable i might not have been initialized
            System.out.println(i);
                               ^
1 error*/