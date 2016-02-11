package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.RegurgitatorException;
import com.emarte.regurgitator.extensions.VelocityBuilderJsonLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;

public class VelocityBuilderJsonLoaderTest extends JsonLoaderTest {
	public VelocityBuilderJsonLoaderTest() {
		super(new VelocityBuilderJsonLoader());
	}

	@Test
	public void testJson_file() throws Exception {
		assertExpectation("classpath:/VelocityBuilder_file.json", "com.emarte.regurgitator.extensions.VelocityBuilder:[com.emarte.regurgitator.core.ValueSource:[null,'something something'],false]");
	}

	@Test
	public void testJson_source() throws Exception {
		assertExpectation("classpath:/VelocityBuilder_source.json", "com.emarte.regurgitator.extensions.VelocityBuilder:[com.emarte.regurgitator.core.ValueSource:[com.emarte.regurgitator.core.ContextLocation:['context:location'],null],false]");
	}

	@Test
	public void testJson_allContexts() throws Exception {
		assertExpectation("classpath:/VelocityBuilder_allContexts.json", "com.emarte.regurgitator.extensions.VelocityBuilder:[com.emarte.regurgitator.core.ValueSource:[null,'something something'],true]");
	}

	@Test
	public void testFullLoadJson() throws RegurgitatorException {
		loadFile("classpath:/VelocityBuilder_fullLoad.json");
	}
}
