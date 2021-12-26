import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner;
public class ReaderClass {
    public static boolean IsName(String data){
        if( (data.contains("NAME") || data.contains("name") || data.contains("Name"))
                && !(data.contains("Father Name") || data.contains("father name") || data.contains("FATHER NAME"))
                && !data.contains("Mother Name") || data.contains("mather name") || data.contains("MOTHER NAME")){
            return true;
        }
        return false;
    }
    public static boolean IsEmial(String data){
        if( data.contains("Email") || data.contains("EMAIL") || data.contains("Email Id")){
            return true;
        }
        return false;
    }

    public static boolean IsAddress(String data){
        if( data.contains("Address") || data.contains("ADDRESS") || data.contains("address")){
            return true;
        }
        return false;
    }
    public static boolean IsPhone(String data){
        if( data.contains("Phone") || data.contains("phone") || data.contains("PHONE")
                                   || data.contains("mobile") || data.contains("Mobile")
                                   || data.contains("Number") || data.contains("Contact No") || data.contains("contact no")
                                   || data.contains("contact")){
            return true;
        }
        return false;
    }

    public static void main(String args[]){
        try {
            File myObj = new File("C:\Users\Akash\Downloads\rainbitsSample cv 1.doc");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if(IsName(data)) {
                    System.out.println(data);
                }
                else if(IsEmial(data)){
                    System.out.println(data);
                }
                else if(IsAddress(data)){
                    System.out.println(data);
                }
                else if(IsPhone(data)){
                    System.out.println(data);
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
