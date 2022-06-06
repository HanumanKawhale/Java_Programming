//Program to write file
import java.io.*;

public class FileWrite {
      public static void main(String[] args)throws Exception {
          FileWriter fileWriter=new FileWriter("myfile.txt");
          fileWriter.write("this is first file from java");
          fileWriter.close();
      }    
}
