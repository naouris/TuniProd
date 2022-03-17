
package tn.tuniprob.gestionmagasin;

/**
 *
 * @author ACER
 */
public class Vendeur extends Employe{
    
    private float TauxDeVendeur;
    
     public Vendeur(){}
     
     public Vendeur(float TauxDeVendeur, int id, String nom, String adresse, int nbr_heure) {
        super(id, nom, adresse, nbr_heure);
        this.TauxDeVendeur = TauxDeVendeur;
    }

    
    public float getTauxDeVendeur() {
        return TauxDeVendeur;
    }

    public void setTauxDeVendeur(float TauxDeVendeur) {
        this.TauxDeVendeur = TauxDeVendeur;
    }

    @Override
    public String toString() {
        return super.toString()+"Vendeur:{" + "TauxDeVendeur=" + TauxDeVendeur +'}';
    }
    
    @Override
    public float calculerSalaire() {
            return 450*TauxDeVendeur;
    }
    
    
    
    
}
