import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.bind.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import net.sourceforge.gxl.*;

public class GXLDoc {

	public GXLDocument gxlDocument;

	public GXLDoc() {

		try {
			File file = new File("C:/test.gxl");
			DataInputStream stream = new DataInputStream(new FileInputStream(file));

			try {
				gxlDocument = new GXLDocument(stream);
				System.out.println("try");

			} catch (SAXException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("c1");
			}
			stream.close();
		} catch (GXLValidationException ge) {
			ge.printStackTrace();
			System.out.println("c2");
		} catch (IOException ioE) {
			System.out.println("c3");
		}

	}

	public String examplemethod() {
		return gxlDocument.getDocumentElement().toString()+" "+gxlDocument.toString();
		

	}
	


}
