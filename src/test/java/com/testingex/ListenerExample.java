package com.testingex;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerExample implements ITestListener {

	@Override
public void onTestSuccess(ITestResult result) {
	// TODO Auto-generated method stub
	System.out.println("==================Test started=====================");
	
}
}
