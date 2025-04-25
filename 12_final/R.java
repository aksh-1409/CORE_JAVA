final class Y{
   static int w = 21;
}

class R{
    public static void main(String [] args){
        System.out.println(Y.w);
        Y.w = 23;

        System.out.println(Y.w);
        }
}

/*jab class final h matlb uske saare class members ko override nhi kar skte hai matlb methods ko use kar skte hai same name wale par usme bhi rules hote hai chekc karne k liye ki iverrdie ho rah hai ki nhi method  baki yek particular method ko kar dena final matlb ki bas usko override nhi kar skte ho baki methods ko kar skte hai or kisi yek varible ko final kar dena k matlb hai ki bs uski value change nhi kar skte hai , baki class final k time apn varibles ki bhi value change kar skte hai*/