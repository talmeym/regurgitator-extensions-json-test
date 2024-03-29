/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test;

import org.junit.Test;
import uk.emarte.regurgitator.extensions.FreemarkerProcessorJsonLoader;

import static uk.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static uk.emarte.regurgitator.test.ExtensionsLoaderTestExpectations.*;

public class FreemarkerProcessorJsonLoaderTest extends JsonLoaderTest {
    public FreemarkerProcessorJsonLoaderTest() {
        super(new FreemarkerProcessorJsonLoader());
    }

    @Test
    public void testValue() throws Exception {
        assertExpectation("classpath:/FreemarkerProcessor_value.json", FreemarkerProcessor_value);
    }

    @Test
    public void testValueFlat() throws Exception {
        assertExpectation("classpath:/FreemarkerProcessor_valueFlat.json", FreemarkerProcessor_valueFlat);
    }

    @Test
    public void testFile() throws Exception {
        assertExpectation("classpath:/FreemarkerProcessor_file.json", FreemarkerProcessor_file);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/FreemarkerProcessor_fullLoad.json");
    }
}
