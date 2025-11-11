public class Client {
    private int idClient;
    private String nom;
    private String ville;
    private double chiffreAffaire;

    public Client(int idClient, String nom, String ville, double chiffreAffaire) {
        this.idClient = idClient;
        this.nom = nom;
        this.ville = ville;
        this.chiffreAffaire = chiffreAffaire;
    }

    public int getIdClient() { return idClient; }
    public String getNom() { return nom; }
    public String getVille() { return ville; }
    public double getChiffreAffaire() { return chiffreAffaire; }

    @Override
    public String toString() {
        return String.format("%d - %s - %s - %.2f", idClient, nom, ville, chiffreAffaire);
    }
}
