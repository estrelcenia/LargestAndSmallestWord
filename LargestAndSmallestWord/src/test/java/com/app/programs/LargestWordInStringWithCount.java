package com.app.programs;

import org.testng.annotations.Test;

public class LargestWordInStringWithCount {

	BaseClass baseClass;



	/**
	 * Provide only String [a-zA-Z_0-9]. it will give you largest word and it's
	 * count
	 */

	@Test
	public void getLargestWordWithCountTest() {
		baseClass = new BaseClass();
		String str = "The cow jumped over the moon.";
		baseClass.LargestWordInStringWithCount(str);

	}

}
