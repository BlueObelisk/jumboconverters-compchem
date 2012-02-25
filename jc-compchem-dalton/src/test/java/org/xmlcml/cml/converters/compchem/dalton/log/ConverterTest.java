package org.xmlcml.cml.converters.compchem.dalton.log;

import java.io.InputStream;

import org.apache.log4j.Logger;
import org.junit.Ignore;
import org.junit.Test;
import org.xmlcml.cml.converters.compchem.core.CompchemText2XMLTemplateConverter;
import org.xmlcml.cml.converters.compchem.testutils.TestUtils;
import org.xmlcml.cml.converters.templates.output.Text2XMLTemplateConverter;
import org.xmlcml.cml.converters.testutils.JumboConvertersRegressionSuite;
import org.xmlcml.euclid.Util;

public class ConverterTest {
	private static Logger LOG = Logger.getLogger(ConverterTest.class);

	private static final String IN_SUFFIX = ".in";
	private static final String XML_SUFFIX = ".xml";

	private String codeType = "dalton";
	private String fileType = "log";

	@Test
	public void dummy() {
		
	}
	
	// tests fail because of whitespace somewhere. Needs an evening's work
	@Ignore
	@Test   public void testInternuc()        {testConverter("internuc");}

    @Test
    @Ignore // more to do here
    public void daltonOut2XML() {
		Text2XMLTemplateConverter converter = createConverter("org/xmlcml/cml/converters/compchem/"+codeType+"/"+fileType+"/topTemplate.xml");
		JumboConvertersRegressionSuite.run("compchem/"+codeType+"/"+fileType, "log", "xml", converter, true);
    }
   
	private void testConverter(String name) {
		String templateXML = "org/xmlcml/cml/converters/compchem/"+codeType+"/"+fileType+"/topTemplate.xml";
		Text2XMLTemplateConverter converter = createConverter(templateXML);
		TestUtils.runConverterTest(converter, 
				"compchem/"+codeType+"/"+fileType+"/templates/"+name+IN_SUFFIX, 
				"compchem/"+codeType+"/"+fileType+"/templates/"+name+XML_SUFFIX,
				true);
	}
		
	private Text2XMLTemplateConverter createConverter(String templateXML) {
		Text2XMLTemplateConverter converter = null;
		try {
			InputStream templateStream = Util.getInputStreamFromResource(templateXML);
			converter = CompchemText2XMLTemplateConverter.createTemplateConverter(templateStream, codeType, fileType);
		} catch (Exception e) {
			throw new RuntimeException("Cannot make template ", e);
		}
		return converter;
	}

}
