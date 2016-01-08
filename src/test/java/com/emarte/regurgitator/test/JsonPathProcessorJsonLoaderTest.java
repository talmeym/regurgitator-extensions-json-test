package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.*;
import com.emarte.regurgitator.extensions.JsonPathProcessorJsonLoader;
import net.sf.json.JSONObject;
import org.junit.Test;

import java.util.HashSet;

import static junit.framework.Assert.assertEquals;

public class JsonPathProcessorJsonLoaderTest extends JsonBaseTest {

	private JsonPathProcessorJsonLoader toTest = new JsonPathProcessorJsonLoader();

	@Test
	public void testMinimumJson() throws Exception {
		assertExpectation(getJsonObject("classpath:/JsonPathProcessor.json"), "com.emarte.regurgitator.extensions.JsonPathProcessor:['something.something']");
	}

	@Test
	public void testFullLoad() throws RegurgitatorException {
		ConfigurationFile.loadFile("classpath:/JsonPathProcessor_fullLoad.json");
	}

	private void assertExpectation(JSONObject jsonObject, String expected) throws RegurgitatorException {
		assertEquals(expected, toTest.load(jsonObject, new HashSet<Object>()).toString());
	}
}
