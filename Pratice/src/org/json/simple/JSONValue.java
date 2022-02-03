package org.json.simple;

import java.util.HashMap;
import java.util.Map;  
public class JSONValue{    
public static void main(String args[]){    
  Map obj=new HashMap();    
  obj.put("name","sonoo");    
  obj.put("age",new Integer(27));    
  obj.put("salary",new Double(600000));   
  String jsonText = JSONValue.toJSONString(obj);  
  System.out.print(jsonText);  
}

private static String toJSONString(Map obj) {
	// TODO Auto-generated method stub
	return null;
}}   