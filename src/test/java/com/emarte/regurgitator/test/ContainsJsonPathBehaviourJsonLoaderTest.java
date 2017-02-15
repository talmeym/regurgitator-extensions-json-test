package com.emarte.regurgitator.test;

import org.junit.Test;

public class ContainsJsonPathBehaviourJsonLoaderTest extends JsonLoaderTest {
	public ContainsJsonPathBehaviourJsonLoaderTest() {
		super(null);
	}

	@Test
	public void testFullLoad() throws Exception {
		assertExpectationFullLoad("classpath:/ContainsJsonPathBehaviour_fullLoad.json", "com.emarte.regurgitator.core.Sequence:['regurgitator-configuration-1',[com.emarte.regurgitator.core.Decision:['decision-1',[com.emarte.regurgitator.test.stuff.TestStep:['test-step-1']],[com.emarte.regurgitator.core.Rule:['rule-1',[com.emarte.regurgitator.core.Condition:['condition-1',com.emarte.regurgitator.core.ContextLocation:['context:location'],'$.something.something',true,com.emarte.regurgitator.extensions.ContainsJsonPathBehaviour:[]]],'test-step-1']],com.emarte.regurgitator.core.FirstMatchBehaviour:[],null]],null]");
	}
}
