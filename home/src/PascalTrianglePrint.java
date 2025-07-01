public class PascalTrianglePrint {
    public static void main(String[] args){
        int rows = 9;

        for(int i=0;i<rows;i++){ // outer loop - each iteration prints one row of triangle

            int num = 1; // first binomial coefficient
            System.out.format("%" + (rows-i) *2 + "s", ""); // formats spaced before first num print in each row


            for(int j=0;j<=i;j++){  // inner loop - calculates numbers on each row based on previous

                System.out.format("%4d",num); // adds each printed number in a 4-char block (e.g. 3spaces+1digit or 2spaces+2digits etc.)

                num = num * (i-j)/(j+1); // binomial coefficient formula
            }
            System.out.println(); // moves to next line after finishing one row
        }
    }
}
