package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.*;
import com.emarte.regurgitator.extensions.XmlParameterJsonLoader;
import net.sf.json.JSONObject;
import org.junit.Test;

import java.util.HashSet;

import static junit.framework.Assert.assertEquals;

public class XmlParameterJsonLoaderTest extends JsonBaseTest {

	private XmlParameterJsonLoader toTest = new XmlParameterJsonLoader();

	@Test
	public void testJson() throws Exception {
		assertExpectation(getJsonObject("classpath:/XmlParameter_min.json"), "com.emarte.regurgitator.extensions.XmlParameter:['xml-parameter-1',com.emarte.regurgitator.core.ParameterPrototype:['name',com.emarte.regurgitator.core.StringType:[],com.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',com.emarte.regurgitator.core.ContextLocation:['location'],com.emarte.regurgitator.extensions.XpathProcessor:['xpath/xpath',{prefix1=uri1, prefix2=uri2}],null]");
	}

	@Test
	public void testMaximumJson() throws Exception {
		assertExpectation(getJsonObject("classpath:/XmlParameter_max.json"), "com.emarte.regurgitator.extensions.XmlParameter:['xml-parameter-1',com.emarte.regurgitator.core.ParameterPrototype:['name',com.emarte.regurgitator.core.StringType:[],com.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',com.emarte.regurgitator.core.ContextLocation:['location'],com.emarte.regurgitator.extensions.XpathProcessor:['xpath/xpath',{prefix1=uri1, prefix2=uri2}],com.emarte.regurgitator.test.stuff.TestValueProcessor:[]]");
	}

	@Test
	public void testMaximumFlatJson() throws Exception {
		assertExpectation(getJsonObject("classpath:/XmlParameter_maxFlat.json"), "com.emarte.regurgitator.extensions.XmlParameter:['xml-parameter-1',com.emarte.regurgitator.core.ParameterPrototype:['name',com.emarte.regurgitator.core.StringType:[],com.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',com.emarte.regurgitator.core.ContextLocation:['location'],com.emarte.regurgitator.extensions.XpathProcessor:['xpath/xpath',{prefix1=uri1, prefix2=uri2}],com.emarte.regurgitator.test.stuff.TestValueProcessor:[]]");
	}

	@Test
	public void testFullLoad() throws RegurgitatorException {
		ConfigurationFile.loadFile("classpath:/XmlParameter_fullLoad.json");
	}

	private void assertExpectation(JSONObject jsonObject, String expected) throws RegurgitatorException {
		assertEquals(expected, toTest.load(jsonObject, new HashSet<Object>()).toString());
	}
}
