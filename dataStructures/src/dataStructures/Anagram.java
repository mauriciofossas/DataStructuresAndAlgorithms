package dataStructures;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
	//Given two strings s and t , write a function to determine if t is an anagram of s.
	
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> first = new HashMap<Character, Integer>();
        Map<Character, Integer> second = new HashMap<Character, Integer>();
        if(s.length() != t.length()){
            return false;
        }
        for (int i = 0; i < s.length(); ++i){
            if (first.containsKey(s.charAt(i))){
                first.put(s.charAt(i), first.get(s.charAt(i))+1);
            } else{
                first.put(s.charAt(i), 1);
            }
            if (second.containsKey(t.charAt(i))){
                second.put(t.charAt(i), second.get(t.charAt(i))+1);
            } else{
                second.put(t.charAt(i), 1);
            }
        }
        if(first.equals(second)){
            return true;
        } else{
            return false;
        }
    }
}
