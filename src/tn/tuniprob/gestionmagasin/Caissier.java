
package tn.tuniprob.gestionmagasin;

/**
 *
 * @author ACER
 */
public class Caissier extends Employe{
    private int NumeroDeCaissier;
    
      public Caissier(){System.out.println("Constructeur CAISSIER");}

     public Caissier(int NumeroDeCaissier){
        this.NumeroDeCaissier=NumeroDeCaissier;
       
     }
     public Caissier(int id, String nom, String adresse,int NumeroDeCaissier,int nbr_heure){
         
       super(id, nom, adresse, nbr_heure);
        this.NumeroDeCaissier=NumeroDeCaissier;
     }
     
     public int getNumeroDeCaissier(){
         return NumeroDeCaissier;   
    }
    public void setNumeroDeCaissier(int NumeroDeCaissier){
         this.NumeroDeCaissier=NumeroDeCaissier;
    }

    @Override
    public String toString() {
        return super.toString()+"Caissier{" + "NumeroDeCaissier=" + NumeroDeCaissier + '}';
    }
    
    @Override
    public float calculerSalaire() {
        if(nbr_heure>180)
            return 180*5+(nbr_heure-180)*5.75f;
        else
            return nbr_heure*5;
    }
   
    
    
    
    
    
    
}
