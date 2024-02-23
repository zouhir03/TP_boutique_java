import java.util.ArrayList;

public class Boutique {


    ArrayList<Produit> Liste_Produit = new ArrayList<Produit>() ; 


    // on va creer cette methode pour ajouter un produit disponible dans la boutique

    public void addProduit(Produit produit) {
        Liste_Produit.add(produit) ;
    }

    // on va creer cette methode pour obtenir la liste des produits disponibles dans la boutique

    public ArrayList<Produit> getProduits() {
        return Liste_Produit ;
    }

    
    // - la creation d'une méthode `public void afficherStock()` qui va à l’aide d’une boucle, appeler la méthode `afficher()` sur chaque produits de la boutique.
    
    public void afficherStock() {
        for (int i = 0 ; i < Liste_Produit.size() ; i++) {
            Liste_Produit.get(i).afficher();
        }
    }

        
}
