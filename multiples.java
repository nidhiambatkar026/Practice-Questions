public class multiples {
    public static void main(String[] args) {
        int n =100;
         boolean[] primes = new boolean[n+1];
         sieve(n,primes);
    }
    static void sieve(int num , boolean[] primes){
         for(int i=2; i*i<=num;i++){
            if(!primes[i]){
                for(int j=i*2;j<=num;j=j+i){
                   primes[j]=true;
                }
            }
         }
         for(int i=2;i<=num;i++){
            if(!primes[i]){
                System.out.print(i+" ");
            }
         }
    }
}
