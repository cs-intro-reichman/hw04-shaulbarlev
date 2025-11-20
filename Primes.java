public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        
        boolean[] numbers = new boolean[n+1];
        //set all the elements with index > 1 to true
        for (int i = 2; i <= n; i++) {
            numbers[i] = true;
        }
        
        int i = 0;
        int p = 2;
        while (i < Math.sqrt(n)) {
            //cross out multiples of p
            for (int j = 0; j <= n; j++) {
                if (j > p && j % p == 0) {
                    numbers[j] = false;
                } 
            }


            //look for next p
            for (int j = p+1; j <= n; j++) {
                if (numbers[j] == true) {
                    p = j;
                    // System.out.println("index updated to: " + p);
                    break;
                }
            }
            i++;
        }

        System.out.println("Prime numbers up to " + n + ":");
        
        int numOfPrimes = 0;
        for (int m = 0; m <= n; m++) {
            if (numbers[m]) {
                System.out.println(m);
                numOfPrimes++;
            }
            
        }

        int precent = (int) ((double) numOfPrimes / n * 100);
        
        System.out.print("There are " + numOfPrimes + " primes between " + 2 + " and " + n);
        System.out.println(" (" + precent + "% are primes)");
    }
}