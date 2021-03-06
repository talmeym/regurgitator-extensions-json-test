/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.extensions.JsonPrintProcessorJsonLoader;
import org.junit.Test;

import static com.emarte.regurgitator.test.ExtensionsLoaderTestExpectations.JsonPrintProcessor;
import static com.emarte.regurgitator.test.ExtensionsLoaderTestExpectations.JsonPrintProcessor_fullLoad;

public class JsonPrintProcessorJsonLoaderTest extends JsonLoaderTest {
    public JsonPrintProcessorJsonLoaderTest() {
        super(new JsonPrintProcessorJsonLoader());
    }

    @Test
    public void testThis() throws Exception {
        assertExpectation("classpath:/JsonPrintProcessor.json", JsonPrintProcessor);
    }

    @Test
    public void testFullLoad() throws Exception {
        assertExpectationFullLoad("classpath:/JsonPrintProcessor_fullLoad.json", JsonPrintProcessor_fullLoad);
    }
}
