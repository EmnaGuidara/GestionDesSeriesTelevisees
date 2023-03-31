package Entity;


import java.util.*;


 
public class Acteur extends Personne {

    public List<Map<Role, Contenu>> getListe_contenu() {
		return liste_contenu;
	}


	public void setListe_contenu(List<Map<Role, Contenu>> liste_contenu) {
		this.liste_contenu = liste_contenu;
	}


	public Acteur() {
    }

  
    private List<Map<Role,  Contenu>> liste_contenu;

}