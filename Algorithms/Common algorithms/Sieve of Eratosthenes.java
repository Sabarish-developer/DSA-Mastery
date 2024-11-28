class Solution {
    public int countPrimes(int n) {
        
        if(n<2)
            return 0;

        boolean prime[] = new boolean[n];
        Arrays.fill(prime,true);
        prime[0] = false;
        prime[1] = false;
        for(int i=2; i<=Math.sqrt(n); i++){
        if(prime[i]){
            for(int j=i*i; j<n; j+=i)
                prime[j] = false;
            }
        }
        int count = 0;
        for(int i=2; i<n; i++){
            if(prime[i])
                count++;
        }
        return count;

    }
}
/*
Time complexity - O(n log(log n))
Space complexity - O(n)
*/