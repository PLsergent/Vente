package vente;

import java.util.*;

public class Produit{
  protected String nom;
  protected double prixU;

  public Produit(){
    nom="";
    prixU=0;
  }

  public Produit(String nm, double pu){
    nom=nm;
    prixU=pu;
  }

  public boolean equals(Produit p){
    if (this.nom.equals(p.getNom())&& this.prixU==p.getPrix()){
      return true;
    }else{
      return false;
    }
  }

  public double calculPrix(){
    return prixU;
  }

  public String toString(){
    return nom;
  }

 public String getNom(){
   return nom;
 }

 public double getPrix(){
   return prixU;
 }


}
