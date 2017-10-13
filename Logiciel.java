package vente;

import java.util.*;

public class Logiciel extends Produit {
  private String typelicence;
  private double nbutil;
///constructeur
  public Logiciel(){
    super();
    typelicence="";
    nbutil=0;
  }

  public Logiciel(String nm, double pu, String tl, double nu){
    super(nm,pu);
    typelicence=tl;
    nbutil=nu;
  }
///methode

  public double calculPrix(){
    if (typelicence.equals("site")) {
      return prixU*30;
    }else if (typelicence.equals("illimite")) {
      return prixU*50;
    }else{
      return prixU*nbutil;
    }
  }

  public String toString(){
    return typelicence+" "+nbutil;
  }

  public boolean equals(Logiciel l, Produit p){
    if(p.equals(nom) && this.typelicence.equals(l.typelicence)) {
      return true;
    }else{
      return false;
    }
  }

  public String getNom(){
    return nom;
  }

  public String getTL(){
    return typelicence;
  }
}
