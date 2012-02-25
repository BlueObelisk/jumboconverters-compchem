 package org.xmlcml.cml.converters.compchem.dlpoly.config;

import org.junit.Test;
import org.xmlcml.cml.converters.testutils.JumboConvertersRegressionSuite;

/**
 *
 * @author ojd20
 */
public class RegressionTest {

	   @Test
	   public void config2CML() {
		   JumboConvertersRegressionSuite.run("compchem/dlpoly/config", "config", "xml",
	                          new DLPolyConfig2CMLConverter());
	   }
}
