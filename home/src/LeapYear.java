public class LeapYear {
    public static void main(String[] args){
        int year = 2008;
        boolean isLeap = (year % 4==0 && year % 100 !=0) || (year % 400 ==0);
            if(isLeap){
                System.out.println(year + " is Leap year!");
            }
            else{
                System.out.println(year + " is not Leap year!");
            }
    }
}
