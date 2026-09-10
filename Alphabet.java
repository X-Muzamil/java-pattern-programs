class Alphabet{
    public static void alphabet(){
        char ch='A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
            }
            ch++;
        System.out.println();
        }
    }

    public static void alphabet_paramid(){
        for(int i=0;i<n;i++){
            char ch='A';
            for(int j=0;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
        System.out.println();
        }
    }
}