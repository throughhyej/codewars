package codewars;

public class BitCounting {
    /* 2021.10.31
     * Bit Counting
     * https://www.codewars.com/kata/526571aae218b8ee490006f4/train/java
     */
    public int countBits(int n) {
        /*
            Write a function that takes an integer as input,
            and returns the number of bits that are equal to one in the binary representation of that number.
            You can guarantee that input is non-negative.
            Example: The binary representation of 1234 is 10011010010, so the function should return 5 in this case
        */

        /*
            bitCount: 매개변수를 2진수로 표현했을 때, 1인 개수를 반환
        */

        return Integer.bitCount(n);
    }
}
