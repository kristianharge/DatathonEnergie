package xmlparser;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;
import java.util.ArrayList;

public class XmlParser {
    public static void main(String[] args) { 
    try {
        ArrayList latitudes = new ArrayList<Double>();
        ArrayList longitudes = new ArrayList<Double>();
        File inputFile = new File("Data.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(inputFile);
        NodeList baseElmntLst_gold  = doc.getElementsByTagName("pdv_liste");
        Element woaw = (Element) baseElmntLst_gold.item(0);       
        NodeList nod = woaw.getChildNodes();
        Element me = null;
        int decalage = 0;
        for (int i = 0; i < nod.getLength(); ++i)
        { // PARCOURT LA LISTE DES NOEUDS
            if (nod.item(i) instanceof Element)
            {
                me = (Element) nod.item(i);
            }
            NamedNodeMap longlat = me.getAttributes();
            for (int j = 0; j < longlat.getLength(); ++j)
            { // PARCOURT LES CARACTERISTIQUES DU NOEUD
                if (j == 0){
                    Node attr = longlat.item(j);
                    if(attr.getNodeValue() != null && !attr.getNodeValue().isEmpty()){
                    //System.out.println(attr.getNodeName() + " = \"" + attr.getNodeValue() + "\"");
                        Double value = (Double.parseDouble(attr.getNodeValue()))/100000;
                        latitudes.add(value);
                        //System.out.println(latitudes.get(i-decalage));
                    }
                    else{
                        decalage += 1;
                        }
                    }
       
                else if (j == 1){
                    Node attr = longlat.item(j);
                    if(attr.getNodeValue() != null && !attr.getNodeValue().isEmpty()){
                        Double value = (Double.parseDouble(attr.getNodeValue()))/100000;
                        longitudes.add(value);  
                        //System.out.println(longitudes.get(i-decalage));
                        //System.out.println(i);
                    }
                    else{
                        decalage += 1;
                    }
                }
            }
        } 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

