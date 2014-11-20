Column_Rearange
=================

Column_Rearange is a simple java application that mainly focus on ordering of data items in a specific format. This application contains executable jar as well as code. 

Input
=================

This application need three parameters that process the data and return back with proper output

1 -> Map<String, String>

Map contains key and values. Here value in the format of data types such as INT,VARCHAR etc. 
Eg: 
Map<String, String> mapData = new HashMap<String, String>();
	mapData.put("ID", "INT");
	mapData.put("NAME", "VARCHAR");
	mapData.put("SALARY", "INT");
	mapData.put("DEPT", "VARCHAR");

2-> ARRANGE_TYPE 

It specifies type of arrangement order. Out put is based on this type.
Eg:
INT_INT, INT_STRING, STRING_INT, STRING_STRING

3-> int columnSize

It specifies how many number of columns in output

Output
==================

Its a list of columns with specified order
Eg:
List<string> columnList

Execute
==================

To user this application call Arrange.(Map<String, String> dataMap,ARRANGE_TYPE type, int columnSize) function with relevent parameters

Eg:
Map<String, String> mapData = new HashMap<String, String>();
	mapData.put("ID", "INT");
	mapData.put("NAME", "VARCHAR");
	mapData.put("SALARY", "INT");
	mapData.put("DEPT", "VARCHAR");
	System.out.println(mapData);
	List<String> list = Arrange.arrangeItem(mapData, ARRANGE_TYPE.STRING_INT, 2);
	System.out.print("After arrange::STRING-INT = ");
	System.out.print(list + "\n");



 


