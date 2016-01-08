package com.emarte.regurgitator.test;

import com.emarte.regurgitator.extensions.XmlSchemaValidatorJsonLoader;
import org.junit.Test;

public class XmlSchemaValidatorJsonLoaderTest extends JsonLoaderTest {
	public XmlSchemaValidatorJsonLoaderTest() {
		super(new XmlSchemaValidatorJsonLoader());
	}

	@Test
	public void testJson() throws Exception {
		assertExpectation("classpath:/XmlSchemaValidator.json", "com.emarte.regurgitator.extensions.XmlSchemaValidator:['classpath:/something.something.file']");
	}
}
