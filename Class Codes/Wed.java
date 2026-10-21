class Wed{
    public static void main(String[] args) {
    //     int n = 4;
    //     while(n>0){
    //     for(int i=1; i<=5; ++i){
    //         System.out.print(i+ " ");
    //     }

    //     System.out.println();
    //     n -=1;
    // }

    for(int row = 1; row <= 10; row++){
        for(int col = 1; col<=10; ++col){
            System.out.print(" *");
        }
        System.out.println();
    }
    }
    // outer loop controls the total numbers of rows 
    // inner loop controls the total number of columns  
}