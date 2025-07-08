import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args){
        Pattern p = Pattern.compile(".a."); //represents any single character followed by 's'
        Matcher m = p.matcher("sad");
        boolean b = m.matches();
        boolean b2 = Pattern.compile(".a.").matcher("aar").matches();
        boolean b3 = Pattern.matches(".s","as");
        System.out.println(b + " " +b2 +" "+b3);
    }
}
