package Entity;

import java.util.*;

/**
 * 
 */
public class Utilisateur extends Personne {

    /**
     * Default constructor
     */
    public Utilisateur() {
    }

   
    public List<String> getListe_acteurs_pref() {
		return liste_acteurs_pref;
	}


	public void setListe_acteurs_pref(List<String> liste_acteurs_pref) {
		this.liste_acteurs_pref = liste_acteurs_pref;
	}


	public List<String> getListe_series_pref() {
		return liste_series_pref;
	}


	public void setListe_series_pref(List<String> liste_series_pref) {
		this.liste_series_pref = liste_series_pref;
	}


	public List<Genre> getListe_preferences() {
		return liste_preferences;
	}


	public void setListe_preferences(List<Genre> liste_preferences) {
		this.liste_preferences = liste_preferences;
	}


	public List<Notif> getListe_notifs() {
		return liste_notifs;
	}


	public void setListe_notifs(List<Notif> liste_notifs) {
		this.liste_notifs = liste_notifs;
	}


	private List<String> liste_acteurs_pref;

   
    private List<String> liste_series_pref;

   
    private List<Genre> liste_preferences;

   
    private List<Notif> liste_notifs;

}