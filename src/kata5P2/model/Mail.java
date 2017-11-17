package kata5P2.model;

public class Mail {
    private final String mail;

    public Mail(String correo) {
        this.mail = correo;
    }

    public String getMail() {
        return mail;
    }
    
    public String getDomain(){
        return mail.split("@")[1];   
    }
    
}
