package org.xmlcml.cml.converters.compchem.testutils;

import java.io.InputStream;


import org.xmlcml.cml.converters.compchem.core.CompchemText2XMLTemplateConverter;
import org.xmlcml.cml.converters.templates.output.Text2XMLTemplateConverter;
import org.xmlcml.cml.converters.testutils.JumboConvertersRegressionSuite;
import org.xmlcml.cml.converters.compchem.testutils.TestUtils1;
import org.xmlcml.euclid.Util;

/** 
 * supports testing converters
 * @author pm286
 *
 */
public class ConverterTester {

	private String inSuffix;
	private String xmlSuffix;
	private String codeType;
	private String fileType;
	
	public ConverterTester(String inSuffix, String xmlSuffix, String codeType, String fileType) {
		this.inSuffix = inSuffix;
		this.xmlSuffix = xmlSuffix;
		this.codeType = codeType;
		this.fileType = fileType;
	}

	public void runTemplateTests() {
		Text2XMLTemplateConverter converter = createConverter("org/xmlcml/cml/converters/compchem/"+codeType+"/"+fileType+"/topTemplate.xml");
		JumboConvertersRegressionSuite.run("compchem/"+codeType+"/"+fileType, "log", "xml", converter, true);
	}
	
	public Text2XMLTemplateConverter createConverter(String templateXML) {
		Text2XMLTemplateConverter converter = null;
		try {
			InputStream templateStream = Util.getInputStreamFromResource(templateXML);
			converter = CompchemText2XMLTemplateConverter.createTemplateConverter(templateStream, codeType, fileType);
		} catch (Exception e) {
			throw new RuntimeException("Cannot make template ", e);
		}
		return converter;
	}

	public void testConverter(String name) {
		inSuffix = ".xml";
		String templateXML = "org/xmlcml/cml/converters/compchem/"+codeType+"/"+fileType+"/topTemplate.xml";
		Text2XMLTemplateConverter converter = createConverter(templateXML);
		TestUtils1.runConverterTest(converter,
				"compchem/"+codeType+"/"+fileType+"/templates/"+name+inSuffix,
				"compchem/"+codeType+"/"+fileType+"/templates/"+name+xmlSuffix,
				true);
	}

	
}
