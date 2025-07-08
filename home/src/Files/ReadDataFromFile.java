package Files;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;

public class ReadDataFromFile {
    public static void main(String[] args){

        // Reading CHAR by CHAR

//        try{
//            FileInputStream fin = new FileInputStream("C:\\Users\\otili\\IdeaProjects\\PracticeJ\\home\\src\\Files\\example.txt");
//            int i;
//            while((i = fin.read()) != -1){
//                System.out.println((char)i);
//            }
//            fin.close();
//        }catch (Exception e){
//            System.out.println(e);
//        }

        // Reading LINE by LINE

        try{
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\otili\\IdeaProjects\\PracticeJ\\home\\src\\Files\\example.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (Exception e) {
            System.out.println(e);;
        }
    }
}
