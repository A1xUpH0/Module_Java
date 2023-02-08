/*
Votre entreprise déménage dans de nouveaux locaux. Les cartons sont faits (34 cartons au total)
et le camion de l’entreprise de déménagement arrive. Les déménageurs remplissent leur camion
avec vos cartons. Le camion a une capacité de 9 cartons. Une fois le camion plein, ils rejoignent le
nouveau local où ils déchargent vos cartons. Ils effectuent autant de voyages que nécessaire pour
vider votre ancien local.
*/

public class Main {
  public static void main(String[] args) {

    int nbCartons = 50; // Nombre de cartons
    int contCamion = 9; // Contenance max d'un camions

    int nbCamions = 0; // Nombre de camions nécéssaire

    while(nbCartons > contCamion) {
      nbCamions++;
      nbCartons -= contCamion;
    }
    nbCamions++;
    System.out.println("DEMENAGEMENT\nOn a eu besoin de " + nbCamions + " camions.\nEte dernier camion contenait " + nbCartons + " cartons.");
  }
}