 package org.xmlcml.cml.converters.compchem.dummy.mol;

import org.junit.Test;

import org.xmlcml.cml.converters.testutils.JumboConvertersRegressionSuite;

/**
 *
 * @author ojd20
 */
public class ConverterTest {

	   @Test
	   public void dummyMol2CML() {
		   JumboConvertersRegressionSuite.run("compchem/dummy/mol", "mol", "xml",
	                          new DummyMol2CMLConverter());
	   }

}
