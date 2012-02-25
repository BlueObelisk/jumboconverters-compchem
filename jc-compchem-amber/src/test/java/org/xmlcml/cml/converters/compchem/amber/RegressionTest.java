 package org.xmlcml.cml.converters.compchem.amber;

import org.junit.Ignore;
import org.junit.Test;
import org.xmlcml.cml.converters.compchem.amber.in.AmberFF2XMLConverter;
import org.xmlcml.cml.converters.testutils.JumboConvertersRegressionSuite;

/**
 *
 * @author ojd20
 */
public class RegressionTest {

	   @Test
	   @Ignore
	   public void nwchemOut2XML() {
		   JumboConvertersRegressionSuite.run("compchem/amber/in", "out", "xml",
	                          new AmberFF2XMLConverter());
	                              
	   }
}
