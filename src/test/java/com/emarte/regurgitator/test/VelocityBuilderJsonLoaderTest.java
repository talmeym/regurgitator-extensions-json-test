package com.emarte.regurgitator.test;

import com.emarte.regurgitator.extensions.VelocityBuilderJsonLoader;
import org.junit.Test;

public class VelocityBuilderJsonLoaderTest extends JsonLoaderTest {
	public VelocityBuilderJsonLoaderTest() {
		super(new VelocityBuilderJsonLoader());
	}

	@Test
	public void testMinimumJson() throws Exception {
		assertExpectation("classpath:/VelocityBuilder.json", "com.emarte.regurgitator.extensions.VelocityBuilder:[com.emarte.regurgitator.core.ValueSource:[null,'something something']]");
	}
}
