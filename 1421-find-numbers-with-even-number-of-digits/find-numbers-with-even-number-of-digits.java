class Solution {
    public int findNumbers(int[] nums) {
        
        // nag se save ng digit count naka initialize to zero 
        int digitCount = 0;
            
        // gamit gor loop para ma iterate ang laman ng nums 
        for(int num: nums ){
            
            // temporary storage of the digits 
            int digits=0;
            // storage of the array of nums
            int n = num;
                    // while n is not = 0 di ma be break this is to find out how many digits the number has
                while(n!=0){
                    // divide till it is not equal to zero meaning if it equals to zero it there would be no next digit
                    n/=10;
                    // digits counter
                    digits++;
                }
            //  check if the numbers on the array is even 
            if(digits % 2 == 0){
                digitCount++;
            }
        }
        return digitCount;
        
        
    }
}