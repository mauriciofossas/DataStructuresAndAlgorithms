package dataStructures;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class NoRepetition {
	
	//Given a string, find the length of the longest substring without repeating characters.

	public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0){
            return 0;
        }
        Set<Integer> longest = new HashSet<Integer>();
        for (int i = 0; i < s.length(); ++i){
            longest.add(recursiveCall(s, i));
        }
        return Collections.max(longest);
    }
    
    private int recursiveCall(String s, int index){
        int count = 0;
        Set<Character> found = new HashSet<Character>();
        for (int i = index; i < s.length(); ++i){
            if(found.add(s.charAt(i))){
                ++count;
            } else{
                break;
            }
        }
        return count;
    }
}
