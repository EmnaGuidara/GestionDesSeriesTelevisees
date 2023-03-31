package Entity;
import java.io.File;
import java.util.*;

import javafx.scene.image.Image;

public class Contenu  {

    protected int annéeDeSortie;

   
    protected Langue langue;


    protected List<Pays> paysOrigine;

   
    protected Image image;


    protected List<Genre> genres;

   
    protected File synopsis;

    protected List<Map<Avis ,Utilisateur>> Avis;

   
    protected int nbrVues;
  
    public Contenu() {
    }

    
    public Contenu(String nom, int annéeDeSortie, Langue langue, List<Pays> paysOrigine, Image image, List<Genre> genre,
			File synopsis, List<Map<Entity.Avis, Utilisateur>> avis, int nbrVues) {
		super();
		this.nom = nom;
		this.annéeDeSortie = annéeDeSortie;
		this.langue = langue;
		this.paysOrigine = paysOrigine;
		this.image = image;
		this.genres = genre;
		this.synopsis = synopsis;
		Avis = avis;
		this.nbrVues = nbrVues;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public int getAnnéeDeSortie() {
		return annéeDeSortie;
	}


	public void setAnnéeDeSortie(int annéeDeSortie) {
		this.annéeDeSortie = annéeDeSortie;
	}


	public Langue getLangue() {
		return langue;
	}


	public void setLangue(Langue langue) {
		this.langue = langue;
	}


	public List<Pays> getPaysOrigine() {
		return paysOrigine;
	}


	public void setPaysOrigine(List<Pays> paysOrigine) {
		this.paysOrigine = paysOrigine;
	}


	public Image getImage() {
		return image;
	}


	public void setImage(Image image) {
		this.image = image;
	}


	public List<Genre> getGenre() {
		return genres;
	}


	public void setGenre(List<Genre> genre) {
		this.genres = genre;
	}


	public File getSynopsis() {
		return synopsis;
	}


	public void setSynopsis(File synopsis) {
		this.synopsis = synopsis;
	}


	public List<Map<Avis, Utilisateur>> getAvis() {
		return Avis;
	}


	public void setAvis(List<Map<Avis, Utilisateur>> avis) {
		Avis = avis;
	}


	public int getNbrVues() {
		return nbrVues;
	}


	public void setNbrVues(int nbrVues) {
		this.nbrVues = nbrVues;
	}


	protected String nom;

    

    
   

}
