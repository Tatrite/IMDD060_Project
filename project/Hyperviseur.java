public class Hyperviseur extends FireWall{

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

    public boolean start() {
        this.started = true;
    }

    public boolean stop() {
        this.started = false;
    }

    // GETTER & SETTER

    public String getHostName() {
        return hostName;
    }
    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public int getHIp() {
        return HIp;
    }
    public void setHIp(int hIp) {
        HIp = hIp;
    }

    public List<String> getVMList() {
        return VMList;
    }
    public void setVMList(List<String> vMList) {
        VMList = vMList;
    }
    

}
