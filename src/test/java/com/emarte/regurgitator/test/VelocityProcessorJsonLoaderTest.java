package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.RegurgitatorException;
import com.emarte.regurgitator.extensions.VelocityProcessorJsonLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;

public class VelocityProcessorJsonLoaderTest extends JsonLoaderTest {
	public VelocityProcessorJsonLoaderTest() {
		super(new VelocityProcessorJsonLoader());
	}

	@Test
	public void testXml_value() throws Exception {
		assertExpectation("classpath:/VelocityProcessor_value.json", "com.emarte.regurgitator.extensions.VelocityProcessor:['something something']");
	}

	@Test
	public void testXml_file() throws Exception {
		assertExpectation("classpath:/VelocityProcessor_file.json", "com.emarte.regurgitator.extensions.VelocityProcessor:['something something']");
	}

	@Test
	public void testFullLoad() throws RegurgitatorException {
		loadFile("classpath:/VelocityProcessor_fullLoad.json");
	}
}
