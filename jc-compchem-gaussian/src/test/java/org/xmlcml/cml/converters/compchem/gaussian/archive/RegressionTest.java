package org.xmlcml.cml.converters.compchem.gaussian.archive;

import org.junit.Ignore;
import org.junit.Test;
import org.xmlcml.cml.converters.testutils.JumboConvertersRegressionSuite;

/**
 *
 * @author ojd20
 */
@Ignore // till we have templates
public class RegressionTest {

	   @Test
	   public void gaussianArchive2XML() {
//	      JumboConvertersRegressionSuite.run("compchem/gaussian/archive", "arc", "xml",
//	                          new GaussianArchive2XMLConverter());
	   }

	   @Test
	   public void gaussianArchiveXML2CML() {
		   JumboConvertersRegressionSuite.run("compchem/gaussian/archive", "xml", "cml",
	                          new GaussianArchiveXML2CMLConverter());
	   }


}
