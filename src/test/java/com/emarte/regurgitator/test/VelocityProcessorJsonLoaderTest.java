/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.RegurgitatorException;
import com.emarte.regurgitator.extensions.VelocityProcessorJsonLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;

public class VelocityProcessorJsonLoaderTest extends JsonLoaderTest {
    public VelocityProcessorJsonLoaderTest() {
        super(new VelocityProcessorJsonLoader());
    }

    @Test
    public void testXml_valueString() throws Exception {
        assertExpectation("classpath:/VelocityProcessor_valueString.json", "com.emarte.regurgitator.extensions.VelocityProcessor:['{\"something\":\"${something}\"}']");
    }

    @Test
    public void testXml_valueJson() throws Exception {
        assertExpectation("classpath:/VelocityProcessor_valueJson.json", "com.emarte.regurgitator.extensions.VelocityProcessor:['{\"something\":\"${something}\",\"somethingElse\":45}']");
    }

    @Test
    public void testXml_file() throws Exception {
        assertExpectation("classpath:/VelocityProcessor_file.json", "com.emarte.regurgitator.extensions.VelocityProcessor:['something something']");
    }

    @Test
    public void testFullLoad() throws RegurgitatorException {
        loadFile("classpath:/VelocityProcessor_fullLoad.json");
    }
}
