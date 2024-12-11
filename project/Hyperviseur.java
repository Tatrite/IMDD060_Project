import java.util.List;
import java.util.Scanner;

public class Hyperviseur {

    // ATTRIBUTS

    private String hostName;
    private String HIp;
    private List<VM> VMList;
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
    
    public int createVM() {
        Scanner sc = new Scanner(System.in);
        VM vm = new VM();

        System.out.println("Nom de la VM: ");
        String nom = sc.next();
        System.out.println("RAM de la VM: ");
        String ram = sc.next();
        System.out.println("CPU de la VM: ");
        String cpu = sc.next();
        System.out.println("Stockage de la VM: ");
        String stockage = sc.next();
        System.out.println("Nom du Pare-Feu de la VM: ");
        String pareFeu = sc.next();

        vm.setNom(nom);
        vm.setRAM(ram);
        vm.setCPU(cpu);
        vm.setStockage(stockage);
        vm.setPareFeu(pareFeu);

        this.VMList.add(vm);

        sc.close();
        return 1;   // Pour traiter un succès dans le main
    }

    public int deleteVM(String nom) {
        for (int i = 0; i < VMList.size(); i++) {
            if (VMList.get(i).getNom() == nom)
                VMList.remove(i);
                return 1;   // Pour traiter un succès
        }
        return -1;  // Pour traiter un échec
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

    public List<VM> getVMList() {
        return VMList;
    }
    public void setVMList(List<VM> vMList) {
        VMList = vMList;
    }

        public Boolean isStarted() {
        return started;
    }
    

}
