import java.util.Date;
//import java.sql.Date; 

class H{
    public static void main(String[] args){
    Date x = new Date();

    java.sql.Date y = new java.sql.Date(78678678);

    System.out.println(x instanceof java.util.Date);
    System.out.println(y instanceof java.sql.Date);
    System.out.println(y instanceof java.util.Date);
    System.out.println(x instanceof java.sql.Date);
    }
}