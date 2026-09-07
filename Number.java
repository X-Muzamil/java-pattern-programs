class Number{
    static int n = 9;
    public static void numbers(){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
        System.out.println();
        }
    }

    public static void N_paramid(){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
        System.out.println();
        }
        System.out.println();
    }

    
    public static void N_Reverseparamid(){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
        System.out.println();
        }
    }
}