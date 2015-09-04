package com.mayank.batch;

import org.springframework.batch.item.ItemProcessor;

public class TestResultItemProcessor implements ItemProcessor<TestResult, TestResult> {

	public TestResult process(TestResult result) throws Exception {
		//TODO data conversion to be done here
		return result;
	}

}
