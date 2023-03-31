package Entity;


import java.io.File;
import java.util.*;

/**
 * 
 */
public class Saison {

    /**
     * Default constructor
     */
    public Saison() {
    }

    private int numero;
   
    private Date date_debut;

    private File synopsis;

   
    private int nbEpisode;

    public List<Map<Avis ,Utilisateur>> Avis;

}