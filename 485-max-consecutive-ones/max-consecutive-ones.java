class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        //THIS GETS THE MAX COUNT 
       int maxcount =0;
        // FOR THE CURRENT COUNT  
       int currentcount =0;
        //FOR EACH LOOP TO GET ITERATE THE ARRAY WITHIN NUMS
        for(int num :nums){
            //IF NUMM ==1 THIS IF STATEMENT WILL ACTIVATE
            if(num ==1 ) {
                        // IF STATEMEMNT WAS TRUE WILL ADD CURRRENT COUNT ++
                     currentcount++;
                        // SINCE MAXCOUNT IS STILL ZERO IF CURRENT COUNT IS GREATER THEN THE MAXCOUNT IT WILL SET
                    if(currentcount > maxcount){
                        maxcount = currentcount;
                    }
                    // ELSE STATEMENT IF 1 IS NOT DETECTED IT WILL SET CURRENT COUNT TO 0 MAKING IT COUNT THE STREAK OF 1
            } else{
                currentcount =0;
                
            }
        }
        // IF THE FOR EACH LOOP IS DONE IT WILL RETRURN THE MAX COUNT OF THE CONSECUTIVE 1 STREAKS
        return maxcount;
    }
}