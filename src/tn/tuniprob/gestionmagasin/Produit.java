/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.tuniprob.gestionmagasin;

import java.util.Date;

    
    public class Produit {
    private int id;
    private String libellé;
    private String marque;
    private float prix;
    private Date date_expiration;
   
    public Produit(){}
   
    public Produit(int id,String libellé,String marque){
    this.id=id;
    this.libellé=libellé;
    this.marque=marque;
    }
   
   
    public Produit (int id,String libellé,String marque,float prix){
    this.id=id;
    this.libellé=libellé;
    this.marque=marque;
    if(prix>0){
    this.prix=prix;}    
    }
   
    public Produit (int id,String libellé,String marque,float prix,Date date_expiration){    
    this.id=id;
    this.libellé=libellé;
    this.marque=marque;
   
    this.prix=prix;
    this.date_expiration=date_expiration;
    }
    
  public int getId() {
        return id;
    }
  public void setId(int id) {
  this.id= id;
}  

   
   
    public String getLibelle() {
        return libellé;
    }
    public void setLibelle(String libellé) {
this.libellé = libellé;
}  
 
   
   
      public String getMarque() {
        return marque;
    }
        public void setMarque(String marque) {
        this.libellé = libellé;
}  
 
  public float getPrix() {
        return prix;
    }  
  public void setPrix(float prix)
  { if(prix>0)
  this.prix=prix;
  }

  public Date getDate_expiration()
  { return date_expiration;}
 
  public void setDate_expiration(Date date_expiration)
  { this.date_expiration=date_expiration;}
  
  
    public boolean comparer(Produit p){
    if (this.id==p.id && this.prix==p.prix &&this.libellé.equals(p.libellé))
    // ou bien return (this.id==p.id&& this.prix==prix &&this.libellé.equals(p.libellé);
        return true;
    else
        return false;
       
    }
   
    public static boolean comparer(Produit p1,Produit p2)
    {
    if (p1.id==p2.id && p1.prix==p2.prix &&p1.libellé.equals(p2.libellé))
           return true;
    else
        return false;
    }  
   
         


   public void afficher(){
   
    System.out.println("L'id est "+id+",de libellé "+libellé+",de marque "+marque+" et de prix "+prix);
}
   
    @Override
    public String toString()
    {return "L'id est "+id+",de libellé "+libellé+",de marque "+marque+" ,de prix "+prix+"et la date d expiration = "+date_expiration ;}  
   
  

 
 public boolean equals(Object obj){
         if (obj==null)
             return false;

         if (this==obj)
             return true;
         if (this.getClass()!=obj.getClass())
             return false;
         Produit other=(Produit)obj; //down cast
         return this.id==other.id && this.prix==other.prix &&this.libellé.equals(other.libellé);

         
 }
 
 
 
}