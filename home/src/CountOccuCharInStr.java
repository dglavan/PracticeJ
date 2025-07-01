public class CountOccuCharInStr {
    public static void main(String[] args){
        String str = "Aajfkl;aA";
        int counter = 0;
        char c = 'A';
        // Method added to Not keep track of Upper/Lower
        for(char c1: str.toCharArray()){
            if(Character.toLowerCase(c) == Character.toLowerCase(c1)){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
