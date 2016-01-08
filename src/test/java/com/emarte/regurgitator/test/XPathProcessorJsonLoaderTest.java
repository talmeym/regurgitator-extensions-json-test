package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.*;
import com.emarte.regurgitator.extensions.XpathProcessorJsonLoader;
import net.sf.json.JSONObject;
import org.junit.Test;

import java.util.HashSet;

import static junit.framework.Assert.assertEquals;

public class XpathProcessorJsonLoaderTest extends JsonBaseTest {

	private XpathProcessorJsonLoader toTest = new XpathProcessorJsonLoader();

	@Test
	public void testJson() throws Exception {
		assertExpectation(getJsonObject("classpath:/XpathProcessor.json"), "com.emarte.regurgitator.extensions.XpathProcessor:['xpath/xpath',{prefix1=uri1, prefix2=uri2}]");
	}

	@Test
	public void testMinimumJson() throws Exception {
		assertExpectation(getJsonObject("classpath:/XpathProcessor_min.json"), "com.emarte.regurgitator.extensions.XpathProcessor:['xpath/xpath',{prefix1=uri1, prefix2=uri2}]");
	}

	@Test
	public void testFullLoad() throws RegurgitatorException {
		ConfigurationFile.loadFile("classpath:/XpathProcessor_fullLoad.json");
	}

	private void assertExpectation(JSONObject jsonObject, String expected) throws RegurgitatorException {
		assertEquals(expected, toTest.load(jsonObject, new HashSet<Object>()).toString());
	}
}
