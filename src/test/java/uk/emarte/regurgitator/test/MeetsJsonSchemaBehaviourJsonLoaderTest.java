/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test;

import org.junit.Test;

import static uk.emarte.regurgitator.test.ExtensionsLoaderTestExpectations.MeetsJsonSchemaBehaviour_fullLoad;

public class MeetsJsonSchemaBehaviourJsonLoaderTest extends JsonLoaderTest {
    public MeetsJsonSchemaBehaviourJsonLoaderTest() {
        super(null);
    }

    @Test
    public void testFullLoad() throws Exception {
        assertExpectationFullLoad("classpath:/MeetsJsonSchemaBehaviour_fullLoad.json", MeetsJsonSchemaBehaviour_fullLoad);
    }
}
