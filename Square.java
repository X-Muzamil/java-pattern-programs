class Square{
    public static void square(){
        int n = 5;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
                System.out.println();
        }

    }

    public static void rightangeTriangle(){
        int n = 8;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}