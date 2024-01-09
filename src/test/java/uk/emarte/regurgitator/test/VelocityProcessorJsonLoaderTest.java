/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test;

import uk.emarte.regurgitator.extensions.VelocityProcessorJsonLoader;
import org.junit.Test;

import static uk.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static uk.emarte.regurgitator.test.ExtensionsLoaderTestExpectations.*;

public class VelocityProcessorJsonLoaderTest extends JsonLoaderTest {
    public VelocityProcessorJsonLoaderTest() {
        super(new VelocityProcessorJsonLoader());
    }

    @Test
    public void testValue() throws Exception {
        assertExpectation("classpath:/VelocityProcessor_value.json",  VelocityProcessor_value);
    }

    @Test
    public void testValueFlat() throws Exception {
        assertExpectation("classpath:/VelocityProcessor_valueFlat.json", VelocityProcessor_valueFlat);
    }

    @Test
    public void testFile() throws Exception {
        assertExpectation("classpath:/VelocityProcessor_file.json", VelocityProcessor_file);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/VelocityProcessor_fullLoad.json");
    }
}
