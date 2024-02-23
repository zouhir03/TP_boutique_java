public class ProduitElectronique extends Produit {
    
    private int dureeGarantie ;

    // Constructeur
    public ProduitElectronique ( String Nom , String Description , int Prix , int dureeGarantie) {
        super(Nom , Description , Prix) ;
        this.dureeGarantie = dureeGarantie ;
    }

    // Méthode pour afficher les informations du produit électronique
    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Durée de garantie: " + dureeGarantie + " mois");
        System.out.println();
    }

}
