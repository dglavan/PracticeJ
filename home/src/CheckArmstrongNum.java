public class CheckArmstrongNum {
    public static void main(String[] args){
        //An Armstrong number (also called a narcissistic number, pluperfect number, or pluperfect digital invariant)
        // is a number that is equal to the sum of its own digits each raised to the power of
        // the number of digits.

        int num = 153, sum=0, temp=num;

        int numDigits = String.valueOf(num).length();

        while (temp!=0){
            int digit = temp % 10;
            sum += Math.pow(digit,numDigits);
            temp /=10;
        }
        System.out.println(num==sum);
    }
}
