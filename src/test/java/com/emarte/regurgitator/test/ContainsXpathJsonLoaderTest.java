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
	public void testJson() throws DocumentException, SAXException, IOException, RegurgitatorException {
		assertExpectation("classpath:/ContainsXpath.json", "com.emarte.regurgitator.extensions.ContainsXpath:[{this=http://something.com}]");
	}

	@Test
	public void testFullLoad() throws DocumentException, SAXException, IOException, RegurgitatorException {
		assertExpectationFullLoad("classpath:/ContainsXpath_fullLoad.json", "com.emarte.regurgitator.core.Sequence:['regurgitator-configuration-1',[com.emarte.regurgitator.core.Decision:['decision-1',[com.emarte.regurgitator.test.stuff.TestStep:['test-step-1']],[com.emarte.regurgitator.core.Rule:['rule-1',[com.emarte.regurgitator.core.Condition:['condition-1',com.emarte.regurgitator.core.ContextLocation:['context:location'],'/something/something',true,com.emarte.regurgitator.extensions.ContainsXpath:[{prefix1=url1, prefix2=url2}]]],'test-step-1']],com.emarte.regurgitator.core.FirstMatchBehaviour:[],null]],null]");
	}
}
