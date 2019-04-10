/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.extensions.FreemarkerBuilderJsonLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static com.emarte.regurgitator.test.ExtensionsLoaderTestExpectations.*;

public class FreemarkerBuilderJsonLoaderTest extends JsonLoaderTest {
    public FreemarkerBuilderJsonLoaderTest() {
        super(new FreemarkerBuilderJsonLoader());
    }

    @Test
    public void testValue() throws Exception {
        assertExpectation("classpath:/FreemarkerBuilder_value.json", FreemarkerBuilder_value);
    }

    @Test
    public void testValueFlat() throws Exception {
        assertExpectation("classpath:/FreemarkerBuilder_valueFlat.json", FreemarkerBuilder_valueFlat);
    }

    @Test
    public void testFile() throws Exception {
        assertExpectation("classpath:/FreemarkerBuilder_file.json", FreemarkerBuilder_file);
    }

    @Test
    public void testSource() throws Exception {
        assertExpectation("classpath:/FreemarkerBuilder_source.json", FreemarkerBuilder_source);
    }

    @Test
    public void testAllContexts() throws Exception {
        assertExpectation("classpath:/FreemarkerBuilder_allContexts.json", FreemarkerBuilder_allContexts);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/FreemarkerBuilder_fullLoad.json");
    }
}
