
import java.util.*;

/**
 * 
 */
public class Role {


    public Role() {
    }


    public Type getType() {
		return type;
	}


	public void setType(Type type) {
		this.type = type;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public Role(Type type, String nom) {
		super();
		this.type = type;
		this.nom = nom;
	}


	private Type type;

    private String nom;

}