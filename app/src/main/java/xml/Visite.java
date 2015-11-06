package xml;

public class Visite {
	private String nom;
	private String responsable;
	
	public Visite() {
		super();
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}
	public String toString(){
		return "service : "+nom+" => responsable : "+responsable;
	}
	
}
