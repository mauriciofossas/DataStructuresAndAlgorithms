package dataStructures;

import java.util.HashMap;
import java.util.Map;

public class keepCitySkyline {
	/*
In a 2 dimensional array grid, each value grid[i][j] represents the height of a building located there. We are allowed to increase the height of any number of buildings, by any amount (the amounts can be different for different buildings). Height 0 is considered to be a building as well. 

At the end, the "skyline" when viewed from all four directions of the grid, i.e. top, bottom, left, and right, must be the same as the skyline of the original grid. A city's skyline is the outer contour of the rectangles formed by all the buildings when viewed from a distance. See the following example.

What is the maximum total sum that the height of the buildings can be increased?

Example:
Input: grid = [[3,0,8,4],[2,4,5,7],[9,2,6,3],[0,3,1,0]]
Output: 35
Explanation: 
The grid is:
[ [3, 0, 8, 4], 
  [2, 4, 5, 7],
  [9, 2, 6, 3],
  [0, 3, 1, 0] ]

The skyline viewed from top or bottom is: [9, 4, 8, 7]
The skyline viewed from left or right is: [8, 7, 9, 3]

The grid after increasing the height of buildings without affecting skylines is:

gridNew = [ [8, 4, 8, 7],
            [7, 4, 7, 7],
            [9, 4, 8, 7],
            [3, 3, 3, 3] ]
	 */
	public int maxIncreaseKeepingSkyline(int[][] grid) {
		int sum = 0;
		//Map used to hold the left to right maximum number.
		Map<Integer, Integer> ltrMap = new HashMap<Integer, Integer>();
		//Map used to hold the top to bottom maximum number.
		Map<Integer, Integer> ttbMap = new HashMap<Integer, Integer>();
		for (int i =0; i < grid.length; ++i){
			for (int j = 0; j < grid[i].length; ++j){
				if(ttbMap.containsKey(j)){
					if(ttbMap.get(j) < grid[i][j]){
						ttbMap.put(j, grid[i][j]);
					} 
				}else{
					ttbMap.put(j, grid[i][j]);
				}
				//If our map already has this key
				if(ltrMap.containsKey(i)){
					//We want to see if the value at j of our grid is larger
					if(ltrMap.get(i) < grid[i][j]){
						ltrMap.put(i, grid[i][j]);
					}
				}else{
					ltrMap.put(i, grid[i][j]);
				}
			}
		}
		int min = 0;
		//Our maps are populated with the maximum of each given row and column
		for(int i = 0; i < grid.length; ++i){
			for (int j = 0; j < grid[i].length; ++j){
				if (grid[i][j]==ltrMap.get(i) || grid[i][j]==ttbMap.get(j)){
					//Do nothing
				}else{
					//Find the smallest between the 2, since that is what we'll repalce with
					min = Math.min(ltrMap.get(i), ttbMap.get(j));
					sum = sum + (min-grid[i][j]);
					grid[i][j] = min;
				}
			}
		}
		return sum;
	}
}
