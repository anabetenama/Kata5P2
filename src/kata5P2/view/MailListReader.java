package kata5P2.view;

import java.sql.Statement;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author khushbu
 */
public class MailListReader {
    
    public static List<String> read () throws IOException, ClassNotFoundException, SQLException{
        List<String> mailList = new ArrayList <>();
        
        Class.forName("org.sqlite.JDBC");
        Connection con= DriverManager.getConnection("jdbc:sqlite:BD.DB");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT mail FROM MAIL");
        
        while(rs.next()){
            String mail= rs.getString("mail");
            if(!mail. contains("@")) continue;
            mailList.add(mail);
        }
        return mailList;
    }
}
