package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.RegurgitatorException;
import com.emarte.regurgitator.extensions.ContainsXpathJsonLoader;
import org.dom4j.DocumentException;
import org.junit.Test;
import org.xml.sax.SAXException;

import java.io.IOException;

public class ContainsXpathJsonLoaderTest extends JsonLoaderTest {
	public ContainsXpathJsonLoaderTest() {
		super(new ContainsXpathJsonLoader());
	}

	@Test
	public void testMinJson() throws DocumentException, SAXException, IOException, RegurgitatorException {
		assertExpectation("classpath:/ContainsXpath_min.json", "com.emarte.regurgitator.extensions.ContainsXpath:[{this=http://something.com}]");
	}

	@Test
	public void testMaxJson() throws DocumentException, SAXException, IOException, RegurgitatorException {
		assertExpectation("classpath:/ContainsXpath_max.json", "com.emarte.regurgitator.extensions.ContainsXpath:[{this=http://something.com}]");
	}

	@Test
	public void testFullLoad() throws DocumentException, SAXException, IOException, RegurgitatorException {
		assertExpectationFullLoad("classpath:/ContainsXpath_fullLoad.json", "com.emarte.regurgitator.core.Sequence:['regurgitator-configuration-1',[com.emarte.regurgitator.core.Decision:['decision-1',[com.emarte.regurgitator.test.stuff.TestStep:['test-step-1']],[com.emarte.regurgitator.core.Rule:['rule-1',[com.emarte.regurgitator.core.Condition:['condition-1',com.emarte.regurgitator.core.ContextLocation:['context:location'],'/something/something',true,com.emarte.regurgitator.extensions.ContainsXpath:[{prefix2=url2, prefix1=url1}]]],'test-step-1']],com.emarte.regurgitator.core.FirstMatchBehaviour:[],null]],null]");
	}

	@Test
	public void testFullLoad_entityLookup() throws DocumentException, SAXException, IOException, RegurgitatorException {
		assertExpectationFullLoad("classpath:/ContainsXpath_fullLoad_entityLookup.json", "com.emarte.regurgitator.core.Sequence:['regurgitator-configuration-1',[com.emarte.regurgitator.core.Decision:['decision-1',[com.emarte.regurgitator.test.stuff.TestStep:['test-step-1']],[com.emarte.regurgitator.core.Rule:['rule-1',[com.emarte.regurgitator.core.Condition:['condition-1',com.emarte.regurgitator.core.ContextLocation:['context:location'],'/something/something',true,com.emarte.regurgitator.extensions.ContainsXpath:[{}]]],'test-step-1']],com.emarte.regurgitator.core.FirstMatchBehaviour:[],null]],null]");
	}
}
