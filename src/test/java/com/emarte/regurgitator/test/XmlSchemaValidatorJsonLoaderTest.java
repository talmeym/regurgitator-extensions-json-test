package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.RegurgitatorException;
import com.emarte.regurgitator.extensions.XmlSchemaValidatorJsonLoader;
import net.sf.json.JSONObject;
import org.junit.Test;

import java.util.HashSet;

import static junit.framework.Assert.assertEquals;

public class XmlSchemaValidatorJsonLoaderTest extends JsonBaseTest {

	private XmlSchemaValidatorJsonLoader toTest = new XmlSchemaValidatorJsonLoader();

	@Test
	public void testJson() throws Exception {
		assertExpectation(getJsonObject("classpath:/XmlSchemaValidator.json"), "com.emarte.regurgitator.extensions.XmlSchemaValidator:['classpath:/something.something.file']");
	}

	private void assertExpectation(JSONObject element, String expected) throws RegurgitatorException {
		assertEquals(expected, toTest.load(element, new HashSet<Object>()).toString());
	}
}
