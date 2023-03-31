package Entity;


import java.util.*;

/**
 * 
 */
public class Notif {

  
    public Notif() {
    }

    public Episode getEpisode() {
		return episode;
	}

	public Notif(Episode episode) {
		super();
		this.episode = episode;
	}

	public void setEpisode(Episode episode) {
		this.episode = episode;
	}

	private Episode episode;

  

}