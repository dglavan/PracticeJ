public class RemoveWhiteSpaces {
    public static void main(String[] args){
        String str = "A u t o ma ti on";
        String result = str.replaceAll("\\s+","");
        System.out.println(result);
    }
}
