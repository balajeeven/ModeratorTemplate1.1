package com.bitwiseglobal.propertyUtil;

import java.util.Properties;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.bitwiseglobal.properties.PropertyReader;
import com.bitwiseglobal.propertyUtility.ObjectBuilder;


public class ModeratorTest {
	ObjectBuilder ob;
	@Before
	public void itShouldRunBeforeAll() {
		Properties pr=PropertyReader.getProperties();
		ob=new ObjectBuilder(pr);
	}
	@Test
	public void itShouldReturnCorrectSum() {
		String o=ob.evaluateEntryFunction("40 40 /");
		System.out.println(o);
		//Assert.assertTrue(Integer.parseInt(o)==50);
	}

	@Test
	public void itShouldReturnCorrectSub() {
		String o=ob.evaluateEntryFunction("10 40 -");
		System.out.println(o);
		Assert.assertTrue(Integer.parseInt(o)==-30);
	}

	@Test
	public void itShouldReturnCorrectProduct() {
		String o=ob.evaluateEntryFunction("10 40 *");
		System.out.println(o);
		Assert.assertTrue(Integer.parseInt(o)==400);
	}

	@Test
	public void itShouldReturnCorrectDivide() {
		String o=ob.evaluateEntryFunction("10 40 /");
		System.out.println(o);
		Assert.assertTrue(Integer.parseInt(o)==0);
	}

	@Test
	public void itShouldReturnCorrectModulo() {
		String o=ob.evaluateEntryFunction("10 40 %");
		System.out.println(o);
		Assert.assertTrue(Integer.parseInt(o)==10);
	}

}
