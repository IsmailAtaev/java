package exceptionLesons;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Leson1 {
    public static void main (String[] argv){
        PrintWriter pw;

        try{
            pw = new PrintWriter("jtp.txt");
            pw.println("saved");
        }catch (FileNotFoundException e){
            System.out.println(e);
        }
    }
}
