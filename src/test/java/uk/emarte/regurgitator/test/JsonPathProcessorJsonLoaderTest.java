/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test;

import org.junit.Test;
import uk.emarte.regurgitator.extensions.JsonPathProcessorJsonLoader;

import static uk.emarte.regurgitator.test.ExtensionsLoaderTestExpectations.JsonPathProcessor;
import static uk.emarte.regurgitator.test.ExtensionsLoaderTestExpectations.JsonPathProcessor_fullLoad;

public class JsonPathProcessorJsonLoaderTest extends JsonLoaderTest {
    public JsonPathProcessorJsonLoaderTest() {
        super(new JsonPathProcessorJsonLoader());
    }

    @Test
    public void testThis() throws Exception {
        assertExpectation("classpath:/JsonPathProcessor.json", JsonPathProcessor);
    }

    @Test
    public void testFullLoad() throws Exception {
        assertExpectationFullLoad("classpath:/JsonPathProcessor_fullLoad.json", JsonPathProcessor_fullLoad);
    }
}
