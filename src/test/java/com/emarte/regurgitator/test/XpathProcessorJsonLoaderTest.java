package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.*;
import com.emarte.regurgitator.extensions.XpathProcessorJsonLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;

public class XpathProcessorJsonLoaderTest extends JsonLoaderTest {
	public XpathProcessorJsonLoaderTest() {
		super(new XpathProcessorJsonLoader());
	}

	@Test
	public void testJson() throws Exception {
		assertExpectation("classpath:/XpathProcessor.json", "com.emarte.regurgitator.extensions.XpathProcessor:['xpath/xpath',{prefix2=uri2, prefix1=uri1}]");
	}

	@Test
	public void testMinimumJson() throws Exception {
		assertExpectation("classpath:/XpathProcessor_min.json", "com.emarte.regurgitator.extensions.XpathProcessor:['xpath/xpath',{prefix2=uri2, prefix1=uri1}]");
	}

	@Test
	public void testFullLoad() throws RegurgitatorException {
		loadFile("classpath:/XpathProcessor_fullLoad.json");
	}
}
