package kata5P2.view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author khushbu
 */
public class MailListReader {
    
    public static List<String> read (String name) throws IOException{
        List<String> mailList = new ArrayList <>();
        BufferedReader reader = new BufferedReader (new FileReader (new File(name)));
        String mail;
        while((mail= reader.readLine()) != null){
            if(mail.contains("@")!= true) continue;
            mailList.add(mail);
        }
        reader.close();
        return mailList;
    }
}
