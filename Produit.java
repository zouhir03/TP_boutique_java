public class Produit {
    // Déclaration des variables
    private String Nom ;
    private String Description ;
    private int Prix ;

    // Constructeur
    public Produit ( String Nom , String Description , int Prix ) {
        this.Nom = Nom ;
        this.Description = Description ;
        this.Prix = Prix ;
    }

    // Méthodes d'accès (getters) pour obtenir les valeurs des variables

    public String getNom() {
        return Nom ;
    }

    public String getDescription() {
        return Description ;
    }

    public int getPrix() {
        return Prix ;
    }

    // Méthodes de modification (setters) pour mettre à jour les valeurs des variables

    public void setNom(String Nom) {
        this.Nom =  Nom ;
    }

    public void setDescription(String Description) {
        this.Description =  Description ;
    }

    public void setPrix(int Prix) {
        this.Prix =  Prix ;
    }

    
    //une méthode `public void afficher()` qui va afficher avec des `System.out.println()` les informations du produit.
    public void afficher() {
        System.out.println("Produit: " + Nom);
        System.out.println("Description: " + Description );
        System.out.println("Prix: " + Prix + '$');
        System.out.println();
    }

}