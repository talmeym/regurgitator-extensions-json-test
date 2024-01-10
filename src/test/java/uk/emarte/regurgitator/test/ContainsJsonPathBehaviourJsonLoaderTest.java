/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test;

import org.junit.Test;

import static uk.emarte.regurgitator.test.ExtensionsLoaderTestExpectations.ContainsJsonPathBehaviour_fullLoad;

public class ContainsJsonPathBehaviourJsonLoaderTest extends JsonLoaderTest {
    public ContainsJsonPathBehaviourJsonLoaderTest() {
        super(null);
    }

    @Test
    public void testFullLoad() throws Exception {
        assertExpectationFullLoad("classpath:/ContainsJsonPathBehaviour_fullLoad.json", ContainsJsonPathBehaviour_fullLoad);
    }
}
