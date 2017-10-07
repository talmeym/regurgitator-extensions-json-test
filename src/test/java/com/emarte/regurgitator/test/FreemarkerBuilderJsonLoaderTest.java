/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
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
	public void testJson_file() throws Exception {
		assertExpectation("classpath:/FreemarkerBuilder_file.json", "com.emarte.regurgitator.extensions.FreemarkerBuilder:[com.emarte.regurgitator.core.ValueSource:[null,'something something'],false]");
	}

	@Test
	public void testJson_source() throws Exception {
		assertExpectation("classpath:/FreemarkerBuilder_source.json", "com.emarte.regurgitator.extensions.FreemarkerBuilder:[com.emarte.regurgitator.core.ValueSource:[com.emarte.regurgitator.core.ContextLocation:['context:location'],null],false]");
	}

	@Test
	public void testJson_allContexts() throws Exception {
		assertExpectation("classpath:/FreemarkerBuilder_allContexts.json", "com.emarte.regurgitator.extensions.FreemarkerBuilder:[com.emarte.regurgitator.core.ValueSource:[null,'something.something'],true]");
	}

	@Test
	public void testFullLoadJson() throws RegurgitatorException {
		loadFile("classpath:/FreemarkerBuilder_fullLoad.json");
	}
}
