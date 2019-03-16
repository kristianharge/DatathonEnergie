package xmlparser;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;

public class XmlParser {
    public static void main(String[] args) { 
    try {
        File inputFile = new File("Data.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(inputFile);
        NodeList nope  = doc.getElementsByTagName("pdv_liste");
        Element woaw = (Element) nope.item(0);       
        NodeList nod = woaw.getChildNodes();
        Element me = null;
        for (int i = 0; i < nod.getLength(); ++i)
        { // PARCOURT LA LISTE DES NOEUDS
            if (nod.item(i) instanceof Element)
            {
                me = (Element) nod.item(i);
            }
            System.out.println(i);
            NamedNodeMap longlat = me.getAttributes();
            for (int j = 0; j < longlat.getLength(); ++j)
            { // PARCOURT LES CARACTERISTIQUES DU NOEUD
                Node attr = longlat.item(j);
                System.out.println(attr.getNodeName() + " = \"" + attr.getNodeValue() + "\"");
            }
        } 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

