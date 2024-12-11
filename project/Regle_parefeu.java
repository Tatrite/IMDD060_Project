import java.util.List;

public class Regle_parefeu {

    // ATTRIBUTS

    private String ip;
    private Integer port;
    private String destination;
    private String protocole;
    private String nom;
    private Boolean status;
    private String authorized; 

    // GETTER & SETTER    

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

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getAuthorized() {
        return authorized;
    }

    public void setAuthorized(String authorized) {
        this.authorized = authorized;
    }

    // MÉTHODES
    
    public List<String> filtrer () {
            return 0;
        
    }

    public void active(){
        this.status = true ;
    }

    public void desactive(){
        this.status = false ;
    }
}
