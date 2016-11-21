package dessin;

import general.Etiquette;
import general.impl.EtiquetteImpl;

public class EtiquetteDessin implements ElementDeDessin {

	private Etiquette ett;
	
	public EtiquetteDessin(Etiquette ett) {
		this.ett = ett;
	}
	
	@Override
	public void dessiner() {
		// TODO Dessiner en vrai
		
		System.out.println(this.ett.getContenu());
	}

}