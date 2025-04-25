class Student extends Pen {
    public static void main(String[] args) {
        Student x = new Student();

        x.write();   // Access through Inheritance
    }
}

class Pen {
    void write() {
        System.out.println("write some thing");
    }
}

//       Pen
//        ^  
//        |  
//        | IS-A 
//        |  
//      Student

