package Files;

import java.io.FileOutputStream;

public class WriteToTextFile {
    public static void main(String[] args){
        try{
            FileOutputStream fout = new FileOutputStream("C:\\Users\\otili\\IdeaProjects\\PracticeJ\\home\\src\\Files\\example.txt");
            fout.write(65);
            fout.write("\nHello!".getBytes());
            fout.write("\nThis is a newly added line!".getBytes());
            fout.close();;
            System.out.println("Success!");
        }catch (Exception e){
            System.out.println(e);}
    }
}
