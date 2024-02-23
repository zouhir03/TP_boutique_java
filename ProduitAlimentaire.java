import java.time.LocalDate;

public class ProduitAlimentaire extends Produit {

    private LocalDate dateExpiration ;

    // Constructeur
    public ProduitAlimentaire ( String Nom , String Description , int Prix  , LocalDate dateExpiration) {
        super(Nom , Description , Prix) ;
        this.dateExpiration = dateExpiration ;
    }

    // Méthode pour afficher les informations du produit électronique
    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Date d'expiration: " + dateExpiration );
        System.out.println();
    }

    
}
