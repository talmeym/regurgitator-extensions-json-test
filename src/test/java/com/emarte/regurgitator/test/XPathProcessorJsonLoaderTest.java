package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.RegurgitatorException;
import com.emarte.regurgitator.extensions.XPathProcessorJsonLoader;
import net.sf.json.JSONObject;
import org.junit.Test;

import java.util.HashSet;

import static junit.framework.Assert.assertEquals;

public class XPathProcessorJsonLoaderTest extends JsonBaseTest {

	private XPathProcessorJsonLoader toTest = new XPathProcessorJsonLoader();

	@Test
	public void testJson() throws Exception {
		assertExpectation(getJsonObject("classpath:/XPathProcessor.json"), "com.emarte.regurgitator.extensions.XPathProcessor:['xpath/xpath',{prefix1=uri1, prefix2=uri2}]");
	}

	@Test
	public void testMinimumJson() throws Exception {
		assertExpectation(getJsonObject("classpath:/XPathProcessor_min.json"), "com.emarte.regurgitator.extensions.XPathProcessor:['xpath/xpath',{prefix1=uri1, prefix2=uri2}]");
	}

	private void assertExpectation(JSONObject jsonObject, String expected) throws RegurgitatorException {
		assertEquals(expected, toTest.load(jsonObject, new HashSet<Object>()).toString());
	}
}
