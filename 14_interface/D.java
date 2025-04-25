interface X1 {
    void pro();   // implicitly marked abstract
}


class D {
    void info();  // must be explicitly declare abstract 
}

/*D.java:7: error: missing method body, or declare abstract
    void info();  // must be explicitly declare abstract
         ^
1 error*/