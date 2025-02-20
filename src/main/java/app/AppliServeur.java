package app;


import server.Serveur;

public class AppliServeur {
    public static void main(String[] args) {
        new Thread(new Serveur(ServiceInversion.class , 1234)).start();
    }
}
