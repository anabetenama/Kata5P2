package kata5P2.main;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import kata5P2.model.Histogram;
import kata5P2.view.HistogramDisplay;
import kata5P2.view.MailHistogramBuilder;
import kata5P2.view.MailListReader;

/**
 *
 * @author khushbu
 */
public class Kata5P2 {

    public static void main(String[] args) throws IOException, Exception {
    Kata5P2 KATA5 = new Kata5P2();
    KATA5.execute();
    }
    
    public void execute() throws Exception {
        input();
        process();
        output();
    }
    List<String> mailList;
    Histogram<String> histogram;
    
    private void input() throws IOException, ClassNotFoundException, SQLException {
        String filename = ("C:\\Users\\khushbu\\Documents\\NetBeansProjects\\kata4\\emails.txt");
        mailList = MailListReader.read();
    }

    private void process() throws Exception {
        histogram = MailHistogramBuilder.build(mailList);
    }

    private void output() {
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
    
}
