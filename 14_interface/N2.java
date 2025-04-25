interface Y4{
    void pro();
}

class N2 implements Y4{
    void pro() {
      
    }
}


/*N2.java:6: error: pro() in N2 cannot implement pro() in Y4
    void pro() {
         ^
  attempting to assign weaker access privileges; was public
1 error*/