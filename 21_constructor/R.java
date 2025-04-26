class R {
    static int count = 0;

    R() {
        count++;
    }

    public static void main(String[] args) {
        R a = new R();    
        R b = new R();    
        R c = new R();    
        R d = new R(); 
        
        System.out.println(a.count);
        System.out.println(b.count);
        System.out.println(c.count);
        System.out.println(d.count);
    }    
}

/*agr koi cheez common hai saare objects k liye to usse static bna do or phir usko agr kuhc implemnet yha use code ko jo static h usme chnages karne ho jb bhi object bane to use construcor k andr uska changes implementation kar do*/