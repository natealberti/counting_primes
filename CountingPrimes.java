import java.util.Scanner;


public class CountingPrimes{

     public static void main(String []args){
         
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        
        // parsing stdin into ints
        String[] arr = input.split(",");
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        
        // finding the primes between m and n (inclusive)
        int accumulator = 0;
        for(int i = n; i < m; i++) {
            if(prime(i))
                accumulator++;
        }
        
        System.out.println(accumulator);
        
     }
     
  // tests if a number is prime
     public static boolean prime(int num) {
         for(int i=2;i<=num/2;i++) {
        int temp = num%i;
	    if(temp==0) {
	        return false;
	    }
	   }
	   return true;
     }
}
