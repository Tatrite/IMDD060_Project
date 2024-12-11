public class VM extends parefeu{

    // ATTRIBUTS

    private String nom;
    private String RAM;
    private String CPU;
    private String stockage;
    private String pareFeu;
    private Boolean started;

    // CONSTRUCTEUR

    public VM() {
    
    }

    // MÉTHODES

    public void start() {
        this.started = true;
    }

    public void stop() {
        this.started = false;
    }

    // GETTER & SETTER

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getRAM() {
        return RAM;
    }
    public void setRAM(String rAM) {
        RAM = rAM;
    }

    public String getCPU() {
        return CPU;
    }
    public void setCPU(String cPU) {
        CPU = cPU;
    }

    public String getStockage() {
        return stockage;
    }
    public void setStockage(String stockage) {
        this.stockage = stockage;
    }

    public String getPareFeu() {
        return pareFeu;
    }
    public void setPareFeu(String pareFeu) {
        this.pareFeu = pareFeu;
    }

    public Boolean isStarted() {
        return started;
    }

    
}
