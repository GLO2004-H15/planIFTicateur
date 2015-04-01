
package planifticateur.domain;
import java.awt.*;
import java.util.Vector;
import java.util.List;
import java.io.File;
import planifticateur.gui.*;

public class HoraireController {
    private Horaire horaire;
    
    public HoraireController(){
        
    }
    
    public void chargerHoraire(File f){
        //peut-être serait plus logique en tant que constructeur
        this.horaire = new Horaire(f);
    }
    
    public void saveHoraire(){
        
    }
    
    public void saveAsHoraire(){
        
    }
    
    public void addActivite(){
        
    }
    
    public void dessiner(){
        
    }
    
    public void validerHoraire(){
        
    }
    
    public void planificationAuto(){
        
    }

    public void moveActivite(Point p){
        for (Activite a: horaire.getListeActiviteComplete()){
            if (a.isSelected() == true){
                a.setPoint(p);
            }
        }
    }
    
    public void updateSelectedItemsPositions(Point delta){
        horaire.updateSelectedItemsPositions(delta);
    }
    
    public void modifierPointActivite(Point p){
        for (Activite a: horaire.getListeActiviteComplete()){
            if (a.isSelected() == true){
                //Il va y avoir une vÃ©rif Ã  faire ici Ã©ventuellement
                a.setPoint(p);
            }
        }
    }
    
    public void switchSelection(Point p){
        horaire.switchSelection(p);
    }
    
    public void note(String n){
        horaire.ajouterNote(n);
    }
 
    public  Vector<Float> getStats(int jour){
        
        return horaire.getStatistiques(jour);

    }
    
    public String getHoraireNom(){
        int i = horaire.fichierCOU.length() - 4;    //longueur du nom du fichierCOU sans le .cou
        return horaire.fichierCOU.substring(0, i);
    }
    
    public String getActiviteNom(Activite a){
        return a.getNomActivite();
    }
    
    public boolean getHoraire(){
        if (horaire != null){
            return true;
        }
        else{
            return false;
        }
    }
    public List<Activite> getListeActiviteAPlacer(){
        return horaire.getListeActiviteAPlacer();
    }

    public List<GrilleCheminement> getListeActiviteGrilleCh(){
        return horaire.getListeActiviteGrilleCh();
    }
    
    public List<Conflit> getListeConflit(){
        return horaire.getListeConflit();
    }
    
    public List<Activite> getListeActiviteDejaPlacee(){
        return horaire.getListeActiviteDejaPlacee();
    }
    
    public List<ModificationActivite> getListeModificationActivite(){
        return horaire.getListeModificationActivite();
    }
    
    public List<Activite> getListeActiviteComplete(){
        return horaire.getListeActiviteComplete();
    }
    
    public void msgErreur(){
        
    }
    
    public boolean getValiditeDeLHoraire(){
        return horaire.horaireEstValide();
    }
    //et ainsi de suite...
}