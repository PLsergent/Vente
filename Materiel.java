package vente;

import java.util.*;

public class Materiel extends Produit{
  private String typemateriel;
///constructeur
  public Materiel(){
    super();
    typemateriel="";
  }

  public Materiel(String nm, double pu, String tm){
    super(nm,pu);
    typemateriel=tm;
  }
///methode

  public String toString(){
    return typemateriel;
  }

  public boolean equals(Materiel r, Produit p){
    if (p.equals(nom) &&this.typemateriel.equals(r.typemateriel)) {
      return true;
    }else{
      return false;
    }
  }
  public String getTM(){
    return typemateriel;
  }

}
