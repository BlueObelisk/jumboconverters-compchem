package org.xmlcml.cml.converters.compchem.gaussian.log;

import java.io.File;

import org.junit.Ignore;
import org.junit.Test;

public class LogfileTests {

	@Test
	@Ignore // BAD XINCLUDE
	public void testLog0006() throws Exception {
		GaussianLog2XMLConverter converter = GaussianLog2XMLConverter.createDefaultConverter();
		File in = new File("src/test/resources/compchem/gaussian/log/gtest/test006.log");
		File out = new File("src/test/resources/compchem/gaussian/log/gtest/test006.xml");
		converter.convert(in, out);
	}
	
	@Test
	@Ignore // BAD XINCLUDE
	public void testTDDTFParse() throws Exception {
		GaussianLog2XMLConverter converter = GaussianLog2XMLConverter.createDefaultConverter();
		// this file has been stripped of the matrices
		File in = new File("src/test/resources/org/xmlcml/cml/converters/compchem/gaussian/log/scott/opt_c343x.out");
		File out = new File("src/test/resources/org/xmlcml/cml/converters/compchem/gaussian/log/scott/opt_c343x.xml");
		converter.convert(in, out);
	}
	
	@Test
	@Ignore // BAD XINCLUDE
	public void testTDDTFParseLarge() throws Exception {
		GaussianLog2XMLConverter converter = GaussianLog2XMLConverter.createDefaultConverter();
		File in = new File("src/test/resources/org/xmlcml/cml/converters/compchem/gaussian/log/scott/opt_c343.out");
		File out = new File("src/test/resources/org/xmlcml/cml/converters/compchem/gaussian/log/scott/opt_c343.xml");
		converter.convert(in, out);
	}
	
}
