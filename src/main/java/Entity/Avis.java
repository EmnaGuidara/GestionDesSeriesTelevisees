package Entity;


import java.util.*;


public class Avis {

    public float getNote() {
		return note;
	}



	public void setNote(float note) {
		this.note = note;
	}



	public List<String> getCommentaire() {
		return commentaire;
	}



	public void setCommentaire(List<String> commentaire) {
		this.commentaire = commentaire;
	}



	public Avis() {
    }

    private float note;

 
    
    private List<String> commentaire;

}