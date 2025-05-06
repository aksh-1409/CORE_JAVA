class Z2{

    public static void main(String[] args) {
   
        int[][] x = {
            {12,23,45,56},
            {5,7,9},
            {3,34}
        };

        int [][] y = new int[x.length][];
        for(int i=x.length-1;i>=0;i--){
            y[2-i] = new int[x[i].length];
            for(int j=0;j<x[i].length;j++){
                y[2-i][j] = x[i][j];
            }
        }

        // alternative: of upper code
        
        // for(int i=x.length-1,k=0;i>=0;i--,k++){
        //     y[k] = new int[x[i].length];
        //     for(int j=0;j<x[i].length;j++){
        //         y[k][j] = x[i][j];
        //     }
        // }

         for(int i=0;i<y.length;i++){
            for(int j=0;j<y[i].length;j++){
                System.out.print(y[i][j] + " ");
            }
            System.out.println();
        }

    }
}