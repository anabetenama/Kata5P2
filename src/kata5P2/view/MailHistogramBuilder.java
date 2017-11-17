/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata5P2.view;

import java.util.List;
import kata5P2.model.Histogram;
import kata5P2.model.Mail;

public class MailHistogramBuilder {
    public static Histogram <String> build (List<String> mail){
        Histogram<String> histo = new Histogram<String>();
        for (String mail1 : mail) {
            histo.increment(new Mail(mail1).getDomain());
            
        }
        return histo;
    }
}
