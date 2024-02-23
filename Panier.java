import java.util.ArrayList;

public class Panier {

    ArrayList<Produit> Panier = new ArrayList<Produit>();

    // on va creer cette methode pour ajouter un produit disponible dans le panier

    public void addProduit(Produit produit) {
        Panier.add(produit);
    }

    // - L'ajout d'une méthode "public int prixTotalPanier()"" qui retourne le prix du panier en additionnant le prix de chaque Produit du Panier

    public int prixTotalPanier() {
        int total = 0;
        for (Produit produit : Panier) {
            total += produit.getPrix();
        }
        System.out.println("Le prix total de votre panier est : " + total + "$");
        return total;

    }
}
