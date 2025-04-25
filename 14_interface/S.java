interface Kind {
    void aaa();
}

interface Intellectual {
    void bbb();
    void ccc();
    void ddd();
}

interface Beautiful extends Kind, Intellectual {
    void eee();
    void fff();
}

class AcchaHuman implements Beautiful {
    public void aaa() { } 
    public void bbb() { } 
    public void ccc() { } 
    public void ddd() { } 
    public void eee() { } 
    public void fff() { } 
}