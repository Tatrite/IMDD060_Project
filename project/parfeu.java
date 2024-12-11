package project;
import java.util.List;
public class parfeu {
//__Popriétés____________//
    private String nom;
    private Regle_parefeu[] regles_lst ;
    private List<Regle_parefeu> Regle;
    private Boolean started;

//__Constructeur____________//
    public parfeu (String nom, Regle_parefeu[] regles_lst){
        this.nom = nom;
        this.regles_lst = regles_lst;
        this.started=false;
    }

//__Setteurs and Getteurs_____//
    public String getNom(){
        return this.nom;
    }
    public void setNom(String nNom){
        this.nom = nNom;
    }
    public Regle_parefeu[] getRegles_lst(){
        return this.regles_lst;
    }

//__Méthodes__________________//

    public void start() {
        if (!this.started){
            this.started = true;
        }
        else{
            System.out.println("déja démarer");
        }
    }

    public void stop() {
        if (this.started){
            this.started= false;
        }
        else{
            System.out.println("déja arreter");
        }
    }

    public boolean addRegle (Regle_parefeu Regle){
        try {
            this.Regle.add(Regle);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean removeRegle (Regle_parefeu Regle){
        
        int id=this.Regle.indexOf(Regle);

        if (id<=0){
            this.Regle.remove(id);
            return true;
        }else{
            
            return false;
        }
    
    }

    // private __str__ afficherRegle(){
    //     return list.stream().forEach(System.out::println);
    // }

}