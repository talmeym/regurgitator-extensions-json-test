package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.RegurgitatorException;
import com.emarte.regurgitator.extensions.FreemarkerBuilderJsonLoader;
import net.sf.json.JSONObject;
import org.junit.Test;

import java.util.HashSet;

import static junit.framework.Assert.assertEquals;

public class FreemarkerBuilderJsonLoaderTest extends JsonBaseTest {

	private FreemarkerBuilderJsonLoader toTest = new FreemarkerBuilderJsonLoader();

	@Test
	public void testMinimumJson() throws Exception {
		assertExpectation(getJsonObject("classpath:/FreemarkerBuilder.json"), "com.emarte.regurgitator.extensions.FreemarkerBuilder:[null,'something something']");
	}

	private void assertExpectation(JSONObject jsonObject, String expected) throws RegurgitatorException {
		assertEquals(expected, toTest.load(jsonObject, new HashSet<Object>()).toString());
	}
}
