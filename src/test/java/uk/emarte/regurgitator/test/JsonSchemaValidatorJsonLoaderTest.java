/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test;

import org.junit.Test;
import uk.emarte.regurgitator.extensions.JsonSchemaValidatorJsonLoader;

import static uk.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static uk.emarte.regurgitator.test.ExtensionsLoaderTestExpectations.JsonSchemaValidator;

public class JsonSchemaValidatorJsonLoaderTest extends JsonLoaderTest {
    public JsonSchemaValidatorJsonLoaderTest() {
        super(new JsonSchemaValidatorJsonLoader());
    }

    @Test
    public void testValidator() throws Exception {
        assertExpectation("classpath:/JsonSchemaValidator.json", JsonSchemaValidator);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/JsonSchemaValidator_fullLoad.json");
    }
}
