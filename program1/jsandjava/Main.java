import java.io.File;
import java.io.FileNotFoundException;
import java.io.util.Scanner;

public class ReadFile {
  public static void main(String[] args) {
    try{ 
        File myObj = new File("js.js");
        Scanner myReader = new Scanner(myObj);
        while(myReader.hasNextLine()) {
          String data = myReader.nextLine():
          System.out.println(data);
        }
      myReader.close();
    }catch (FileNotFoundException e) {
      System.out.println("an error occured");
      e.printStackTrace();
  }
}
