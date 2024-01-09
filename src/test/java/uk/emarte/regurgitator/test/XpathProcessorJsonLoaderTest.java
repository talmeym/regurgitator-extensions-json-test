/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test;

import uk.emarte.regurgitator.extensions.XpathProcessorJsonLoader;
import org.junit.Test;

import static uk.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static uk.emarte.regurgitator.test.ExtensionsLoaderTestExpectations.XpathProcessor_max;
import static uk.emarte.regurgitator.test.ExtensionsLoaderTestExpectations.XpathProcessor_min;

public class XpathProcessorJsonLoaderTest extends JsonLoaderTest {
    public XpathProcessorJsonLoaderTest() {
        super(new XpathProcessorJsonLoader());
    }

    @Test
    public void testMinimum() throws Exception {
        assertExpectation("classpath:/XpathProcessor_min.json", XpathProcessor_min);
    }

    @Test
    public void testMaximum() throws Exception {
        assertExpectation("classpath:/XpathProcessor_max.json", XpathProcessor_max);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/XpathProcessor_fullLoad.json");
    }
}
