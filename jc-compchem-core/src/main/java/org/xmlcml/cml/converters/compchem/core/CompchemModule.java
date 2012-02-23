package org.xmlcml.cml.converters.compchem.core;

import java.util.List;

import org.xmlcml.cml.converters.AbstractConverterModule;
import org.xmlcml.cml.converters.Converter;
import org.xmlcml.cml.converters.MimeType;

/**
 * A collection of common objects such as namespaces, dictionaries used
 * in the Foo system
 * @author pm286
 *
 */
public class CompchemModule extends AbstractConverterModule {
    
	private static final String COMPCHEM_PREFIX = null;

	public String getPrefix() {
		return COMPCHEM_PREFIX;
	}
	
	public List<MimeType> getMimeTypeList() {
		return mimeTypeList;
	}

	public List<Converter> getConverterList() {
		return converterList;
	}
	
}
