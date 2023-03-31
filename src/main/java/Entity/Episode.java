package Entity;

import java.io.File;
import java.util.*;

/**
 * 
 */
public class Episode {

    /**
     * Default constructor
     */
    public Episode() {
    }
private String resume;

 
    private int numero;

    private Date date_diffusion;

    private File synopsis;

    
    public Episode(String resume, int numero, Date date_diffusion, File synopsis,
			List<Map<Entity.Avis, Utilisateur>> avis, int nbr_vues) {
		super();
		this.resume = resume;
		this.numero = numero;
		this.date_diffusion = date_diffusion;
		this.synopsis = synopsis;
		Avis = avis;
		this.nbr_vues = nbr_vues;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Date getDate_diffusion() {
		return date_diffusion;
	}

	public void setDate_diffusion(Date date_diffusion) {
		this.date_diffusion = date_diffusion;
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

	public int getNbr_vues() {
		return nbr_vues;
	}

	public void setNbr_vues(int nbr_vues) {
		this.nbr_vues = nbr_vues;
	}
	private List<Map<Avis ,Utilisateur>> Avis;

    private int nbr_vues;

}