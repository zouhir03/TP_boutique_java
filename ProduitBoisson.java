public class ProduitBoisson extends Produit {

    private int quantite ;

    // Constructeur
    public ProduitBoisson ( String Nom , String Description , int Prix  , int quantite) {
        super(Nom , Description , Prix) ;
        this.quantite = quantite ;
    }

    // Méthode pour afficher les informations du produit électronique
    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Quantité: " + quantite + " centilitres");
        System.out.println();
    }
    
}
