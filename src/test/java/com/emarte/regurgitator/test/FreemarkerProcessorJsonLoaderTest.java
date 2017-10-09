/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.RegurgitatorException;
import com.emarte.regurgitator.extensions.FreemarkerProcessorJsonLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;

public class FreemarkerProcessorJsonLoaderTest extends JsonLoaderTest {
    public FreemarkerProcessorJsonLoaderTest() {
        super(new FreemarkerProcessorJsonLoader());
    }

    @Test
    public void testJson_value() throws Exception {
        assertExpectation("classpath:/FreemarkerProcessor_value.json", "com.emarte.regurgitator.extensions.FreemarkerProcessor:['something something']");
    }

    @Test
    public void testJson_file() throws Exception {
        assertExpectation("classpath:/FreemarkerProcessor_file.json", "com.emarte.regurgitator.extensions.FreemarkerProcessor:['something something']");
    }

    @Test
    public void testFullLoad() throws RegurgitatorException {
        loadFile("classpath:/FreemarkerProcessor_fullLoad.json");
    }
}
