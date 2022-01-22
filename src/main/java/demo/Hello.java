package demo;

import org.jdom2.Document;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

import java.io.InputStream;

public class Hello {

  public static void main(String[] args) throws Exception {

    try (InputStream input = Hello.class.getClassLoader().getResourceAsStream("simple.xml")) {
      SAXBuilder saxBuilder = new SAXBuilder();
      Document doc = saxBuilder.build(input);

      XMLOutputter xmlOutput = new XMLOutputter();
      xmlOutput.setFormat(Format.getPrettyFormat());
      xmlOutput.output(doc, System.out);
    }

  }

}
