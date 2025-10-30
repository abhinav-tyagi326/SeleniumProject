package TestScript;
 
import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
 
public class ReadXML {
	
	public static void main(String[] args) throws ParserConfigurationException,SAXException,IOException
	{
		File file = new File(".\\src\\test\\resources\\TestData\\stud.xml");
		DocumentBuilder docBuilder = DocumentBuilderFactory.newDefaultInstance().newDocumentBuilder();
		Document doc = docBuilder.parse(file);
		String nodenm = doc.getDocumentElement().getNodeName();
		System.out.println(nodenm);
		
		Short docnode = Node.DOCUMENT_NODE;
		System.out.println(docnode);
		
		Element rootele = doc.getDocumentElement();
		NodeList nodelst = rootele.getChildNodes();
		System.out.println(nodelst.getLength());
		
		for(int i=0; i<nodelst.getLength(); i++) {
			short nodetype= nodelst.item(i).getNodeType();
			if(nodetype == 1) {
				System.out.println(nodelst.item(i).getChildNodes());
				System.out.println(nodelst.item(i).getNodeName()+": "+nodelst.item(i).getTextContent());
				System.out.println(nodelst.item(i).getTextContent());
			}
			System.out.println(nodelst.item(i).getNodeName());
		}
		
	}
}
