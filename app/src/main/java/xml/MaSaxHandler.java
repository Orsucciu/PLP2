package xml;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


public class MaSaxHandler extends DefaultHandler {

	   private Visite visite;
	   private List<Visite> lesVisites = new ArrayList<Visite>();
	   private String valeur;

	   public void parse(InputStream is) throws ParserConfigurationException, SAXException, IOException{
		   SAXParserFactory factory = SAXParserFactory.newInstance();
		   SAXParser parser=factory.newSAXParser();
		   parser.parse(is,this);
	   }
	   public void startElement( String uri, String localName, String qName, Attributes attributes)
			   throws SAXException {
		   if (localName.equals("visite"))  visite = new Visite();
	   }
	   public void characters(char[] ch,int start, int length) throws SAXException{
			valeur = new String(ch,start,length);
		}
	   public void endElement( String uri, String localName,String qName) throws SAXException {
	        if (localName.equals("visite")) {
	        	lesVisites.add(visite);
	        }else if (localName.equals("nom")){
	        	visite.setNom(valeur);
	        }else if (localName.equals("responsable")){
	        	visite.setResponsable(valeur);
	        }
	    }
	   public List<Visite> getLesServices() {
		return lesVisites;
	   }
}
