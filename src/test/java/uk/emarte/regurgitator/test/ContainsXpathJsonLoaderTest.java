/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test;

import org.junit.Test;
import uk.emarte.regurgitator.extensions.ContainsXpathJsonLoader;

import static uk.emarte.regurgitator.test.ExtensionsLoaderTestExpectations.*;

public class ContainsXpathJsonLoaderTest extends JsonLoaderTest {
    public ContainsXpathJsonLoaderTest() {
        super(new ContainsXpathJsonLoader());
    }

    @Test
    public void testMinimum() throws Exception {
        assertExpectation("classpath:/ContainsXpathBehaviour_min.json", ContainsXpathBehaviour_min);
    }

    @Test
    public void testMaximum() throws Exception {
        assertExpectation("classpath:/ContainsXpathBehaviour_max.json", ContainsXpathBehaviour_max);
    }

    @Test
    public void testFullLoad() throws Exception {
        assertExpectationFullLoad("classpath:/ContainsXpathBehaviour_fullLoad.json", ContainsXpathBehaviour_fullLoad);
    }

    @Test
    public void testFullLoad_entityLookup() throws Exception {
        assertExpectationFullLoad("classpath:/ContainsXpathBehaviour_fullLoad_entityLookup.json", ContainsXpathBehaviour_fullLoad_entityLookup);
    }
}
