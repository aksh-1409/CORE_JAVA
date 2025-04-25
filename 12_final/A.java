class X1{

    void pro(){
        //---
    }

    void info(){
        //----
    }
}

class A extends X1{
    //pro() inherited and accepted as it is ..

    //aur kuch nya implement karte hue i.e. new implementation : afterall a specialized version of parent class X1
    void aaa(){
        //----
    }

    //inherited and modified (method overriding)
    void info(){
        //--modified code--
    }
}