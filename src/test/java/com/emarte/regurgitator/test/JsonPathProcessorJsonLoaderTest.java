/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.RegurgitatorException;
import com.emarte.regurgitator.extensions.JsonPathProcessorJsonLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;

public class JsonPathProcessorJsonLoaderTest extends JsonLoaderTest {
	public JsonPathProcessorJsonLoaderTest() {
		super(new JsonPathProcessorJsonLoader());
	}

	@Test
	public void testMinimumJson() throws Exception {
		assertExpectation("classpath:/JsonPathProcessor.json", "com.emarte.regurgitator.extensions.JsonPathProcessor:['something.something']");
	}

	@Test
	public void testFullLoad() throws RegurgitatorException {
		loadFile("classpath:/JsonPathProcessor_fullLoad.json");
	}
}
