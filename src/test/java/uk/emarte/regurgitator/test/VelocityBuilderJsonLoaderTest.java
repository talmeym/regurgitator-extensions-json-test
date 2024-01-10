/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test;

import org.junit.Test;
import uk.emarte.regurgitator.extensions.VelocityBuilderJsonLoader;

import static uk.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static uk.emarte.regurgitator.test.ExtensionsLoaderTestExpectations.*;

public class VelocityBuilderJsonLoaderTest extends JsonLoaderTest {
    public VelocityBuilderJsonLoaderTest() {
        super(new VelocityBuilderJsonLoader());
    }

    @Test
    public void testValue() throws Exception {
        assertExpectation("classpath:/VelocityBuilder_value.json", VelocityBuilder_value);
    }

    @Test
    public void testValueFlat() throws Exception {
        assertExpectation("classpath:/VelocityBuilder_valueFlat.json", VelocityBuilder_valueFlat);
    }

    @Test
    public void testFile() throws Exception {
        assertExpectation("classpath:/VelocityBuilder_file.json", VelocityBuilder_file);
    }

    @Test
    public void testSource() throws Exception {
        assertExpectation("classpath:/VelocityBuilder_source.json", VelocityBuilder_source);
    }

    @Test
    public void testAllContexts() throws Exception {
        assertExpectation("classpath:/VelocityBuilder_allContexts.json", VelocityBuilder_allContexts);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/VelocityBuilder_fullLoad.json");
    }
}
