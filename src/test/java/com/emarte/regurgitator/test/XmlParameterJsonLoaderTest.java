package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.RegurgitatorException;
import com.emarte.regurgitator.extensions.XmlParameterJsonLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;

public class XmlParameterJsonLoaderTest extends JsonLoaderTest {
	public XmlParameterJsonLoaderTest() {
		super(new XmlParameterJsonLoader());
	}

	@Test
	public void testJson() throws Exception {
		assertExpectation("classpath:/XmlParameter_min.json", "com.emarte.regurgitator.extensions.XmlParameter:['xml-parameter-1',com.emarte.regurgitator.core.ParameterPrototype:['name',com.emarte.regurgitator.core.StringType:[],com.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',com.emarte.regurgitator.core.ValueSource:[com.emarte.regurgitator.core.ContextLocation:['location'],null],com.emarte.regurgitator.extensions.XpathProcessor:['xpath/xpath',{prefix1=uri1, prefix2=uri2}],null]");
	}

	@Test
	public void testMaximumJson() throws Exception {
		assertExpectation("classpath:/XmlParameter_max.json", "com.emarte.regurgitator.extensions.XmlParameter:['xml-parameter-1',com.emarte.regurgitator.core.ParameterPrototype:['name',com.emarte.regurgitator.core.StringType:[],com.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',com.emarte.regurgitator.core.ValueSource:[com.emarte.regurgitator.core.ContextLocation:['location'],null],com.emarte.regurgitator.extensions.XpathProcessor:['xpath/xpath',{prefix1=uri1, prefix2=uri2}],com.emarte.regurgitator.test.stuff.TestValueProcessor:[]]");
	}

	@Test
	public void testMaximumFlatJson() throws Exception {
		assertExpectation("classpath:/XmlParameter_maxFlat.json", "com.emarte.regurgitator.extensions.XmlParameter:['xml-parameter-1',com.emarte.regurgitator.core.ParameterPrototype:['name',com.emarte.regurgitator.core.StringType:[],com.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',com.emarte.regurgitator.core.ValueSource:[com.emarte.regurgitator.core.ContextLocation:['location'],null],com.emarte.regurgitator.extensions.XpathProcessor:['xpath/xpath',{prefix1=uri1, prefix2=uri2}],com.emarte.regurgitator.test.stuff.TestValueProcessor:[]]");
	}

	@Test
	public void testFullLoad() throws RegurgitatorException {
		loadFile("classpath:/XmlParameter_fullLoad.json");
	}
}
