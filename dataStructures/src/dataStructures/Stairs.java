package dataStructures;

public class Stairs {
	/*
You are climbing a stair case. It takes n steps to reach to the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
	 */
	
	public int climbStairs(int n) {
        int[] solns = new int[n+1];
        return climbStairsHelper(n, 0, solns);
    }
	
    private int climbStairsHelper(int n, int curr, int[] storedVals){
        if(storedVals[curr] > 0){
            return storedVals[curr];
        }
        if (curr >= n){
            storedVals[curr]=1;
            return storedVals[curr];
        } else{
            if (curr + 1 == n){
                storedVals[curr] = climbStairsHelper(n, curr+1, storedVals);
            } else{
                storedVals[curr] = climbStairsHelper(n, curr+1, storedVals) + climbStairsHelper(n, curr+2, storedVals);
            }
        }
        return storedVals[curr];
    }
}
