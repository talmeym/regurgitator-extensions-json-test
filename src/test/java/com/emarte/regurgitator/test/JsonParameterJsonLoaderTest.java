/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.extensions.JsonParameterJsonLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static com.emarte.regurgitator.test.ExtensionsLoaderTestExpectations.*;

public class JsonParameterJsonLoaderTest extends JsonLoaderTest {
    public JsonParameterJsonLoaderTest() {
        super(new JsonParameterJsonLoader());
    }

    @Test
    public void testMinimum() throws Exception {
        assertExpectation("classpath:/JsonParameter_min.json", JsonParameter_min);
    }

    @Test
    public void testMaximum() throws Exception {
        assertExpectation("classpath:/JsonParameter_max.json", JsonParameter_max);
    }

    @Test
    public void testMaximumFlat() throws Exception {
        assertExpectation("classpath:/JsonParameter_maxFlat.json", JsonParameter_maxFlat);
    }

    @Test
    public void testMultipleProcessors() throws Exception {
        assertExpectation("classpath:/JsonParameter_multipleProcessors.json", JsonParameter_multipleProcessors);
    }

    @Test
    public void testMultipleProcessorsFlat() throws Exception {
        assertExpectation("classpath:/JsonParameter_multipleProcessorsFlat.json", JsonParameter_multipleProcessorsFlat);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/JsonParameter_fullLoad.json");
    }
}
