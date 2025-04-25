class G1{
    int w=90; //variable declaration cum initialization         
    void pro(){
        w=99; //variable access
        y=90; 
    }
    G1(){
        w=89; //variable access
        z=77; 
    }
}

/*
G1.java:5: error: cannot find symbol
        y=90;
        ^
  symbol:   variable y
  location: class G1
G1.java:9: error: cannot find symbol
        z=77;
        ^
  symbol:   variable z
  location: class G1
2 errors
*/