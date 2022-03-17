
package tn.tuniprob.gestionmagasin;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class TuniProd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException, MagasinPleinException {
        // TODO code application logic here
        
    Produit p0 = new Produit();
    Produit p1 = new Produit(1021,"Lait","Délice");
//  Produit p2 = new Produit(1021,"Lait","Délice"); pour la comparaison
    Produit p2 = new Produit(2510,"Yaourt","Vitalait");
    Produit p3 = new Produit(3250,"Tomate","Sicam",1.2f);
   
    //Dates 3 methodes
   
    Date d1 = new Date();//la date aujord'hui
   
    Date d2 = new Date(121, 1, 1);//date définie en avance
   
    SimpleDateFormat sd= new SimpleDateFormat ("yyyy/MM/dd");
    Date d3 = sd.parse("2021/02/02");
   
    Produit p4 = new Produit(5,"Fromage" ,"President",1.5f,d3);
    
            Produit p5 = new Produit(5,"Fromage" ,"President",1.5f,d3);

    System.out.println(p4);
   
   
    //p0.afficher();
    //p1.afficher();
    //p2.afficher();
    //p3.afficher();
 
//    System.out.println(p0.toString());
         
    p1.setPrix(0.700f);
   
//    System.out.println(p1.getPrix());
    System.out.println(p1);
   
    p2.setPrix(0.450f);  
//p2.setPrix(0.700f); pour la comparaison
    System.out.println(p2);    
   
 
    System.out.println(p3);
   
   
   
            Magasin m0=new Magasin(1,"Carrefour","Siliana");
               System.out.println("Magasin m0 "+m0.getNbProduits());
               System.out.println("total produits : "+Magasin.nbTotal);
                  m0.ajouterProduit(p1);
                  m0.ajouterProduit(p2);
                  m0.ajouterProduit(p3);
                  System.out.println(m0.toString());
    System.out.println("***********************************");
               System.out.println("Magasin m0 "+m0.getNbProduits());
               System.out.println("total produits : "+Magasin.nbTotal);
           
           
    System.out.println("***********************************");
            Magasin m1=new Magasin(2,"Monoprix","Manzah 6");
              System.out.println("Magasin m1 "+m1.getNbProduits());
              System.out.println("total produits "+Magasin.nbTotal);
                 m1.ajouterProduit(p4);
                 System.out.println(m1.toString());
    System.out.println("***********************************");
             System.out.println("Magasin m1 "+m1.getNbProduits());
             System.out.println("total produits : "+Magasin.nbTotal);
     
             System.out.println(p1.comparer(p2));
             System.out.println(Produit.comparer(p1,p2));
           
           
             System.out.println(m0.chercher(p1));
           
             m0.Supprimer(p1);
             System.out.println(m0.toString());
           
             System.out.println(Magasin.comparer(m0,m1));
           
        
        
             Caissier c1=new Caissier(1231, "ahmed" ,"1A", 50,30);
             Caissier c2=new Caissier(55051, "mohamed" ,"1B", 55,20);
             Vendeur v1=new Vendeur(2.2f, 5554, "vendeur1","gaafour",22);
              Responsable r1=new Responsable(500, 4444, "responsable","krib",2);
              
               System.out.println(c1);
             System.out.println(c2);
             System.out.println(v1);
             System.out.println(r1);
              
             m0.AjouteEmpoye(c1);
             m0.AjouteEmpoye(c2);
             m0.AjouteEmpoye(v1);
             m0.AjouteEmpoye(r1);
             
                

             Vendeur v2=new Vendeur(2.2f, 5554, "vendeur2","mar",22);
             Vendeur v3=new Vendeur(2.2f, 5554, "vendeur3","nozha",52);
             Vendeur v4=new Vendeur(2.2f, 5554, "vendeur4","beja",23);
             Responsable r2=new Responsable(500, 4444, "responsable2","kef",2);
             Responsable r3=new Responsable(550, 4444, "responsable2","kef",2);

  m1.affichePrime();
             System.out.println(v2);
             System.out.println(v3);
             System.out.println(v4);
             System.out.println(r2);
             
              m1.AjouteEmpoye(v2);
              m1.AjouteEmpoye(v3);
              m1.AjouteEmpoye(v4);
              m1.AjouteEmpoye(r2);
              m1.AjouteEmpoye(r3);


             
//    System.out.println("Le nombre total de produit est : "+Magasin.getNbTotal());
System.out.println(p3.equals(p5));

m1.nbResponsables();
m0.afficherSalaireCaissier();





    }
     
}