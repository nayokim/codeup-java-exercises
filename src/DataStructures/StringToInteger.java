package DataStructures;

public class StringToInteger {


    //Given a String, return its appropriate number value
    //ignore all white-space at the beginning of the string
    //number may begin with a negative or positive
    // all characters that come after the number should be ignored
    // String is invalid if a character that is not a white-space or sign comes before the number.
    // If string does not contain any integer values, it is invalid.
    // The return value for any invalid string is 0.
    // Resulting integer cannot be larger than (2^31) — 1 or smaller than -(2^31).


    // input : string
    //output : integer

    //"4193 with words" - 4193
    //Input: “+50.890”Output: 50

    //data structure : arrays

    //psudeocode:
    /*
    start with index = 0;
    - while character at current index is white-space, increment index
    - check if the next character is invalid // return 0
    - check if the next character is positive or negative sign  - if negative, mark number as negative and increment index
    - loop through string integer array - cast string character into integer - multiply integer by (10^index) and add to return value
    - if string contained negative sign, multiply result by -1. if result value is less than min, reassign to min. If result is greater than max, reassign to max.
    - return value
     */


}
