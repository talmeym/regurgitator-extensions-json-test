/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test;

import org.junit.Test;
import uk.emarte.regurgitator.extensions.XmlParameterJsonLoader;

import static uk.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static uk.emarte.regurgitator.test.ExtensionsLoaderTestExpectations.*;

public class XmlParameterJsonLoaderTest extends JsonLoaderTest {
    public XmlParameterJsonLoaderTest() {
        super(new XmlParameterJsonLoader());
    }

    @Test
    public void testMinimum() throws Exception {
        assertExpectation("classpath:/XmlParameter_min.json", XmlParameter_min);
    }

    @Test
    public void testMaximum() throws Exception {
        assertExpectation("classpath:/XmlParameter_max.json", XmlParameter_max);
    }

    @Test
    public void testMaximumFlat() throws Exception {
        assertExpectation("classpath:/XmlParameter_maxFlat.json", XmlParameter_maxFlat);
    }

    @Test
    public void testMultipleProcessors() throws Exception {
        assertExpectation("classpath:/XmlParameter_multipleProcessors.json", XmlParameter_multipleProcessors);
    }

    @Test
    public void testMultipleProcessorsFlat() throws Exception {
        assertExpectation("classpath:/XmlParameter_multipleProcessorsFlat.json", XmlParameter_multipleProcessorsFlat);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/XmlParameter_fullLoad.json");
    }
}
