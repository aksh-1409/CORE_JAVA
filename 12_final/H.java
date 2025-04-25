class H{
    static int a;
    static int b = 9;

    static final int c ;
    static final int d = 9;
}

/*H.java:5: error: variable c not initialized in the default constructor
    static final int c ;
                     ^
1 error*/

/*abhi sir ne iska explantion nhi bata bole jab yek topic name bole the name yaad nhi voh jab padhenge tb batynghe. 

solution to it but not know the explanation. 
static{
    c=10;
} 
*/