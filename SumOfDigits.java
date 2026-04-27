/*Given a positive number n. Find the sum of all the digits of n.

Examples:
Input: n = 687
Output: 21
Explanation: Sum of 687's digits: 6 + 8 + 7 = 21
Input: n = 12
Output 3
Explanation: Sum of 12's digits: 1 + 2 = 3
Constraints:
1 <= n <= 105*/


class SumOfDigits {
    static int sumOfDigit(int n) {
    int sum = 0;
    while (n > 0) {
    int digit = n % 10; 
    sum += digit;       
    n = n / 10; 
    }
return sum;
    }
   public static void main(String[] args) {
     System.out.println(sumOfDigit(687)); 
    System.out.println(sumOfDigit(12));
    }
}