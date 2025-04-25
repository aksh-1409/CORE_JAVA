class Student {
    public static void main(String[] args) {
        Pen x = new Pen();

        x.write();  //Access through Instantiation
    }
}

class Pen {
    void write() {
        System.out.println("write()");
    }
}


// Student ----> HAS-A ----> Pen