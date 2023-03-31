
import java.util.*;

import javafx.scene.image.Image;

/**
 * 
 */
public class Personne {

    
    public Personne() {
    }

    public Personne(String nom, String prenom, Date date_naissance, String email, Image photoDeProfile,
			String motDePasse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.date_naissance = date_naissance;
		this.email = email;
		this.photoDeProfile = photoDeProfile;
		this.motDePasse = motDePasse;
	}

	protected String nom;

    protected String prenom;

    protected Date date_naissance;

    protected String email;

    public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDate_naissance() {
		return date_naissance;
	}

	public void setDate_naissance(Date date_naissance) {
		this.date_naissance = date_naissance;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Image getPhotoDeProfile() {
		return photoDeProfile;
	}

	public void setPhotoDeProfile(Image photoDeProfile) {
		this.photoDeProfile = photoDeProfile;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	protected Image photoDeProfile;

    protected String motDePasse;

}