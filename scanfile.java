import java.io.*;
import java.util.Scanner;



public class st {
    public static void main(String[] args) {
        try {
            File file = new File("new.txt");
            Scanner s = new Scanner(file);
            int count=0;
            while(s.hasNext())
            {
                String text=s.next();
                if (text.equals("java"))
                {
                    count++;
                }
            }
            System.out.println("count:"+count);
        }catch (FileNotFoundException e)
        {
            e.getStackTrace();
        }
    }
}
