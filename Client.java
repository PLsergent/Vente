package vente;

import java.util.*;

public class Client{
  private String nomclient;
  private String prenomclient;
  private String admail;
  private ArrayList<Produit> lesProduits;
///constructeur
  public Client(){
    nomclient="";
    prenomclient="";
    admail="";
    lesProduits= new ArrayList<Produit>();
  }

  public Client (String n,String p,String mail){
    nomclient=n;
    prenomclient=p;
    admail=mail;
    lesProduits= new ArrayList<Produit>();
  }

  public Client (String n,String p,String mail,ArrayList<Produit> lp){
    nomclient=n;
    prenomclient=p;
    admail=mail;
    lesProduits=lp;
  }
///Méthode

  public String toString(){
    return nomclient+" "+prenomclient+" "+admail;
  }

  public double coutAchat(){
    double cout=0;
    for(Produit p: lesProduits){
      cout+=p.calculPrix();
    }
    return cout;
  }

  public void ajoutProduit(Produit p){
    lesProduits.add(p);
  }

  public void afficheListeProduit(){
    System.out.println("Liste Produits :");
    for(Produit p:lesProduits){
      System.out.println(p.toString());
    }
  }

}
