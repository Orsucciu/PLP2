package xml;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import slam.sio.llb.fr.plp2.R;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;

public class LitXml {

	private List<Visite> lesVisites;
	
	public LitXml(Context context)  {
		try {
			MaSaxHandler handler = new MaSaxHandler();
			Resources resources = context.getResources();
			InputStream inputStream = resources.openRawResource(R.raw.listeprospectssimple);
			handler.parse(inputStream);
	        lesVisites = handler.getLesServices();
		} catch (Exception e) {
			Log.i("litxml", "erreur");
		}
	}
	
	public List<String> donneServices(){
		List<String> liste = new ArrayList<String>();
		for (Visite visite : lesVisites) liste.add(visite.toString());
		return liste;
	}
}
