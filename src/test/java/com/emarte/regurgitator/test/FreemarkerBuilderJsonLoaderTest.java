package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.RegurgitatorException;
import com.emarte.regurgitator.extensions.FreemarkerBuilderJsonLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;

public class FreemarkerBuilderJsonLoaderTest extends JsonLoaderTest {
	public FreemarkerBuilderJsonLoaderTest() {
		super(new FreemarkerBuilderJsonLoader());
	}

	@Test
	public void testMinimumJson() throws Exception {
		assertExpectation("classpath:/FreemarkerBuilder.json", "com.emarte.regurgitator.extensions.FreemarkerBuilder:[com.emarte.regurgitator.core.ValueSource:[null,'something something']]");
	}

	@Test
	public void testFullLoadJson() throws RegurgitatorException {
		loadFile("classpath:/FreemarkerBuilder_fullLoad.json");
	}
}
