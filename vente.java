/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vente;

import java.util.ArrayList;

/**
 *
 * @author myria
 */
public class vente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Client c1 = new Client("Burdon", "Alain", "aburdon@mail.com");
        Client c2 = new Client("Courdet", "Valérie", "vcourdet@mail.com");
        Logiciel log1=new Logiciel("Word", 55,"util",12);
        Logiciel log2=new Logiciel("Photoshop", 250,"site",0);
        Logiciel log3=new Logiciel("Excel", 60,"illimite",0);
        Materiel mat1=new Materiel("Ipad mini", 350,"tablette");
        Materiel mat2=new Materiel("Toshiba", 520,"PC");
        Materiel mat3=new Materiel("DELL", 670,"PC");
        c1.ajoutProduit(mat3);
        c1.ajoutProduit(log1);
        c1.ajoutProduit(log2);
        c2.ajoutProduit(mat1);
        c2.ajoutProduit(mat2);
        c2.ajoutProduit(log3);
        c2.ajoutProduit(log1);
        ArrayList<Client> lesClients =new ArrayList<Client>();
        lesClients.add(c1);
        lesClients.add(c2);

        for (Client c : lesClients)
        {
            System.out.println("==========");
            c.afficheListeProduit();
            System.out.println("cout du client : "+c.coutAchat());
        }
        System.out.println("=====================");
        //affichage du cout d'un logiciel
        System.out.println(log1.getNom()+" "+log1.calculPrix()+"€");
        System.out.println(log2.getNom()+" "+log2.calculPrix()+"€");
        System.out.println(log3.getNom()+" "+log3.calculPrix()+"€");
        System.out.println("=====================");
        System.out.println("Compare un logiciel et un matériel");
        System.out.println(log1.equals(mat1));
        System.out.println("Compare deux logiciels différents");
        System.out.println(log1.equals(log3));
        System.out.println("Compare deux logiciels égaux");
        Logiciel log4=new Logiciel("Photoshop", 250,"site",0);
        System.out.println(log2.equals(log4));
        System.out.println("Compare deux matériels égaux");
        Materiel mat4=new Materiel("DELL", 670,"PC");
        System.out.println(mat3.equals(mat4));
    }

}
