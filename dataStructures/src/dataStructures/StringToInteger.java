package dataStructures;

public class StringToInteger {
	/*
Implement atoi which converts a string to an integer.

The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.

The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.

If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.

If no valid conversion could be performed, a zero value is returned.

Note:
Only the space character ' ' is considered as whitespace character.
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. If the numerical value is out of the range of representable values, INT_MAX (231 − 1) or INT_MIN (−231) is returned.
	 */
	
	public int myAtoi(String str) {
        if (str.length() == 0){
            return 0;
        }
        StringBuilder finalizedNumber = new StringBuilder();
        Character firstNonWhite = ' ';
        for (int i = 0; i < str.length(); ++i){
            if (str.charAt(i)==' '){
                if(firstNonWhite != ' '){
                    break;
                } if(i == str.length()-1){
                    return 0;
                }
            } else{
                if (firstNonWhite == ' '){
                     firstNonWhite = str.charAt(i);
                    if (Character.isDigit(firstNonWhite)){
                        finalizedNumber.append(str.charAt(i));
                    } else{
                        if (firstNonWhite == '-' || firstNonWhite == '+'){
                            finalizedNumber.append(str.charAt(i));
                        } else{
                            return 0;
                        }
                    }   
                } else{
                    if(Character.isDigit(str.charAt(i))){
                        finalizedNumber.append(str.charAt(i));
                    } else{
                        break;
                    }
                }
            }
        }
        if (finalizedNumber.length() == 1 && (firstNonWhite == '-' || firstNonWhite== '+')){
            return 0;
        }
        try{
            return Integer.parseInt(finalizedNumber.toString());   
        } catch(Exception e) {
            if(firstNonWhite == '-'){
                return Integer.MIN_VALUE;
            } else{
                return Integer.MAX_VALUE;
            }
        }
    }
}
