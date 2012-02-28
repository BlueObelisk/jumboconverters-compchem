package org.xmlcml.cml.converters.compchem.gaussian.log;

import java.io.File;

import org.junit.Test;

public class TDDFTTest {

	@Test
	public void testTDDTFParse() throws Exception {
		GaussianLog2XMLConverter converter = GaussianLog2XMLConverter.createDefaultConverter();
		File in = new File("src/test/resources/org/xmlcml/cml/converters/compchem/gaussian/log/scott/opt_c343x.out");
//		D:\petermr-workspace\jumbo-converters\jc-compchem\jc-compchem-gaussian\src\test\resources\org\xmlcml\cml\converters\compchem\gaussian\log\scott
		
		File out = new File("src/test/resources/org/xmlcml/cml/converters/compchem/gaussian/log/scott/opt_c343x.xml");
		converter.convert(in, out);
	}
	
}
