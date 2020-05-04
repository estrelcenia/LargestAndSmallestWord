package com.app.programs;

import org.testng.annotations.Test;

public class SmallestWordInStringWithCount {

	BaseClass baseClass;

	/**
	 * /Provide only String [a-zA-Z_0-9]. it will give you smallest word and it's
	 * count
	 */

	@Test
	public void getLargestWordWithCountTest() {
		baseClass = new BaseClass();
		String str = "The cow jumped over the moon.";
		baseClass.getTheSmallestWordAndCount(str);

	}

}
