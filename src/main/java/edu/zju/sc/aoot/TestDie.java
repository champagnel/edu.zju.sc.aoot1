package edu.zju.sc.aoot;

import junit.framework.Assert;


import org.junit.Test;

public class TestDie {

	@Test
	public void testConstructor(){
		Die die = new Die(6);
		int temp = die.numOfSide();
		Assert.assertEquals(temp, 6);
	}
}
