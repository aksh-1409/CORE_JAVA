class N{
    float e=5.5f;

    public static void main(String[] args){
        
        N x = new N();
        x.pro(x);
    }

    void pro(N q){
        System.out.println(q.e);
    }
}