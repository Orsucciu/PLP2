package xml;

import java.util.List;

public class Visite {

	private String prospect;
	private String adresse;
	private List<String> produits;
	private String reference;
	private String nom;
	private String prix;
	
	public Visite() {
		super();
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setProspect(String prospect) {
		this.prospect = prospect;
	}

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

	public String toString(){
		return "visite : "+ adresse + " liste des produits : " + nom ;
	}
	
}
