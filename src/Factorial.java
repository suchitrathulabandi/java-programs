class Factorial {
    public static void main(String[] args){
        int n=4;
        long factorial=1;
        for(int i=1; i<=n; ++i){
            factorial=factorial*i;
        }
        System.out.printf("factorial of %d=%d: ",n,factorial);
    }
    
}
