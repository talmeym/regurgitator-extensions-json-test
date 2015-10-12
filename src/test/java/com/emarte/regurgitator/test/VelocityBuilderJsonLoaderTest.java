package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.RegurgitatorException;
import com.emarte.regurgitator.extensions.VelocityBuilderJsonLoader;
import net.sf.json.JSONObject;
import org.junit.Test;

import java.util.HashSet;

import static junit.framework.Assert.assertEquals;

public class VelocityBuilderJsonLoaderTest extends JsonBaseTest {

	private VelocityBuilderJsonLoader toTest = new VelocityBuilderJsonLoader();

	@Test
	public void testMinimumXml() throws Exception {
		assertExpectation(getJsonObject("classpath:/VelocityBuilder.json"), "com.emarte.regurgitator.extensions.VelocityBuilder:[null,'something something']");
	}

	private void assertExpectation(JSONObject jsonObject, String expected) throws RegurgitatorException {
		assertEquals(expected, toTest.load(jsonObject, new HashSet<Object>()).toString());
	}
}
