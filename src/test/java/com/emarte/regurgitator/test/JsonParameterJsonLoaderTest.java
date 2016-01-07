package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.*;
import com.emarte.regurgitator.extensions.JsonParameterJsonLoader;
import org.junit.Test;

import java.io.IOException;
import java.util.HashSet;

import static junit.framework.Assert.assertEquals;

public class JsonParameterJsonLoaderTest extends JsonBaseTest {
	private JsonParameterJsonLoader toTest = new JsonParameterJsonLoader();

	@Test
	public void testMin() throws IOException, RegurgitatorException {
		assertExpectation("classpath:/JsonParameter_min.json", "com.emarte.regurgitator.extensions.JsonParameter:['json-parameter-1',com.emarte.regurgitator.core.ParameterPrototype:['name',com.emarte.regurgitator.core.StringType:[],com.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',com.emarte.regurgitator.core.ContextLocation:['location'],com.emarte.regurgitator.extensions.JsonPathProcessor:['jsonpath.jsonpath'],null]");
	}

	@Test
	public void testMax() throws IOException, RegurgitatorException {
		assertExpectation("classpath:/JsonParameter_max.json", "com.emarte.regurgitator.extensions.JsonParameter:['json-parameter-1',com.emarte.regurgitator.core.ParameterPrototype:['name',com.emarte.regurgitator.core.NumberType:[],com.emarte.regurgitator.core.ConflictPolicy:LEAVE],'context',com.emarte.regurgitator.core.ContextLocation:['context:location'],com.emarte.regurgitator.extensions.JsonPathProcessor:['jsonpath.jsonpath'],com.emarte.regurgitator.test.stuff.TestValueProcessor:[]]");
	}

	@Test
	public void testMaxFlat() throws IOException, RegurgitatorException {
		assertExpectation("classpath:/JsonParameter_maxFlat.json", "com.emarte.regurgitator.extensions.JsonParameter:['json-parameter-1',com.emarte.regurgitator.core.ParameterPrototype:['name',com.emarte.regurgitator.core.NumberType:[],com.emarte.regurgitator.core.ConflictPolicy:LEAVE],'context',com.emarte.regurgitator.core.ContextLocation:['context:location'],com.emarte.regurgitator.extensions.JsonPathProcessor:['jsonpath.jsonpath'],com.emarte.regurgitator.test.stuff.TestValueProcessor:[]]");
	}

	@Test
	public void testFullLoad() throws IOException, RegurgitatorException {
		ConfigurationFile.loadFile("classpath:/JsonParameter_fullLoad.json");
	}

	private void assertExpectation(String filePath, String expected) throws RegurgitatorException, IOException {
		assertEquals(expected, toTest.load(getJsonObject(filePath), new HashSet<Object>()).toString());
	}
}
