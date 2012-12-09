package com.example.engenialaccount.test;

import com.example.engenialaccount.MainActivity;
import com.jayway.android.robotium.solo.Solo;

import android.test.ActivityInstrumentationTestCase2;

public class MainActivityTests extends
		ActivityInstrumentationTestCase2<MainActivity> {
	
	private Solo solo;

	public MainActivityTests() {
		super(MainActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
		solo = new Solo(getInstrumentation(), getActivity());
	}
	
	public void testSendMessageButton()
	{
		solo.assertCurrentActivity("Test main act", MainActivity.class);
	}

}
