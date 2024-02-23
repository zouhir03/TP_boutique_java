import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // - la creation au moins 3 produits que vous ajoutez à la boutique avec la
        // méthode `addProduit
        Produit produit1 = new Produit("Téléphone", "Iphone 15 pro max 256 G", 2000);
        Produit produit2 = new Produit("Ordinateur", "Macbook Air", 3000);
        Produit produit3 = new Produit("Chargeur", "Chargeur fast charge de capacite 40W", 45);

        // - la creation d'une instance de `Boutique`
        Boutique boutique = new Boutique();
        // l'ajout des produits à la boutique avec la méthode `addProduit`
        boutique.addProduit(produit1);
        boutique.addProduit(produit2);
        boutique.addProduit(produit3);

        // - on recupére les produits du magasin en appellant la méthode `getProduits()`
        // boutique.getProduits() ;

        // une boucle pour afficher le nom des produits qu’on peut acheter
        for (int i = 0; i < boutique.getProduits().size(); i++) {
            System.out.println(boutique.getProduits().get(i).getNom());
        }

        System.out.println();

        // Affichage du stock
        boutique.afficherStock();

        System.out.println("------------------------------------");

        // on ajoute maintenant à la Boutique, des instances de ProduitElectronique,
        // ProduitAlimentaire et ProduitBoisson au lieu de Produit
        boutique.addProduit(new ProduitElectronique("Télévision", "samsung", 799, 24));
        boutique.addProduit(new ProduitAlimentaire("Pain", "toast Nature", 2, LocalDate.of(2024, 2, 28)));
        boutique.addProduit(new ProduitBoisson("Eau minérale", "Cristaline ", 1, 150));

        // - la creation un objet Panier
        Panier panier = new Panier();

        // - L'ajouta de plusieurs produits
        panier.addProduit(produit1);
        panier.addProduit(produit2);
        panier.addProduit(produit3);

        // - L'affichage du prix total du panier
        panier.prixTotalPanier();

    }
}
