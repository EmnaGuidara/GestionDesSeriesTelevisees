package Entity;


import java.io.File;
import java.util.*;

import javafx.scene.image.Image;


public class Film extends Contenu {


    public Film() {
    }


    public Film(Realisateur realisateur, List<Acteur> acteurs) {
		super();
		this.realisateur = realisateur;
		this.acteurs = acteurs;
	}


	public Film(String nom, int annéeDeSortie, Langue langue, List<Pays> paysOrigine, Image image, Genre genre,
			File synopsis, List<Map<Entity.Avis, Utilisateur>> avis, int nbrVues) {
		super(nom, annéeDeSortie, langue, paysOrigine, image, genre, synopsis, avis, nbrVues);
	
	}


	public Realisateur getRealisateur() {
		return realisateur;
	}

	public void setRealisateur(Realisateur realisateur) {
		this.realisateur = realisateur;
	}

	public List<Acteur> getActeurs() {
		return acteurs;
	}

	public void setActeurs(List<Acteur> acteurs) {
		this.acteurs = acteurs;
	}


	private Realisateur realisateur;

    private List<Acteur> acteurs;

}