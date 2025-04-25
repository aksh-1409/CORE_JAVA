interface Intelligent {
    
}

interface Smart {

}

interface Entrepreneur {

}

class Human {
    
}


class American implements Intelligent, Smart, Entrepreneur extends Human  {
    
}

/*R.java:18: error: '{' expected
class American implements Intelligent, Smart, Entrepreneur extends Human  {
                                                          ^
1 error*/