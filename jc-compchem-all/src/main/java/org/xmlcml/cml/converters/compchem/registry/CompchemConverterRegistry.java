package org.xmlcml.cml.converters.compchem.registry;

import org.xmlcml.cml.converters.registry.ConverterRegistry;

/**
 * @author pm286
 */
public class CompchemConverterRegistry extends ConverterRegistry {

    /** create singleton registry
     */
    private static CompchemConverterRegistry COMPCHEM_CONVERTER_REGISTRY = null;
    
    public static synchronized CompchemConverterRegistry getDefaultConverterRegistry() {
    	if (COMPCHEM_CONVERTER_REGISTRY == null) {
    		COMPCHEM_CONVERTER_REGISTRY = new CompchemConverterRegistry(CompchemConverterRegistry.class.getClassLoader());
    		COMPCHEM_CONVERTER_REGISTRY.populateAndRegister();
    	}
    	return COMPCHEM_CONVERTER_REGISTRY;
    }
    
    public CompchemConverterRegistry(ClassLoader classLoader) {
    	super(classLoader);
    }

    public CompchemConverterRegistry(Class clazz) {
    	super(clazz);
    }

    
}
