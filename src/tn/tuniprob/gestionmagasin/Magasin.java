 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.tuniprob.gestionmagasin;


public class Magasin {
   
    public static int nbTotal;
//
//      public static int getNbTotal() {
//        return nbTotal;
//    }
     public int nbr_empl=0;

       private Employe tabEmp[]=new Employe[20];

    private int id;
    private String nom;
    private String adresse;
    static final int CAPACITE=50;
    private Produit tab[]=new Produit[CAPACITE];
    private int nbProduits;//par defaut initialise a zero

    public Magasin() {
    }

    public Magasin(int id, String nom, String adresse) {
        this.id= id;
        this.nom = nom;
        this.adresse = adresse;
       
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id= id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getNbProduits() {
        return nbProduits;
    }
   

   
   
    public void ajouterProduit(Produit p) throws MagasinPleinException{
        
    if((nbProduits<CAPACITE)&& !chercher(p))
    {
        tab[nbProduits]=p;
         nbProduits++;
          nbTotal++;
            } 
    else 
    throw new MagasinPleinException("Magasin Plein");
    }
    
      
     public static String comparer(Magasin m1,Magasin m2)
    {
    if (m1.nbProduits>m2.nbProduits)
           return ("le magasin ayant un nombre supérieur de produits est : "+m1.nom);
    return null;
    }  
     
    
    public boolean chercher (Produit p)
    {
    for(int i=0;i<nbProduits;i++)
   //   if (Produit.comparer(p,tab[i]))
     if (tab[i].comparer(p)) //if (p.comparer(tab[i]))  
                   
    return true;
    return false;
    }
   
    
    
 public void Supprimer(Produit p)
 {
for( int i=0; i<nbProduits; i++)
 {
if(p==tab[i])
 {    
 
for(int j=i; j<nbProduits; j++)
 {
tab[j]=tab[j+1];
 }
nbProduits--;

 }
 }
 }
 
 //2eme maniére de sup
 /*public int position(Produit p)
 {
for( int i=0; i<nbProduits; i++)
{
    if(tab[i].comparer(p))
        return i;
    return -1;
}
  //2eme maniére de sup
 public void Supprimer(Produit p)
 {
     int pos=position(p);
     if(pos!=-1){
         for( int i=pos; i<nbProduits; i++)

    tab[i]=tab[i+1];
}
        nbProduits--; 
     }
 */
 
 
   
 
 
 public void AjouteEmpoye(Employe e){
    if (nbr_empl < 20) {
     tabEmp[nbr_empl]=e;
         nbr_empl++;
         
     }
 }
 
   
   
       @Override
    public String toString(){
           String s="";
        String s1="\n et les employes sont =";
        for(int i=0;i<nbProduits;i++)
            s+=tab[i].getLibelle()+tab[i].getPrix();
        for(int i=0;i<nbr_empl;i++)
            s1+=tabEmp[i].toString();
        
        return "id ="+id+" , nom ="+nom+", adresse = "+adresse+" \n et les produit sont :"+s+s1;
      
        //return "id ="+identifiant+" , nom ="+nom+", adresse = "+adresse+" \n et les produit sont :"+Arrays.toString(tab);
    }
    
    
    public void affichePrime(){
        for (int i = 0; i < nbr_empl; i++) {
       if(tabEmp[i] instanceof Responsable)            
        
        System.out.println(((Responsable)tabEmp[i]).getPrime());
        }
    }
    
    
        public void nbVendeurs(){
            int k=0; //comteur 
            for (int i = 0; i < nbr_empl; i++) {
                       if(tabEmp[i] instanceof Vendeur)  
                           //     if(tabEmp[i].getclass() ==Vendeur.class)  

                           k++;}
              System.out.println("le nb des vendeur est:"+k);

            }
         
            public void nbResponsables(){
                int k=0; //comteur 
            for (int i = 0; i < nbr_empl; i++) {
                       if(tabEmp[i] instanceof Responsable)  
                           k++;}
              System.out.println("le nb des respensable est:"+k);
   }
            public void nbCaissiers(){
                 int k=0; //comteur 
            for (int i = 0; i < nbr_empl; i++) {
              if(tabEmp[i] instanceof Caissier)  
                         k++;}
              System.out.println("le nb des respensable est:"+k);
}
           public void afficherSalaireCaissier(){
                for (int i = 0; i < nbr_empl; i++) {
              if(tabEmp[i] instanceof Caissier) 
                   System.out.println("le salaire est:"+tabEmp[i].calculerSalaire());

           }
            
            
            }
  
           
           
           
           
           
           
           
           
           
}

        
    

   
   