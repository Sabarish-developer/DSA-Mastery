class Solution {
    static Long[] lcmAndGcd(Long a, Long b) {
        // code here
        long aa = a;
        long bb = b;
        while(a>0 && b>0){
            if(a > b)
                a = a%b;
            else
                b = b%a;
        }
        long gcd = a!=0 ? a : b;
        
        
        return new Long[] {(aa*bb)/gcd,gcd};
    }
};
/*
Time complexity - O(log (min(a,b)))

Note : 
 gcd(a,b) = gcd(a-b,b) or gcd(a%b,b)
 a * b = gcd * lcm


*/