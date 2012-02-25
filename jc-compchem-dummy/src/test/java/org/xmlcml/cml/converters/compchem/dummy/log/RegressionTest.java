 package org.xmlcml.cml.converters.compchem.dummy.log;

import org.junit.Test;
import org.xmlcml.cml.converters.testutils.JumboConvertersRegressionSuite;

/**
 *
 * @author ojd20
 */
public class RegressionTest {

    @Test
    public void dummyLog2XML() {
    	JumboConvertersRegressionSuite.run("compchem/dummy/log", "log", "xml",
                          new DummyLog2XMLConverter());
    }
}
