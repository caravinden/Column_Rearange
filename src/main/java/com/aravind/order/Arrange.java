/**
 * 
 */
package com.aravind.order;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * class that used to arrange data in a specific order. Suppose we have a map
 * contain different types of data with value types integer , character etc.
 * This class helps to arrange that data in a specific order in the form of
 * list, like List<Integer , Integer>, List<String , Integer>,List<Integer ,
 * String>, List<string , string>
 * 
 * @author aravind
 *
 */
public final class Arrange {

	/**
	 * Arrange out put list into enumerator format
	 *
	 */
	public static enum ARRANGE_TYPE {
		INT_INT, INT_STRING, STRING_INT, STRING_STRING
	}

	/**
	 * default constructor
	 */
	private Arrange() {

	}

	/**
	 * Function that helps to arrange given data into a specific format
	 * 
	 * @param dataMap
	 * @param TYPE
	 * @return {@link List}
	 */
	public static List<String> arrangeItem(Map<String, String> dataMap,
			ARRANGE_TYPE type, int columnSize) {

		List<String> columnList = new ArrayList<String>();
		switch (type) {
		case INT_INT:
			dataMap.keySet().stream().forEach(e -> {
				String dataType = (String) dataMap.get(e);
				// System.out.println(dataType);
					if (dataType.contains("INT")) {
						if (columnList.size() < columnSize) {
							columnList.add(e);
						}
					}
				});
			break;

		case INT_STRING:
			dataMap.keySet().stream().forEach(e -> {
				String dataType = (String) dataMap.get(e);
				// System.out.println(dataType);
					if (dataType.contains("INT")) {
						if (columnList.size() < (columnSize - 1)) {
							columnList.add(e);
						}
					}
				});
			dataMap.keySet().stream().forEach(e -> {
				String dataType = (String) dataMap.get(e);
				// System.out.println(dataType);
					if (dataType.contains("VARCHAR")) {
						if (columnList.size() < columnSize) {
							columnList.add(e);
						}
					}
				});

			break;
		case STRING_INT:
			dataMap.keySet().stream().forEach(e -> {
				String dataType = (String) dataMap.get(e);
				// System.out.println(dataType);
					if (dataType.contains("VARCHAR")) {
						if (columnList.size() < (columnSize - 1)) {
							columnList.add(e);
						}
					}
				});
			dataMap.keySet().stream().forEach(e -> {
				String dataType = (String) dataMap.get(e);
				// System.out.println(dataType);
					if (dataType.contains("INT")) {
						if (columnList.size() < columnSize) {
							columnList.add(e);
						}
					}
				});

			break;
		case STRING_STRING:
			dataMap.keySet().stream().forEach(e -> {
				String dataType = (String) dataMap.get(e);
				// System.out.println(dataType);
					if (dataType.contains("VARCHAR")) {
						if (columnList.size() < columnSize) {
							columnList.add(e);
						}
					}
				});
			break;
		default:
			System.out.println("Invalid type!!!");
			break;
		}
		return columnList;
	}
}
