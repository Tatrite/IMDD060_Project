import java.util.List;

public class Regle_parefeu {

    private String ip;
    private Integer port;
    private String destination;
    private String protocole;
    private String nom;
    private String status;
    private String authorized; 
    

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getProtocole() {
        return protocole;
    }

    public void setProtocole(String protocole) {
        this.protocole = protocole;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAuthorized() {
        return authorized;
    }

    public void setAuthorized(String authorized) {
        this.authorized = authorized;
    }


    
    public List<String> filtrer () {
            return 0;
        
    }

    public Boolean active(){
        self.active = true ;
    }

    public Boolean desactive(){
        self.active = false ;
    }
}
