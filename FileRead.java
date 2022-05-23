//Program to Read file
import java.io.*;
import java.util.*;
public class FileRead {
    public static void main(String[] args)throws Exception {
        File myfile=new File("myfile.txt");
        Scanner sc=new Scanner(myfile);
        while(sc.hasNextLine()){
            String line=sc.nextLine();
            System.out.println(line);
        }
        sc.close();
        
    }
    
}
