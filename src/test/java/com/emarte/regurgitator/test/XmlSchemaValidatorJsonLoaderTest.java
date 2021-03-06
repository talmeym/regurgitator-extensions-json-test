/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.extensions.XmlSchemaValidatorJsonLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static com.emarte.regurgitator.test.ExtensionsLoaderTestExpectations.XmlSchemaValidator;

public class XmlSchemaValidatorJsonLoaderTest extends JsonLoaderTest {
    public XmlSchemaValidatorJsonLoaderTest() {
        super(new XmlSchemaValidatorJsonLoader());
    }

    @Test
    public void testThis() throws Exception {
        assertExpectation("classpath:/XmlSchemaValidator.json", XmlSchemaValidator);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/XmlSchemaValidator_fullLoad.json");
    }
}
