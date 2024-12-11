import java.util.List;

public class Hyperviseur extends parfeu{

    // ATTRIBUTS

    private String hostName;
    private String HIp;
    private List<String> VMList;
    private Boolean started;

    // CONSTRUCTEUR

    public Hyperviseur() {
        super();
    }

    // MÉTHODE

    public void start() {
        this.started = true;
    }

    public void stop() {
        this.started = false;
    }

    // GETTER & SETTER

    public String getHostName() {
        return hostName;
    }
    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getHIp() {
        return HIp;
    }
    public void setHIp(String hIp) {
        HIp = hIp;
    }

    public List<String> getVMList() {
        return VMList;
    }
    public void setVMList(List<String> vMList) {
        VMList = vMList;
    }

        public Boolean isStarted() {
        return started;
    }
    

}
