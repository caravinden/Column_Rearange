package com.aravind.order;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.aravind.order.Arrange.ARRANGE_TYPE;

public class ArrangeTest {

	@Test
	public void test() {
		Map<String, String> mapData = new HashMap<String, String>();
		mapData.put("ID", "INT");
		mapData.put("NAME", "VARCHAR");
		mapData.put("SALARY", "INT");
		System.out.println(mapData);
		List<String> list = Arrange.arrangeItem(mapData, ARRANGE_TYPE.INT_INT, 2);
		System.out.print("After arrange::INT-INT = ");
		System.out.print(list + "\n");
		assertTrue(list.size()>0);
	}
	@Test
	public void test1() {
		Map<String, String> mapData = new HashMap<String, String>();
		mapData.put("ID", "INT");
		mapData.put("NAME", "VARCHAR");
		mapData.put("SALARY", "INT");
		mapData.put("DEPT", "VARCHAR");
		System.out.println(mapData);
		List<String> list = Arrange.arrangeItem(mapData, ARRANGE_TYPE.STRING_INT, 2);
		System.out.print("After arrange::STRING-INT = ");
		System.out.print(list + "\n");
		assertTrue(list.size()>0);
	}
	@Test
	public void test2() {
		Map<String, String> mapData = new HashMap<String, String>();
		mapData.put("ID", "INT");
		mapData.put("NAME", "VARCHAR");
		mapData.put("SALARY", "INT");
		mapData.put("DEPT", "VARCHAR");
		System.out.println(mapData);
		List<String> list = Arrange.arrangeItem(mapData, ARRANGE_TYPE.INT_STRING, 2);
		System.out.print("After arrange::INT-STRING = ");
		System.out.print(list + "\n");
		assertTrue(list.size()>0);
	}
	@Test
	public void test3() {
		Map<String, String> mapData = new HashMap<String, String>();
		mapData.put("ID", "INT");
		mapData.put("NAME", "VARCHAR");
		mapData.put("SALARY", "INT");
		mapData.put("DEPT", "VARCHAR");
		System.out.println(mapData);
		List<String> list = Arrange.arrangeItem(mapData, ARRANGE_TYPE.STRING_STRING, 2);
		System.out.print("After arrange::STRING-STRING = ");
		System.out.print(list + "\n");
		assertTrue(list.size()>0);
	}

}
