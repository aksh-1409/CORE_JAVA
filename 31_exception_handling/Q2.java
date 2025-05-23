class Q2{

    public static void main(String[] args) {
 
        System.out.println("start");

        int i ;

        try{
            i = 12/0;
            System.out.println(i);
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("end");
 }
}